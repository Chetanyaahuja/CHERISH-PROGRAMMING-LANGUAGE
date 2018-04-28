package src.compiler;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * 
 */

public class CherishCompiler extends CherishBaseVisitor {

    private class ICGenerator {
        private String ICOutput = "";
        private void addIntermediateOutput(String output) {
            this.ICOutput += output + "\n";
        }
    }

    private ICGenerator intermediateCodeGenerator = new ICGenerator();

    public String getICOutput() {
        return intermediateCodeGenerator.ICOutput;
    }

    @Override
    public Object visitProgBlock(CherishParser.ProgBlockContext ctx) {
        return super.visitProgBlock(ctx);
    }

    @Override
    public Object visitProgCode(CherishParser.ProgCodeContext ctx) {
        return super.visitProgCode(ctx);
    }

    @Override
    public Object visitStatements(CherishParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public Object visitIntegerAssign(CherishParser.IntegerAssignContext ctx) {
        String lowercase = ctx.LOWERCASE().getText();
            visit(ctx.arithExp());
            intermediateCodeGenerator.addIntermediateOutput("ADD " + lowercase + " REGISTER");
        return null;
    }

    @Override
    public Object visitBooleanAssign(CherishParser.BooleanAssignContext ctx) {
        String bool = ctx.LOWERCASE().getText();
        visit(ctx.boolExp());
        intermediateCodeGenerator.addIntermediateOutput("ADD " + bool + " REGISTER");
        return null;
    }

    @Override
    public Object visitComparison(CherishParser.ComparisonContext ctx) {
        if(ctx.comparator() != null){
            intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER" );
        }
        return null;
    }

    @Override
    public Object visitCheckLowercase(CherishParser.CheckLowercaseContext ctx) {
        return super.visitCheckLowercase(ctx);
    }

    @Override
    public Object visitBooleanAndOr(CherishParser.BooleanAndOrContext ctx) {

        return super.visitBooleanAndOr(ctx);
    }

    @Override
    public Object visitCheckBoolean(CherishParser.CheckBooleanContext ctx) {
        String val = ctx.BOOLEAN().getText();
        boolean bol;
        if(val == "true") {
            bol = true;
        }
        else {
            bol = false;
        }
        if (ctx.getText() != null) {
            bol = !bol;
        }
        intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER " + val);
        return super.visitCheckBoolean(ctx);
    }

    @Override
    public Object visitBooleanExpression(CherishParser.BooleanExpressionContext ctx) {
        return super.visitBooleanExpression(ctx);
    }



    @Override
    public Object visitAddExp(CherishParser.AddExpContext ctx) {
        	visit(ctx.term());
        	intermediateCodeGenerator.addIntermediateOutput("ADD A REGISTER");
        	visit(ctx.arithExp());
        	intermediateCodeGenerator.addIntermediateOutput("ADD B REGISTER");
        	String sum = ctx.getText();
        	intermediateCodeGenerator.addIntermediateOutput(sum);
        return null;
    }

    @Override
    public Object visitSubExp(CherishParser.SubExpContext ctx) {
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD A REGISTER");
        visit(ctx.arithExp());
        intermediateCodeGenerator.addIntermediateOutput("ADD B REGISTER");
        String diff = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(diff);
        return null;

    }

    @Override
    public Object visitTermF(CherishParser.TermFContext ctx) {
        if(ctx.term() != null){
            intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER" );
        }
        return null;
    }

    @Override
    public Object visitMulExp(CherishParser.MulExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A REGISTER");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B REGISTER");
        String multiply = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(" MULTIPLY A B");
        return null;
    }

    @Override
    public Object visitDivExp(CherishParser.DivExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A REGISTER");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B REGISTER");
        String divide = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(divide);
        return null;
    }

    @Override
    public Object visitModExp(CherishParser.ModExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A REGISTER");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B REGISTER");
        String mod = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(mod );
        return null;
    }

    @Override
    public Object visitFactorT(CherishParser.FactorTContext ctx) {
        if(ctx.factor() != null){
            intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER ");
        }
        return null;
    }

    @Override
    public Object visitNumeralFactor(CherishParser.NumeralFactorContext ctx) {
        if(ctx.NUMERAL() != null) {
            intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER " + ctx.NUMERAL().getText());
        }
        return null;
    }

    @Override
    public Object visitWordFactor(CherishParser.WordFactorContext ctx) {
       if (ctx.LOWERCASE() != null) {
           intermediateCodeGenerator.addIntermediateOutput("ADD REGISTER " + ctx.LOWERCASE().getText());
       }
       return null;
    }

    @Override
    public Object visitConditionalExp(CherishParser.ConditionalExpContext ctx) {
        intermediateCodeGenerator.addIntermediateOutput("START IF CONDITION");
        visit(ctx.boolExp());
        visit(ctx.progCode());
        intermediateCodeGenerator.addIntermediateOutput("END IF CONDITION");
        if(ctx.elseCondition() != null){
            visit(ctx.elseCondition());
        }
        return null;
    }

    @Override
    public Object visitElseCondition(CherishParser.ElseConditionContext ctx) {
        intermediateCodeGenerator.addIntermediateOutput("START ELSE CONDITION");
        visit(ctx.progCode());
        intermediateCodeGenerator.addIntermediateOutput("END ELSE CONDITION");
        return super.visitElseCondition(ctx);
    }

    @Override
    public Object visitIterationExp(CherishParser.IterationExpContext ctx) {
        intermediateCodeGenerator.addIntermediateOutput("START WHILE");
        visit(ctx.boolExp());
        visit(ctx.progCode());
        intermediateCodeGenerator.addIntermediateOutput("END WHILE");
        return null;
    }


    @Override
    public Object visitDisplayStatement(CherishParser.DisplayStatementContext ctx) {
        if (ctx.NUMERAL() != null) {
            intermediateCodeGenerator.addIntermediateOutput("DISPLAY " + ctx.NUMERAL().getText());
        } else if (ctx.LOWERCASE() != null) {
            intermediateCodeGenerator.addIntermediateOutput("DISPLAY " + ctx.LOWERCASE().getText());
        } else if (ctx.BOOLEAN() != null) {
            intermediateCodeGenerator.addIntermediateOutput("DISPLAY " + ctx.BOOLEAN().getText());
        }
        else if (ctx.arithExp() != null){
            visit(ctx.arithExp());
            intermediateCodeGenerator.addIntermediateOutput("DISPLAY REGISTER");
        }
         return null;
    }
}
