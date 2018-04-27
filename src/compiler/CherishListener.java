package src.compiler;// Generated from ../grammar/Cherish.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by the {@code integerAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAssign(CherishParser.IntegerAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAssign(CherishParser.IntegerAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAssign(CherishParser.BooleanAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAssign}
	 * labeled alternative in {@link CherishParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAssign(CherishParser.BooleanAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkInteger}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterCheckInteger(CherishParser.CheckIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkInteger}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitCheckInteger(CherishParser.CheckIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CherishParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CherishParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAndOr}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndOr(CherishParser.BooleanAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAndOr}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndOr(CherishParser.BooleanAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkBoolean}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterCheckBoolean(CherishParser.CheckBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkBoolean}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitCheckBoolean(CherishParser.CheckBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(CherishParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link CherishParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(CherishParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(CherishParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(CherishParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(CherishParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(CherishParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termF}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void enterTermF(CherishParser.TermFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termF}
	 * labeled alternative in {@link CherishParser#arithExp}.
	 * @param ctx the parse tree
	 */
	void exitTermF(CherishParser.TermFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(CherishParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(CherishParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(CherishParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(CherishParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void enterModExp(CherishParser.ModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExp}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void exitModExp(CherishParser.ModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorT}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorT(CherishParser.FactorTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorT}
	 * labeled alternative in {@link CherishParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorT(CherishParser.FactorTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numeralFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumeralFactor(CherishParser.NumeralFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numeralFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumeralFactor(CherishParser.NumeralFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterWordFactor(CherishParser.WordFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordFactor}
	 * labeled alternative in {@link CherishParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitWordFactor(CherishParser.WordFactorContext ctx);
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
	 * Enter a parse tree produced by {@link CherishParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(CherishParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(CherishParser.ElseConditionContext ctx);
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
	 * Enter a parse tree produced by {@link CherishParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(CherishParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(CherishParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CherishParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(CherishParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CherishParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(CherishParser.ComparatorContext ctx);
}