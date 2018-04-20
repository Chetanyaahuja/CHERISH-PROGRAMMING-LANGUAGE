// Generated from Cherish.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CherishParser}.
 */
public interface CherishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CherishParser#progBlock}.
	 * @param ctx the parse tree
	 */
	void enterProgBlock(CherishParser.ProgBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#progBlock}.
	 * @param ctx the parse tree
	 */
	void exitProgBlock(CherishParser.ProgBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#progCode}.
	 * @param ctx the parse tree
	 */
	void enterProgCode(CherishParser.ProgCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#progCode}.
	 * @param ctx the parse tree
	 */
	void exitProgCode(CherishParser.ProgCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CherishParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CherishParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CherishParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CherishParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(CherishParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(CherishParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#charAssign}.
	 * @param ctx the parse tree
	 */
	void enterCharAssign(CherishParser.CharAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#charAssign}.
	 * @param ctx the parse tree
	 */
	void exitCharAssign(CherishParser.CharAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(CherishParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(CherishParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(CherishParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(CherishParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#alphanumeral}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeral(CherishParser.AlphanumeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#alphanumeral}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeral(CherishParser.AlphanumeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(CherishParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(CherishParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void enterAlphabet(CherishParser.AlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void exitAlphabet(CherishParser.AlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterArithExp(CherishParser.ArithExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitArithExp(CherishParser.ArithExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CherishParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CherishParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CherishParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CherishParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CherishParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CherishParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(CherishParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(CherishParser.ConditionalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#iterationExp}.
	 * @param ctx the parse tree
	 */
	void enterIterationExp(CherishParser.IterationExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#iterationExp}.
	 * @param ctx the parse tree
	 */
	void exitIterationExp(CherishParser.IterationExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(CherishParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(CherishParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(CherishParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(CherishParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#singleExp}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(CherishParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#singleExp}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(CherishParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#relativeExp}.
	 * @param ctx the parse tree
	 */
	void enterRelativeExp(CherishParser.RelativeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#relativeExp}.
	 * @param ctx the parse tree
	 */
	void exitRelativeExp(CherishParser.RelativeExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CherishParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CherishParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(CherishParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(CherishParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(CherishParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(CherishParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#numeral}.
	 * @param ctx the parse tree
	 */
	void enterNumeral(CherishParser.NumeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#numeral}.
	 * @param ctx the parse tree
	 */
	void exitNumeral(CherishParser.NumeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(CherishParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(CherishParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#lowercase}.
	 * @param ctx the parse tree
	 */
	void enterLowercase(CherishParser.LowercaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#lowercase}.
	 * @param ctx the parse tree
	 */
	void exitLowercase(CherishParser.LowercaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#uppercase}.
	 * @param ctx the parse tree
	 */
	void enterUppercase(CherishParser.UppercaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#uppercase}.
	 * @param ctx the parse tree
	 */
	void exitUppercase(CherishParser.UppercaseContext ctx);
}