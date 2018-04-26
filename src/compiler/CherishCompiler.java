package src.compiler;

/**
 * @author Natalya Kumar
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
    public Object visitVarDecl(CherishParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Object visitStatements(CherishParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public Object visitVarAssign(CherishParser.VarAssignContext ctx) {
        String identifier = ctx.word().getText();
        visit(ctx.numeral());
        intermediateCodeGenerator.addIntermediateOutput("ADD " + identifier + " REG");
        return null;
    }

    @Override
    public Object visitCharAssign(CherishParser.CharAssignContext ctx) {
        String identifier = ctx.word().getText();
        visit(ctx.wordNew());
        intermediateCodeGenerator.addIntermediateOutput("ADD " + identifier + " REG");
        return null;
    }

    @Override
    public Object visitAssignStatement(CherishParser.AssignStatementContext ctx) {
        String identifier = ctx.word().getText();
        if(ctx.arithExp() != null){
            visit(ctx.arithExp());
        }
        intermediateCodeGenerator.addIntermediateOutput("ADD " + identifier + " REG");
        return null;
    }

    @Override
    public Object visitWord(CherishParser.WordContext ctx) {
        //String identifier = ctx.
        return super.visitWord(ctx);
    }

    @Override
    public Object visitAlphanumeral(CherishParser.AlphanumeralContext ctx) {
        return super.visitAlphanumeral(ctx);
    }

    @Override
    public Object visitSymbol(CherishParser.SymbolContext ctx) {
        return super.visitSymbol(ctx);
    }

    @Override
    public Object visitAlphabet(CherishParser.AlphabetContext ctx) {
        return super.visitAlphabet(ctx);
    }

    @Override
    public Object visitArithExp(CherishParser.ArithExpContext ctx) {
        return super.visitArithExp(ctx);
    }

    @Override
    public Object visitTerm(CherishParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitFactor(CherishParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitUnary(CherishParser.UnaryContext ctx) {
        return super.visitUnary(ctx);
    }

    @Override
    public Object visitConditionalExp(CherishParser.ConditionalExpContext ctx) {
        return super.visitConditionalExp(ctx);
    }

    @Override
    public Object visitIterationExp(CherishParser.IterationExpContext ctx) {
        return super.visitIterationExp(ctx);
    }

    @Override
    public Object visitSingleExp(CherishParser.SingleExpContext ctx) {
        return super.visitSingleExp(ctx);
    }

    @Override
    public Object visitRelativeExp(CherishParser.RelativeExpContext ctx) {
        return super.visitRelativeExp(ctx);
    }

    @Override
    public Object visitOperator(CherishParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public Object visitTerminal(CherishParser.TerminalContext ctx) {
        return super.visitTerminal(ctx);
    }

    @Override
    public Object visitBoolVal(CherishParser.BoolValContext ctx) {
        return super.visitBoolVal(ctx);
    }

    @Override
    public Object visitNumeral(CherishParser.NumeralContext ctx) {
        return super.visitNumeral(ctx);
    }

    @Override
    public Object visitDigit(CherishParser.DigitContext ctx) {
        return super.visitDigit(ctx);
    }

    @Override
    public Object visitLowercase(CherishParser.LowercaseContext ctx) {
        return super.visitLowercase(ctx);
    }

    @Override
    public Object visitUppercase(CherishParser.UppercaseContext ctx) {
        return super.visitUppercase(ctx);
    }
}
