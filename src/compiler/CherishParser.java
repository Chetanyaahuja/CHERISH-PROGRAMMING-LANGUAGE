package src.compiler;// Generated from ../grammar/Cherish.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.List;

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
		T__87=88, T__88=89, T__89=90, T__90=91, WS=92;
	public static final int
		RULE_progBlock = 0, RULE_progCode = 1, RULE_varDecl = 2, RULE_statements = 3, 
		RULE_varAssign = 4, RULE_charAssign = 5, RULE_wordNew = 6, RULE_assignStatement = 7, 
		RULE_word = 8, RULE_alphanumeral = 9, RULE_symbol = 10, RULE_alphabet = 11, 
		RULE_arithExp = 12, RULE_term = 13, RULE_factor = 14, RULE_unary = 15, 
		RULE_conditionalExp = 16, RULE_iterationExp = 17, RULE_singleExp = 18, 
		RULE_relativeExp = 19, RULE_operator = 20, RULE_terminal = 21, RULE_boolVal = 22, 
		RULE_numeral = 23, RULE_digit = 24, RULE_lowercase = 25, RULE_uppercase = 26;
	public static final String[] ruleNames = {
		"progBlock", "progCode", "varDecl", "statements", "varAssign", "charAssign", 
		"wordNew", "assignStatement", "word", "alphanumeral", "symbol", "alphabet", 
		"arithExp", "term", "factor", "unary", "conditionalExp", "iterationExp", 
		"singleExp", "relativeExp", "operator", "terminal", "boolVal", "numeral", 
		"digit", "lowercase", "uppercase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'end'", "'int'", "'string'", "'display'", "'='", "'_'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'(rightArithExp)'", 
		"'++'", "'--'", "'if'", "'else'", "'while'", "'not'", "'<='", "'<'", "'>'", 
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
		null, null, null, null, null, null, null, null, "WS"
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterProgBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitProgBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitProgBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgBlockContext progBlock() throws RecognitionException {
		ProgBlockContext _localctx = new ProgBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			progCode();
			setState(56);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterProgCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitProgCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitProgCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgCodeContext progCode() throws RecognitionException {
		ProgCodeContext _localctx = new ProgCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_progCode);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				varDecl();
				setState(59);
				progCode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__2);
				setState(66);
				varAssign();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__3);
				setState(68);
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
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
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
				setState(71);
				assignStatement();
				setState(72);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				conditionalExp();
				setState(75);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				iterationExp();
				setState(78);
				statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__4);
				setState(81);
				word();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
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
			match(T__5);
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
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public WordNewContext wordNew() {
			return getRuleContext(WordNewContext.class,0);
		}
		public CharAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterCharAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitCharAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitCharAssign(this);
			else return visitor.visitChildren(this);
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
			match(T__5);
			setState(91);
			wordNew();
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

	public static class WordNewContext extends ParserRuleContext {
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public WordNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterWordNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitWordNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitWordNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordNewContext wordNew() throws RecognitionException {
		WordNewContext _localctx = new WordNewContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wordNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			alphabet();
			setState(94);
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
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignStatement);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				word();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(97);
					match(T__5);
					setState(98);
					arithExp();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				unary();
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_word);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				alphabet();
				setState(105);
				alphanumeral();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__6);
				setState(108);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterAlphanumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitAlphanumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitAlphanumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumeralContext alphanumeral() throws RecognitionException {
		AlphanumeralContext _localctx = new AlphanumeralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alphanumeral);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				alphabet();
				setState(112);
				alphanumeral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				numeral();
				setState(115);
				alphanumeral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_symbol);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				alphabet();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitAlphabet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitAlphabet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alphabet);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				lowercase();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterArithExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitArithExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitArithExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExpContext arithExp() throws RecognitionException {
		ArithExpContext _localctx = new ArithExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithExp);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				term();
				setState(130);
				match(T__7);
				setState(131);
				arithExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				term();
				setState(134);
				match(T__8);
				setState(135);
				arithExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				factor();
				setState(141);
				match(T__9);
				setState(142);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				factor();
				setState(145);
				match(T__10);
				setState(146);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				factor();
				setState(149);
				match(T__11);
				setState(150);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__12);
				setState(157);
				unary();
				setState(158);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__14);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				numeral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				numeral();
				setState(166);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				numeral();
				setState(169);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				word();
				setState(172);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				word();
				setState(175);
				match(T__16);
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
		public SingleExpContext singleExp() {
			return getRuleContext(SingleExpContext.class,0);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitConditionalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitConditionalExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExp);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__17);
				setState(180);
				match(T__12);
				setState(181);
				singleExp();
				setState(182);
				match(T__13);
				setState(183);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__17);
				setState(186);
				match(T__12);
				setState(187);
				singleExp();
				setState(188);
				match(T__13);
				setState(189);
				statements();
				setState(190);
				match(T__18);
				setState(191);
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
		public SingleExpContext singleExp() {
			return getRuleContext(SingleExpContext.class,0);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterIterationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitIterationExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitIterationExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationExpContext iterationExp() throws RecognitionException {
		IterationExpContext _localctx = new IterationExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterationExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__19);
			setState(196);
			match(T__12);
			setState(197);
			singleExp();
			setState(198);
			match(T__13);
			setState(199);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitSingleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitSingleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpContext singleExp() throws RecognitionException {
		SingleExpContext _localctx = new SingleExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleExp);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__20);
				setState(202);
				match(T__12);
				setState(203);
				singleExp();
				setState(204);
				match(T__13);
				}
				break;
			case T__6:
			case T__27:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterRelativeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitRelativeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitRelativeExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeExpContext relativeExp() throws RecognitionException {
		RelativeExpContext _localctx = new RelativeExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relativeExp);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				terminal();
				setState(210);
				operator();
				setState(211);
				terminal();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_terminal);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				word();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numeral);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				digit();
				setState(225);
				numeral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterLowercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitLowercase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitLowercase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowercaseContext lowercase() throws RecognitionException {
		LowercaseContext _localctx = new LowercaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lowercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__44 - 40)) | (1L << (T__45 - 40)) | (1L << (T__46 - 40)) | (1L << (T__47 - 40)) | (1L << (T__48 - 40)) | (1L << (T__49 - 40)) | (1L << (T__50 - 40)) | (1L << (T__51 - 40)) | (1L << (T__52 - 40)) | (1L << (T__53 - 40)) | (1L << (T__54 - 40)) | (1L << (T__55 - 40)) | (1L << (T__56 - 40)) | (1L << (T__57 - 40)) | (1L << (T__58 - 40)) | (1L << (T__59 - 40)) | (1L << (T__60 - 40)) | (1L << (T__61 - 40)) | (1L << (T__62 - 40)) | (1L << (T__63 - 40)) | (1L << (T__64 - 40)))) != 0)) ) {
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
			if ( listener instanceof CherishListener) ((CherishListener)listener).enterUppercase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CherishListener) ((CherishListener)listener).exitUppercase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CherishVisitor) return ((CherishVisitor<? extends T>)visitor).visitUppercase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UppercaseContext uppercase() throws RecognitionException {
		UppercaseContext _localctx = new UppercaseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_uppercase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (T__77 - 66)) | (1L << (T__78 - 66)) | (1L << (T__79 - 66)) | (1L << (T__80 - 66)) | (1L << (T__81 - 66)) | (1L << (T__82 - 66)) | (1L << (T__83 - 66)) | (1L << (T__84 - 66)) | (1L << (T__85 - 66)) | (1L << (T__86 - 66)) | (1L << (T__87 - 66)) | (1L << (T__88 - 66)) | (1L << (T__89 - 66)) | (1L << (T__90 - 66)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\5\tf\n\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\5\r\u0082"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b4\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00c4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00d2\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d9\n\25\3\26\3\26\3"+
		"\27\3\27\5\27\u00df\n\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00e7\n\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2\30\35\3\2\36\37\3\2 )\3\2*C"+
		"\3\2D]\2\u00f3\28\3\2\2\2\4A\3\2\2\2\6G\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2"+
		"\f[\3\2\2\2\16_\3\2\2\2\20h\3\2\2\2\22o\3\2\2\2\24x\3\2\2\2\26}\3\2\2"+
		"\2\30\u0081\3\2\2\2\32\u008c\3\2\2\2\34\u009b\3\2\2\2\36\u00a5\3\2\2\2"+
		" \u00b3\3\2\2\2\"\u00c3\3\2\2\2$\u00c5\3\2\2\2&\u00d1\3\2\2\2(\u00d8\3"+
		"\2\2\2*\u00da\3\2\2\2,\u00de\3\2\2\2.\u00e0\3\2\2\2\60\u00e6\3\2\2\2\62"+
		"\u00e8\3\2\2\2\64\u00ea\3\2\2\2\66\u00ec\3\2\2\289\7\3\2\29:\5\4\3\2:"+
		";\7\4\2\2;\3\3\2\2\2<=\5\6\4\2=>\5\4\3\2>B\3\2\2\2?B\5\b\5\2@B\3\2\2\2"+
		"A<\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\7\5\2\2DH\5\n\6\2EF\7\6\2"+
		"\2FH\5\f\7\2GC\3\2\2\2GE\3\2\2\2H\7\3\2\2\2IJ\5\20\t\2JK\5\b\5\2KV\3\2"+
		"\2\2LM\5\"\22\2MN\5\b\5\2NV\3\2\2\2OP\5$\23\2PQ\5\b\5\2QV\3\2\2\2RS\7"+
		"\7\2\2SV\5\22\n\2TV\3\2\2\2UI\3\2\2\2UL\3\2\2\2UO\3\2\2\2UR\3\2\2\2UT"+
		"\3\2\2\2V\t\3\2\2\2WX\5\22\n\2XY\7\b\2\2YZ\5\60\31\2Z\13\3\2\2\2[\\\5"+
		"\22\n\2\\]\7\b\2\2]^\5\16\b\2^\r\3\2\2\2_`\5\30\r\2`a\5\22\n\2a\17\3\2"+
		"\2\2be\5\22\n\2cd\7\b\2\2df\5\32\16\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2gi"+
		"\5 \21\2hb\3\2\2\2hg\3\2\2\2i\21\3\2\2\2jk\5\30\r\2kl\5\24\13\2lp\3\2"+
		"\2\2mn\7\t\2\2np\5\24\13\2oj\3\2\2\2om\3\2\2\2p\23\3\2\2\2qr\5\30\r\2"+
		"rs\5\24\13\2sy\3\2\2\2tu\5\60\31\2uv\5\24\13\2vy\3\2\2\2wy\5\26\f\2xq"+
		"\3\2\2\2xt\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z~\5\30\r\2{~\5\60\31\2|~\3\2"+
		"\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\27\3\2\2\2\177\u0082\5\64\33\2\u0080"+
		"\u0082\5\66\34\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2"+
		"\2\u0083\u0084\5\34\17\2\u0084\u0085\7\n\2\2\u0085\u0086\5\32\16\2\u0086"+
		"\u008d\3\2\2\2\u0087\u0088\5\34\17\2\u0088\u0089\7\13\2\2\u0089\u008a"+
		"\5\32\16\2\u008a\u008d\3\2\2\2\u008b\u008d\5\34\17\2\u008c\u0083\3\2\2"+
		"\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2\2\2\u008d\33\3\2\2\2\u008e\u008f"+
		"\5\36\20\2\u008f\u0090\7\f\2\2\u0090\u0091\5\34\17\2\u0091\u009c\3\2\2"+
		"\2\u0092\u0093\5\36\20\2\u0093\u0094\7\r\2\2\u0094\u0095\5\34\17\2\u0095"+
		"\u009c\3\2\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7\16\2\2\u0098\u0099"+
		"\5\34\17\2\u0099\u009c\3\2\2\2\u009a\u009c\5\36\20\2\u009b\u008e\3\2\2"+
		"\2\u009b\u0092\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\35"+
		"\3\2\2\2\u009d\u00a6\5 \21\2\u009e\u009f\7\17\2\2\u009f\u00a0\5 \21\2"+
		"\u00a0\u00a1\7\20\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a6\7\21\2\2\u00a3\u00a6"+
		"\5\60\31\2\u00a4\u00a6\5\22\n\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2"+
		"\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\37"+
		"\3\2\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9\7\22\2\2\u00a9\u00b4\3\2\2"+
		"\2\u00aa\u00ab\5\60\31\2\u00ab\u00ac\7\23\2\2\u00ac\u00b4\3\2\2\2\u00ad"+
		"\u00ae\5\22\n\2\u00ae\u00af\7\22\2\2\u00af\u00b4\3\2\2\2\u00b0\u00b1\5"+
		"\22\n\2\u00b1\u00b2\7\23\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3"+
		"\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4!\3\2\2\2"+
		"\u00b5\u00b6\7\24\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\5&\24\2\u00b8\u00b9"+
		"\7\20\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc\7\24\2\2"+
		"\u00bc\u00bd\7\17\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\20\2\2\u00bf\u00c0"+
		"\5\b\5\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00b5\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7"+
		"\26\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7\20\2\2"+
		"\u00c9\u00ca\5\b\5\2\u00ca%\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\7"+
		"\17\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7\20\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00d2\5(\25\2\u00d1\u00cb\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\'\3\2\2\2"+
		"\u00d3\u00d4\5,\27\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\5,\27\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d9\5.\30\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		")\3\2\2\2\u00da\u00db\t\2\2\2\u00db+\3\2\2\2\u00dc\u00df\5\22\n\2\u00dd"+
		"\u00df\5\60\31\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df-\3\2\2"+
		"\2\u00e0\u00e1\t\3\2\2\u00e1/\3\2\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4"+
		"\5\60\31\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\62\32\2\u00e6\u00e2\3\2\2"+
		"\2\u00e6\u00e5\3\2\2\2\u00e7\61\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9\63\3"+
		"\2\2\2\u00ea\u00eb\t\5\2\2\u00eb\65\3\2\2\2\u00ec\u00ed\t\6\2\2\u00ed"+
		"\67\3\2\2\2\24AGUehox}\u0081\u008c\u009b\u00a5\u00b3\u00c3\u00d1\u00d8"+
		"\u00de\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}