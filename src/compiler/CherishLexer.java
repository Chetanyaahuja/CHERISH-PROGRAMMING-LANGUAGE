package src.compiler;// Generated from ../grammar/Cherish.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CherishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NOT=21, BOOLEAN=22, GREATEREQUAL=23, GREATER=24, 
		LESSER=25, LESSEREQUAL=26, EQUALS=27, NOTEQUALS=28, NUMERAL=29, LOWERCASE=30, 
		WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "NOT", "BOOLEAN", "GREATEREQUAL", "GREATER", 
		"LESSER", "LESSEREQUAL", "EQUALS", "NOTEQUALS", "NUMERAL", "LOWERCASE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'end'", "'int'", "'='", "'boolean'", "'&&'", "'||'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'if'", "'('", "')'", "'{'", "'}'", 
		"'else'", "'while'", "'Display'", "'!'", null, "'>='", "'>'", "'<'", "'<='", 
		"'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NOT", "BOOLEAN", 
		"GREATEREQUAL", "GREATER", "LESSER", "LESSEREQUAL", "EQUALS", "NOTEQUALS", 
		"NUMERAL", "LOWERCASE", "WS"
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


	public CherishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cherish.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0093\n\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\7\36\u00a7\n\36\f\36"+
		"\16\36\u00aa\13\36\3\36\5\36\u00ad\n\36\3\37\3\37\3 \6 \u00b2\n \r \16"+
		" \u00b3\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!\3\2\5\3\2\63;\3\2\62;\4\2\13\f\"\"\2\u00ba\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5G\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2"+
		"\13Q\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2"+
		"\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2"+
		"\2#r\3\2\2\2%t\3\2\2\2\'y\3\2\2\2)\177\3\2\2\2+\u0087\3\2\2\2-\u0092\3"+
		"\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009b\3\2\2"+
		"\2\67\u009e\3\2\2\29\u00a1\3\2\2\2;\u00ac\3\2\2\2=\u00ae\3\2\2\2?\u00b1"+
		"\3\2\2\2AB\7u\2\2BC\7v\2\2CD\7c\2\2DE\7t\2\2EF\7v\2\2F\4\3\2\2\2GH\7g"+
		"\2\2HI\7p\2\2IJ\7f\2\2J\6\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\b\3\2\2"+
		"\2OP\7?\2\2P\n\3\2\2\2QR\7d\2\2RS\7q\2\2ST\7q\2\2TU\7n\2\2UV\7g\2\2VW"+
		"\7c\2\2WX\7p\2\2X\f\3\2\2\2YZ\7(\2\2Z[\7(\2\2[\16\3\2\2\2\\]\7~\2\2]^"+
		"\7~\2\2^\20\3\2\2\2_`\7-\2\2`\22\3\2\2\2ab\7/\2\2b\24\3\2\2\2cd\7,\2\2"+
		"d\26\3\2\2\2ef\7\61\2\2f\30\3\2\2\2gh\7\'\2\2h\32\3\2\2\2ij\7k\2\2jk\7"+
		"h\2\2k\34\3\2\2\2lm\7*\2\2m\36\3\2\2\2no\7+\2\2o \3\2\2\2pq\7}\2\2q\""+
		"\3\2\2\2rs\7\177\2\2s$\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7u\2\2wx\7g\2\2x&\3"+
		"\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~(\3\2\2\2\177\u0080"+
		"\7F\2\2\u0080\u0081\7k\2\2\u0081\u0082\7u\2\2\u0082\u0083\7r\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085\u0086\7{\2\2\u0086*\3\2\2\2\u0087"+
		"\u0088\7#\2\2\u0088,\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u0093\7g\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0093\7g\2\2\u0092\u0089"+
		"\3\2\2\2\u0092\u008d\3\2\2\2\u0093.\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096"+
		"\7?\2\2\u0096\60\3\2\2\2\u0097\u0098\7@\2\2\u0098\62\3\2\2\2\u0099\u009a"+
		"\7>\2\2\u009a\64\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\66"+
		"\3\2\2\2\u009e\u009f\7?\2\2\u009f\u00a0\7?\2\2\u00a08\3\2\2\2\u00a1\u00a2"+
		"\7#\2\2\u00a2\u00a3\7?\2\2\u00a3:\3\2\2\2\u00a4\u00a8\t\2\2\2\u00a5\u00a7"+
		"\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\62"+
		"\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad<\3\2\2\2\u00ae\u00af"+
		"\4c|\2\u00af>\3\2\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\b \2\2\u00b6@\3\2\2\2\7\2\u0092\u00a8\u00ac\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}