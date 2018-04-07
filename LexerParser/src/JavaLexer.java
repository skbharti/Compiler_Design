// Generated from /Users/karthikeyan/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, AND=21, LT=22, PLUS=23, MINUS=24, TIMES=25, 
		POWER=26, NOT=27, LSB=28, RSB=29, DOTLENGTH=30, LP=31, RP=32, RETURN=33, 
		EQ=34, BooleanLiteral=35, Identifier=36, IntegerLiteral=37, WS=38, MULTILINE_COMMENT=39, 
		LINE_COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "AND", "LT", "PLUS", "MINUS", "TIMES", "POWER", 
		"NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP", "RETURN", "EQ", "BooleanLiteral", 
		"Identifier", "JavaLetter", "JavaLetterOrDigit", "IntegerLiteral", "DecimalIntegerLiteral", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'if'", "'else'", 
		"'while'", "'for'", "'println'", "'new'", "'this'", "'&&'", "'<'", "'+'", 
		"'-'", "'*'", "'**'", "'!'", "'['", "']'", "'.length'", "'('", "')'", 
		"'return'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "AND", "LT", "PLUS", 
		"MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP", 
		"RETURN", "EQ", "BooleanLiteral", "Identifier", "IntegerLiteral", "WS", 
		"MULTILINE_COMMENT", "LINE_COMMENT"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u00fe\n$\3%\3%\7%\u0102\n%\f%\16%\u0105\13%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\5*\u0112\n*\3*\3*\3*\5*\u0117\n*\5"+
		"*\u0119\n*\3+\3+\5+\u011d\n+\3+\5+\u0120\n+\3,\3,\5,\u0124\n,\3-\3-\3"+
		".\6.\u0129\n.\r.\16.\u012a\3/\3/\5/\u012f\n/\3\60\6\60\u0132\n\60\r\60"+
		"\16\60\u0133\3\61\6\61\u0137\n\61\r\61\16\61\u0138\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\7\62\u0141\n\62\f\62\16\62\u0144\13\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\7\63\u014f\n\63\f\63\16\63\u0152\13\63\3\63"+
		"\3\63\3\63\3\63\4\u0142\u0150\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q\2S\2U\2"+
		"W\2Y\2[\2]\2_\2a(c)e*\3\2\6\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\63;\5\2"+
		"\13\f\17\17\"\"\2\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\3g\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tv\3\2\2\2\13}\3\2\2\2\r\u0082"+
		"\3\2\2\2\17\u0087\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0098\3"+
		"\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u00a0\3\2\2\2\35\u00a8\3\2"+
		"\2\2\37\u00ab\3\2\2\2!\u00b0\3\2\2\2#\u00b6\3\2\2\2%\u00ba\3\2\2\2\'\u00c2"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00cb\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d2\3\2\2\2\63\u00d4\3\2\2\2\65\u00d6\3\2\2\2\67\u00d9\3\2\2\29\u00db"+
		"\3\2\2\2;\u00dd\3\2\2\2=\u00df\3\2\2\2?\u00e7\3\2\2\2A\u00e9\3\2\2\2C"+
		"\u00eb\3\2\2\2E\u00f2\3\2\2\2G\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0106\3\2"+
		"\2\2M\u0108\3\2\2\2O\u010a\3\2\2\2Q\u010c\3\2\2\2S\u0118\3\2\2\2U\u011a"+
		"\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u0128\3\2\2\2]\u012e\3\2\2\2_"+
		"\u0131\3\2\2\2a\u0136\3\2\2\2c\u013c\3\2\2\2e\u014a\3\2\2\2gh\7e\2\2h"+
		"i\7n\2\2ij\7c\2\2jk\7u\2\2kl\7u\2\2l\4\3\2\2\2mn\7}\2\2n\6\3\2\2\2op\7"+
		"r\2\2pq\7w\2\2qr\7d\2\2rs\7n\2\2st\7k\2\2tu\7e\2\2u\b\3\2\2\2vw\7u\2\2"+
		"wx\7v\2\2xy\7c\2\2yz\7v\2\2z{\7k\2\2{|\7e\2\2|\n\3\2\2\2}~\7x\2\2~\177"+
		"\7q\2\2\177\u0080\7k\2\2\u0080\u0081\7f\2\2\u0081\f\3\2\2\2\u0082\u0083"+
		"\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086"+
		"\16\3\2\2\2\u0087\u0088\7U\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7i\2\2\u008d\20\3\2\2\2\u008e"+
		"\u008f\7\177\2\2\u008f\22\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7z\2"+
		"\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7f\2\2\u0096\u0097\7u\2\2\u0097\24\3\2\2\2\u0098\u0099\7=\2\2\u0099\26"+
		"\3\2\2\2\u009a\u009b\7.\2\2\u009b\30\3\2\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7"+
		"k\2\2\u00a9\u00aa\7h\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7g\2"+
		"\2\u00c4\u00c5\7y\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7"+
		"j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7u\2\2\u00ca*\3\2\2\2\u00cb\u00cc"+
		"\7(\2\2\u00cc\u00cd\7(\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf.\3"+
		"\2\2\2\u00d0\u00d1\7-\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\62"+
		"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5\64\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7"+
		"\u00d8\7,\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7#\2\2\u00da8\3\2\2\2\u00db"+
		"\u00dc\7]\2\2\u00dc:\3\2\2\2\u00dd\u00de\7_\2\2\u00de<\3\2\2\2\u00df\u00e0"+
		"\7\60\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7i\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6>\3\2\2\2\u00e7"+
		"\u00e8\7*\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7+\2\2\u00eaB\3\2\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7p\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		"F\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7w\2\2\u00f7"+
		"\u00fe\7g\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2"+
		"\u00fb\u00fc\7u\2\2\u00fc\u00fe\7g\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f8"+
		"\3\2\2\2\u00feH\3\2\2\2\u00ff\u0103\5K&\2\u0100\u0102\5M\'\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"J\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\t\2\2\2\u0107L\3\2\2\2\u0108"+
		"\u0109\t\3\2\2\u0109N\3\2\2\2\u010a\u010b\5Q)\2\u010bP\3\2\2\2\u010c\u010d"+
		"\5S*\2\u010dR\3\2\2\2\u010e\u0119\7\62\2\2\u010f\u0116\5Y-\2\u0110\u0112"+
		"\5U+\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0117\3\2\2\2\u0113"+
		"\u0114\5_\60\2\u0114\u0115\5U+\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2"+
		"\2\u0116\u0113\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u010f"+
		"\3\2\2\2\u0119T\3\2\2\2\u011a\u011f\5W,\2\u011b\u011d\5[.\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\5W,\2\u011f"+
		"\u011c\3\2\2\2\u011f\u0120\3\2\2\2\u0120V\3\2\2\2\u0121\u0124\7\62\2\2"+
		"\u0122\u0124\5Y-\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124X\3\2"+
		"\2\2\u0125\u0126\t\4\2\2\u0126Z\3\2\2\2\u0127\u0129\5]/\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\\\3\2\2\2\u012c\u012f\5W,\2\u012d\u012f\7a\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f^\3\2\2\2\u0130\u0132\7a\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134`\3\2\2\2"+
		"\u0135\u0137\t\5\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b\61\2\2"+
		"\u013bb\3\2\2\2\u013c\u013d\7\61\2\2\u013d\u013e\7,\2\2\u013e\u0142\3"+
		"\2\2\2\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7,\2\2\u0146\u0147\7\61\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\b\62\2\2\u0149d\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\7\61\2"+
		"\2\u014c\u0150\3\2\2\2\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\f\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b\63\2\2\u0156f\3\2\2\2\21\2\u00fd\u0103\u0111\u0116\u0118\u011c"+
		"\u011f\u0123\u012a\u012e\u0133\u0138\u0142\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}