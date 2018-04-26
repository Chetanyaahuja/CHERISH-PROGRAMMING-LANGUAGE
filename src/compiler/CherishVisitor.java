package src.compiler;// Generated from ../grammar/Cherish.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CherishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CherishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CherishParser#progBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgBlock(CherishParser.ProgBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#progCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgCode(CherishParser.ProgCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CherishParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CherishParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(CherishParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#charAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAssign(CherishParser.CharAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#wordNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordNew(CherishParser.WordNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(CherishParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(CherishParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#alphanumeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeral(CherishParser.AlphanumeralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(CherishParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#alphabet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabet(CherishParser.AlphabetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExp(CherishParser.ArithExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CherishParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CherishParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CherishParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#conditionalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExp(CherishParser.ConditionalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#iterationExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationExp(CherishParser.IterationExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#singleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExp(CherishParser.SingleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#relativeExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeExp(CherishParser.RelativeExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CherishParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(CherishParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#boolVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(CherishParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#numeral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeral(CherishParser.NumeralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(CherishParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#lowercase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowercase(CherishParser.LowercaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#uppercase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercase(CherishParser.UppercaseContext ctx);
}