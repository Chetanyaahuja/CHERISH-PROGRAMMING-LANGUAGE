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
	 * Visit a parse tree produced by {@link CherishParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CherishParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAssign(CherishParser.IntegerAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAssign(CherishParser.BooleanAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkInteger}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckInteger(CherishParser.CheckIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CherishParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAndOr}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndOr(CherishParser.BooleanAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkBoolean}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckBoolean(CherishParser.CheckBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(CherishParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(CherishParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(CherishParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termF}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermF(CherishParser.TermFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(CherishParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(CherishParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExp(CherishParser.ModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorT}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorT(CherishParser.FactorTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeralFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeralFactor(CherishParser.NumeralFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordFactor(CherishParser.WordFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#conditionalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExp(CherishParser.ConditionalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(CherishParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#iterationExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationExp(CherishParser.IterationExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(CherishParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CherishParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(CherishParser.ComparatorContext ctx);
}