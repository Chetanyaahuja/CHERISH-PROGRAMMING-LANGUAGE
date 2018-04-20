// Generated from Cherish.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CherishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, WS=93;
	public static final int
		RULE_progBlock = 0, RULE_progCode = 1, RULE_varDecl = 2, RULE_statements = 3, 
		RULE_varAssign = 4, RULE_charAssign = 5, RULE_assignStatement = 6, RULE_word = 7, 
		RULE_alphanumeral = 8, RULE_symbol = 9, RULE_alphabet = 10, RULE_arithExp = 11, 
		RULE_term = 12, RULE_factor = 13, RULE_unary = 14, RULE_conditionalExp = 15, 
		RULE_iterationExp = 16, RULE_cond = 17, RULE_andExp = 18, RULE_singleExp = 19, 
		RULE_relativeExp = 20, RULE_operator = 21, RULE_terminal = 22, RULE_boolVal = 23, 
		RULE_numeral = 24, RULE_digit = 25, RULE_lowercase = 26, RULE_uppercase = 27;
	public static final String[] ruleNames = {
		"progBlock", "progCode", "varDecl", "statements", "varAssign", "charAssign", 
		"assignStatement", "word", "alphanumeral", "symbol", "alphabet", "arithExp", 
		"term", "factor", "unary", "conditionalExp", "iterationExp", "cond", "andExp", 
		"singleExp", "relativeExp", "operator", "terminal", "boolVal", "numeral", 
		"digit", "lowercase", "uppercase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'end'", "'int'", "'char'", "'='", "'_'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'('", "')'", "'(rightArithExp)'", "'++'", "'--'", 
		"'if'", "'else'", "'while'", "'&&'", "'||'", "'not'", "'<='", "'<'", "'>'", 
		"'>='", "'=='", "'!='", "'true'", "'false'", "'0'", "'1'", "'2'", "'3'", 
		"'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'a'", "'b'", "'c'", "'d'", 
		"'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", 
		"'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", 
		"'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", 
		"'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", 
		"'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cherish.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CherishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgBlockContext extends ParserRuleContext {
		public ProgCodeContext progCode() {
			return getRuleContext(ProgCodeContext.class,0);
		}
		public ProgBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterProgBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitProgBlock(this);
		}
	}

	public final ProgBlockContext progBlock() throws RecognitionException {
		ProgBlockContext _localctx = new ProgBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			progCode();
			setState(58);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgCodeContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ProgCodeContext progCode() {
			return getRuleContext(ProgCodeContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterProgCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitProgCode(this);
		}
	}

	public final ProgCodeContext progCode() throws RecognitionException {
		ProgCodeContext _localctx = new ProgCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_progCode);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				varDecl();
				setState(61);
				progCode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public CharAssignContext charAssign() {
			return getRuleContext(CharAssignContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__2);
				setState(68);
				varAssign();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__3);
				setState(70);
				charAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public IterationExpContext iterationExp() {
			return getRuleContext(IterationExpContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				assignStatement();
				setState(74);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				conditionalExp();
				setState(77);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				iterationExp();
				setState(80);
				statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitVarAssign(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			word();
			setState(86);
			match(T__4);
			setState(87);
			numeral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharAssignContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public CharAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterCharAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitCharAssign(this);
		}
	}

	public final CharAssignContext charAssign() throws RecognitionException {
		CharAssignContext _localctx = new CharAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_charAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			word();
			setState(90);
			match(T__4);
			setState(91);
			alphabet();
			setState(92);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStatement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				word();
				setState(95);
				match(T__4);
				setState(96);
				arithExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				arithExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public AlphanumeralContext alphanumeral() {
			return getRuleContext(AlphanumeralContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_word);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				alphabet();
				setState(102);
				alphanumeral();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__5);
				setState(105);
				alphanumeral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphanumeralContext extends ParserRuleContext {
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public AlphanumeralContext alphanumeral() {
			return getRuleContext(AlphanumeralContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public AlphanumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterAlphanumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitAlphanumeral(this);
		}
	}

	public final AlphanumeralContext alphanumeral() throws RecognitionException {
		AlphanumeralContext _localctx = new AlphanumeralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alphanumeral);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				alphabet();
				setState(109);
				alphanumeral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				numeral();
				setState(112);
				alphanumeral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				symbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbol);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				alphabet();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				numeral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphabetContext extends ParserRuleContext {
		public LowercaseContext lowercase() {
			return getRuleContext(LowercaseContext.class,0);
		}
		public UppercaseContext uppercase() {
			return getRuleContext(UppercaseContext.class,0);
		}
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitAlphabet(this);
		}
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alphabet);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				lowercase();
				}
				break;
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				uppercase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public ArithExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterArithExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitArithExp(this);
		}
	}

	public final ArithExpContext arithExp() throws RecognitionException {
		ArithExpContext _localctx = new ArithExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithExp);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				term();
				setState(127);
				match(T__6);
				setState(128);
				arithExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				term();
				setState(131);
				match(T__7);
				setState(132);
				arithExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				factor();
				setState(138);
				match(T__8);
				setState(139);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				factor();
				setState(142);
				match(T__9);
				setState(143);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				factor();
				setState(146);
				match(T__10);
				setState(147);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__11);
				setState(154);
				unary();
				setState(155);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				numeral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				word();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				numeral();
				setState(163);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				numeral();
				setState(166);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				word();
				setState(169);
				match(T__14);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				word();
				setState(172);
				match(T__15);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ConditionalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitConditionalExp(this);
		}
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionalExp);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__16);
				setState(177);
				match(T__11);
				setState(178);
				cond(0);
				setState(179);
				match(T__12);
				setState(180);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__16);
				setState(183);
				match(T__11);
				setState(184);
				cond(0);
				setState(185);
				match(T__12);
				setState(186);
				statements();
				setState(187);
				match(T__17);
				setState(188);
				statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationExpContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IterationExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterIterationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitIterationExp(this);
		}
	}

	public final IterationExpContext iterationExp() throws RecognitionException {
		IterationExpContext _localctx = new IterationExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iterationExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__18);
			setState(193);
			match(T__11);
			setState(194);
			cond(0);
			setState(195);
			match(T__12);
			setState(196);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			andExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(201);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(202);
					match(T__19);
					setState(203);
					andExp(0);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpContext extends ParserRuleContext {
		public SingleExpContext singleExp() {
			return getRuleContext(SingleExpContext.class,0);
		}
		public AndExpContext andExp() {
			return getRuleContext(AndExpContext.class,0);
		}
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitAndExp(this);
		}
	}

	public final AndExpContext andExp() throws RecognitionException {
		return andExp(0);
	}

	private AndExpContext andExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpContext _localctx = new AndExpContext(_ctx, _parentState);
		AndExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			singleExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExp);
					setState(212);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(213);
					match(T__20);
					setState(214);
					singleExp();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SingleExpContext extends ParserRuleContext {
		public SingleExpContext singleExp() {
			return getRuleContext(SingleExpContext.class,0);
		}
		public RelativeExpContext relativeExp() {
			return getRuleContext(RelativeExpContext.class,0);
		}
		public SingleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitSingleExp(this);
		}
	}

	public final SingleExpContext singleExp() throws RecognitionException {
		SingleExpContext _localctx = new SingleExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_singleExp);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__21);
				setState(221);
				singleExp();
				}
				break;
			case T__5:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				relativeExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativeExpContext extends ParserRuleContext {
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public RelativeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterRelativeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitRelativeExp(this);
		}
	}

	public final RelativeExpContext relativeExp() throws RecognitionException {
		RelativeExpContext _localctx = new RelativeExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relativeExp);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				terminal();
				setState(226);
				operator();
				setState(227);
				terminal();
				}
				break;
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				boolVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_terminal);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				word();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				numeral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolValContext extends ParserRuleContext {
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitBoolVal(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeralContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public NumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitNumeral(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numeral);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				digit();
				setState(241);
				numeral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowercaseContext extends ParserRuleContext {
		public LowercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowercase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterLowercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitLowercase(this);
		}
	}

	public final LowercaseContext lowercase() throws RecognitionException {
		LowercaseContext _localctx = new LowercaseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lowercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__41 - 41)) | (1L << (T__42 - 41)) | (1L << (T__43 - 41)) | (1L << (T__44 - 41)) | (1L << (T__45 - 41)) | (1L << (T__46 - 41)) | (1L << (T__47 - 41)) | (1L << (T__48 - 41)) | (1L << (T__49 - 41)) | (1L << (T__50 - 41)) | (1L << (T__51 - 41)) | (1L << (T__52 - 41)) | (1L << (T__53 - 41)) | (1L << (T__54 - 41)) | (1L << (T__55 - 41)) | (1L << (T__56 - 41)) | (1L << (T__57 - 41)) | (1L << (T__58 - 41)) | (1L << (T__59 - 41)) | (1L << (T__60 - 41)) | (1L << (T__61 - 41)) | (1L << (T__62 - 41)) | (1L << (T__63 - 41)) | (1L << (T__64 - 41)) | (1L << (T__65 - 41)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UppercaseContext extends ParserRuleContext {
		public UppercaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uppercase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).enterUppercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener ) ((CherishListener)listener).exitUppercase(this);
		}
	}

	public final UppercaseContext uppercase() throws RecognitionException {
		UppercaseContext _localctx = new UppercaseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_uppercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__71 - 67)) | (1L << (T__72 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__78 - 67)) | (1L << (T__79 - 67)) | (1L << (T__80 - 67)) | (1L << (T__81 - 67)) | (1L << (T__82 - 67)) | (1L << (T__83 - 67)) | (1L << (T__84 - 67)) | (1L << (T__85 - 67)) | (1L << (T__86 - 67)) | (1L << (T__87 - 67)) | (1L << (T__88 - 67)) | (1L << (T__89 - 67)) | (1L << (T__90 - 67)) | (1L << (T__91 - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 18:
			return andExp_sempred((AndExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExp_sempred(AndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nv\n\n\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\5\f\177\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00cf\n\23\f\23\16"+
		"\23\u00d2\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00da\n\24\f\24\16"+
		"\24\u00dd\13\24\3\25\3\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00e9\n\26\3\27\3\27\3\30\3\30\5\30\u00ef\n\30\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\5\32\u00f7\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\4$"+
		"&\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7"+
		"\3\2\31\36\3\2\37 \3\2!*\3\2+D\3\2E^\2\u0102\2:\3\2\2\2\4C\3\2\2\2\6I"+
		"\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f[\3\2\2\2\16e\3\2\2\2\20l\3\2\2\2\22u"+
		"\3\2\2\2\24z\3\2\2\2\26~\3\2\2\2\30\u0089\3\2\2\2\32\u0098\3\2\2\2\34"+
		"\u00a2\3\2\2\2\36\u00b0\3\2\2\2 \u00c0\3\2\2\2\"\u00c2\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00d3\3\2\2\2(\u00e1\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2."+
		"\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00f6\3\2\2\2\64\u00f8\3\2\2\2\66\u00fa"+
		"\3\2\2\28\u00fc\3\2\2\2:;\7\3\2\2;<\5\4\3\2<=\7\4\2\2=\3\3\2\2\2>?\5\6"+
		"\4\2?@\5\4\3\2@D\3\2\2\2AD\5\b\5\2BD\3\2\2\2C>\3\2\2\2CA\3\2\2\2CB\3\2"+
		"\2\2D\5\3\2\2\2EF\7\5\2\2FJ\5\n\6\2GH\7\6\2\2HJ\5\f\7\2IE\3\2\2\2IG\3"+
		"\2\2\2J\7\3\2\2\2KL\5\16\b\2LM\5\b\5\2MV\3\2\2\2NO\5 \21\2OP\5\b\5\2P"+
		"V\3\2\2\2QR\5\"\22\2RS\5\b\5\2SV\3\2\2\2TV\3\2\2\2UK\3\2\2\2UN\3\2\2\2"+
		"UQ\3\2\2\2UT\3\2\2\2V\t\3\2\2\2WX\5\20\t\2XY\7\7\2\2YZ\5\62\32\2Z\13\3"+
		"\2\2\2[\\\5\20\t\2\\]\7\7\2\2]^\5\26\f\2^_\5\20\t\2_\r\3\2\2\2`a\5\20"+
		"\t\2ab\7\7\2\2bc\5\30\r\2cf\3\2\2\2df\5\30\r\2e`\3\2\2\2ed\3\2\2\2f\17"+
		"\3\2\2\2gh\5\26\f\2hi\5\22\n\2im\3\2\2\2jk\7\b\2\2km\5\22\n\2lg\3\2\2"+
		"\2lj\3\2\2\2m\21\3\2\2\2no\5\26\f\2op\5\22\n\2pv\3\2\2\2qr\5\62\32\2r"+
		"s\5\22\n\2sv\3\2\2\2tv\5\24\13\2un\3\2\2\2uq\3\2\2\2ut\3\2\2\2v\23\3\2"+
		"\2\2w{\5\26\f\2x{\5\62\32\2y{\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\25"+
		"\3\2\2\2|\177\5\66\34\2}\177\58\35\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2\2"+
		"\2\u0080\u0081\5\32\16\2\u0081\u0082\7\t\2\2\u0082\u0083\5\30\r\2\u0083"+
		"\u008a\3\2\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\n\2\2\u0086\u0087\5"+
		"\30\r\2\u0087\u008a\3\2\2\2\u0088\u008a\5\32\16\2\u0089\u0080\3\2\2\2"+
		"\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c"+
		"\5\34\17\2\u008c\u008d\7\13\2\2\u008d\u008e\5\32\16\2\u008e\u0099\3\2"+
		"\2\2\u008f\u0090\5\34\17\2\u0090\u0091\7\f\2\2\u0091\u0092\5\32\16\2\u0092"+
		"\u0099\3\2\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\r\2\2\u0095\u0096\5"+
		"\32\16\2\u0096\u0099\3\2\2\2\u0097\u0099\5\34\17\2\u0098\u008b\3\2\2\2"+
		"\u0098\u008f\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099\33"+
		"\3\2\2\2\u009a\u00a3\5\36\20\2\u009b\u009c\7\16\2\2\u009c\u009d\5\36\20"+
		"\2\u009d\u009e\7\17\2\2\u009e\u00a3\3\2\2\2\u009f\u00a3\7\20\2\2\u00a0"+
		"\u00a3\5\62\32\2\u00a1\u00a3\5\20\t\2\u00a2\u009a\3\2\2\2\u00a2\u009b"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\7\21\2\2\u00a6\u00b1\3\2"+
		"\2\2\u00a7\u00a8\5\62\32\2\u00a8\u00a9\7\22\2\2\u00a9\u00b1\3\2\2\2\u00aa"+
		"\u00ab\5\20\t\2\u00ab\u00ac\7\21\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5"+
		"\20\t\2\u00ae\u00af\7\22\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0"+
		"\u00a7\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\37\3\2\2"+
		"\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\5$\23\2\u00b5"+
		"\u00b6\7\17\2\2\u00b6\u00b7\5\b\5\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\7"+
		"\23\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\7\17\2\2"+
		"\u00bc\u00bd\5\b\5\2\u00bd\u00be\7\24\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c1!\3\2\2\2\u00c2"+
		"\u00c3\7\25\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7"+
		"\17\2\2\u00c6\u00c7\5\b\5\2\u00c7#\3\2\2\2\u00c8\u00c9\b\23\1\2\u00c9"+
		"\u00ca\5&\24\2\u00ca\u00d0\3\2\2\2\u00cb\u00cc\f\4\2\2\u00cc\u00cd\7\26"+
		"\2\2\u00cd\u00cf\5&\24\2\u00ce\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d3\u00d4\b\24\1\2\u00d4\u00d5\5(\25\2\u00d5\u00db\3\2\2\2\u00d6\u00d7"+
		"\f\4\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00da\5(\25\2\u00d9\u00d6\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\'\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\30\2\2\u00df\u00e2\5(\25\2\u00e0"+
		"\u00e2\5*\26\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2)\3\2\2\2"+
		"\u00e3\u00e4\5.\30\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\5.\30\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e9\5\60\31\2\u00e8\u00e3\3\2\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9+\3\2\2\2\u00ea\u00eb\t\2\2\2\u00eb-\3\2\2\2\u00ec\u00ef\5\20\t"+
		"\2\u00ed\u00ef\5\62\32\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"/\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\5\64\33\2\u00f3"+
		"\u00f4\5\62\32\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\5\64\33\2\u00f6\u00f2"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9"+
		"\65\3\2\2\2\u00fa\u00fb\t\5\2\2\u00fb\67\3\2\2\2\u00fc\u00fd\t\6\2\2\u00fd"+
		"9\3\2\2\2\25CIUeluz~\u0089\u0098\u00a2\u00b0\u00c0\u00d0\u00db\u00e1\u00e8"+
		"\u00ee\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}