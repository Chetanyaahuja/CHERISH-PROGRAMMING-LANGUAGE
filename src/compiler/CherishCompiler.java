package src.compiler;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

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
            intermediateCodeGenerator.addIntermediateOutput("ADD " + lowercase);
        return null;
    }

    @Override
    public Object visitBooleanAssign(CherishParser.BooleanAssignContext ctx) {
        String bool = ctx.LOWERCASE().getText();
        visit(ctx.boolExp());
        intermediateCodeGenerator.addIntermediateOutput("ADD " + bool);
        return null;
    }

    @Override
    public Object visitComparison(CherishParser.ComparisonContext ctx) {
        return super.visitComparisonContext(ctx);
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
        intermediateCodeGenerator.addIntermediateOutput("ADD " + val);
        return super.visitCheckBoolean(ctx);
    }

    @Override
    public Object visitBooleanExpression(CherishParser.BooleanExpressionContext ctx) {
        return super.visitBooleanExpression(ctx);
    }



    @Override
    public Object visitAddExp(CherishParser.AddExpContext ctx) {
        	visit(ctx.term());
        	intermediateCodeGenerator.addIntermediateOutput("ADD A");
        	visit(ctx.arithExp());
        	intermediateCodeGenerator.addIntermediateOutput("ADD B");
        	String sum = ctx.getText();
        	intermediateCodeGenerator.addIntermediateOutput(sum);
        return null;
    }

    @Override
    public Object visitSubExp(CherishParser.SubExpContext ctx) {
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD A");
        visit(ctx.arithExp());
        intermediateCodeGenerator.addIntermediateOutput("ADD B");
        String diff = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(diff);
        return null;

    }

    @Override
    public Object visitTermF(CherishParser.TermFContext ctx) {
        if(ctx.term() != null){
            intermediateCodeGenerator.addIntermediateOutput("ADD ");
        }
        return null;
    }

    @Override
    public Object visitMulExp(CherishParser.MulExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B");
        String multiply = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput("MULTIPLY A B");
        return null;
    }

    @Override
    public Object visitDivExp(CherishParser.DivExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B");
        String divide = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(divide);
        return null;
    }

    @Override
    public Object visitModExp(CherishParser.ModExpContext ctx) {
        visit(ctx.factor());
        intermediateCodeGenerator.addIntermediateOutput("ADD A");
        visit(ctx.term());
        intermediateCodeGenerator.addIntermediateOutput("ADD B");
        String mod = ctx.getText();
        intermediateCodeGenerator.addIntermediateOutput(mod );
        return null;
    }

    @Override
    public Object visitFactorT(CherishParser.FactorTContext ctx) {
        if(ctx.factor() != null){
            intermediateCodeGenerator.addIntermediateOutput("ADD ");
        }
        return null;
    }

    @Override
    public Object visitNumeralFactor(CherishParser.NumeralFactorContext ctx) {
        if(ctx.NUMERAL() != null) {
            intermediateCodeGenerator.addIntermediateOutput("ADD " + ctx.NUMERAL().getText());
        }
        return null;
    }

    @Override
    public Object visitWordFactor(CherishParser.WordFactorContext ctx) {
       if (ctx.LOWERCASE() != null) {
           intermediateCodeGenerator.addIntermediateOutput("ADD " + ctx.LOWERCASE().getText());
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
            intermediateCodeGenerator.addIntermediateOutput("DISPLAY ");
        }
         return null;
    }
}