package src;// Generated from /media/shubham/GyanSangraha/Courses/CS335/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, PLUS=25, 
		MINUS=26, TIMES=27, POWER=28, NOT=29, LSB=30, RSB=31, LP=32, RP=33, RETURN=34, 
		EQ=35, BooleanLiteral=36, Identifier=37, IntegerLiteral=38, DecimalLiteral=39, 
		WS=40, MULTILINE_COMMENT=41, LINE_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "AND", "LT", "PLUS", "MINUS", 
		"TIMES", "POWER", "NOT", "LSB", "RSB", "LP", "RP", "RETURN", "EQ", "BooleanLiteral", 
		"Identifier", "JavaLetter", "JavaLetterOrDigit", "IntegerLiteral", "DecimalLiteral", 
		"DecimalIntegerLiteral", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
		"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'float'", "'char'", 
		"'if'", "'else'", "'while'", "'for'", "'println'", "'new'", "'this'", 
		"'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", "'!'", "'['", "']'", "'('", 
		"')'", "'return'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "AND", 
		"LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "LP", "RP", 
		"RETURN", "EQ", "BooleanLiteral", "Identifier", "IntegerLiteral", "DecimalLiteral", 
		"WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0162\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0105\n%\3&\3&\7"+
		"&\u0109\n&\f&\16&\u010c\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3"+
		",\3,\5,\u011d\n,\3,\3,\3,\5,\u0122\n,\5,\u0124\n,\3-\3-\5-\u0128\n-\3"+
		"-\5-\u012b\n-\3.\3.\5.\u012f\n.\3/\3/\3\60\6\60\u0134\n\60\r\60\16\60"+
		"\u0135\3\61\3\61\5\61\u013a\n\61\3\62\6\62\u013d\n\62\r\62\16\62\u013e"+
		"\3\63\6\63\u0142\n\63\r\63\16\63\u0143\3\63\3\63\3\64\3\64\3\64\3\64\7"+
		"\64\u014c\n\64\f\64\16\64\u014f\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\7\65\u015a\n\65\f\65\16\65\u015d\13\65\3\65\3\65\3\65\3"+
		"\65\4\u014d\u015b\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U\2W\2Y\2[\2]\2_\2a\2"+
		"c\2e*g+i,\3\2\6\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\63;\5\2\13\f\17\17\""+
		"\"\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2e\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tz\3\2\2\2\13\u0081"+
		"\3\2\2\2\r\u0086\3\2\2\2\17\u008b\3\2\2\2\21\u0092\3\2\2\2\23\u0094\3"+
		"\2\2\2\25\u009c\3\2\2\2\27\u009e\3\2\2\2\31\u00a0\3\2\2\2\33\u00a4\3\2"+
		"\2\2\35\u00ac\3\2\2\2\37\u00b2\3\2\2\2!\u00b7\3\2\2\2#\u00ba\3\2\2\2%"+
		"\u00bf\3\2\2\2\'\u00c5\3\2\2\2)\u00c9\3\2\2\2+\u00d1\3\2\2\2-\u00d5\3"+
		"\2\2\2/\u00da\3\2\2\2\61\u00dd\3\2\2\2\63\u00df\3\2\2\2\65\u00e1\3\2\2"+
		"\2\67\u00e3\3\2\2\29\u00e5\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u00ee\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f9\3\2\2\2I"+
		"\u0104\3\2\2\2K\u0106\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u0113\3\2\2\2U\u0117\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u012e"+
		"\3\2\2\2]\u0130\3\2\2\2_\u0133\3\2\2\2a\u0139\3\2\2\2c\u013c\3\2\2\2e"+
		"\u0141\3\2\2\2g\u0147\3\2\2\2i\u0155\3\2\2\2kl\7e\2\2lm\7n\2\2mn\7c\2"+
		"\2no\7u\2\2op\7u\2\2p\4\3\2\2\2qr\7}\2\2r\6\3\2\2\2st\7r\2\2tu\7w\2\2"+
		"uv\7d\2\2vw\7n\2\2wx\7k\2\2xy\7e\2\2y\b\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7"+
		"c\2\2}~\7v\2\2~\177\7k\2\2\177\u0080\7e\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7x\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2\2\u0084\u0085\7f\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7p\2\2\u008a\16\3\2\2\2\u008b\u008c\7U\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7i\2\2"+
		"\u0091\20\3\2\2\2\u0092\u0093\7\177\2\2\u0093\22\3\2\2\2\u0094\u0095\7"+
		"g\2\2\u0095\u0096\7z\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7f\2\2\u009a\u009b\7u\2\2\u009b\24\3\2\2\2\u009c\u009d"+
		"\7=\2\2\u009d\26\3\2\2\2\u009e\u009f\7.\2\2\u009f\30\3\2\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\32\3\2\2\2\u00a4\u00a5"+
		"\7d\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\34\3\2\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7"+
		"j\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7t\2\2\u00b6 \3\2\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7h\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be$\3\2\2\2\u00bf\u00c0"+
		"\7y\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7p\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7g\2"+
		"\2\u00d3\u00d4\7y\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7"+
		"j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7u\2\2\u00d9.\3\2\2\2\u00da\u00db"+
		"\7(\2\2\u00db\u00dc\7(\2\2\u00dc\60\3\2\2\2\u00dd\u00de\7>\2\2\u00de\62"+
		"\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7/\2\2\u00e2"+
		"\66\3\2\2\2\u00e3\u00e4\7,\2\2\u00e48\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6"+
		"\u00e7\7,\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9<\3\2\2\2\u00ea\u00eb"+
		"\7]\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7"+
		"*\2\2\u00efB\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7t"+
		"\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7"+
		"\7t\2\2\u00f7\u00f8\7p\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7?\2\2\u00faH\3"+
		"\2\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\u0105\7g\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2"+
		"\u0102\u0103\7u\2\2\u0103\u0105\7g\2\2\u0104\u00fb\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0105J\3\2\2\2\u0106\u010a\5M\'\2\u0107\u0109\5O(\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"L\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\t\2\2\2\u010eN\3\2\2\2\u010f"+
		"\u0110\t\3\2\2\u0110P\3\2\2\2\u0111\u0112\5U+\2\u0112R\3\2\2\2\u0113\u0114"+
		"\5Q)\2\u0114\u0115\13\2\2\2\u0115\u0116\5Q)\2\u0116T\3\2\2\2\u0117\u0118"+
		"\5W,\2\u0118V\3\2\2\2\u0119\u0124\7\62\2\2\u011a\u0121\5]/\2\u011b\u011d"+
		"\5Y-\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e"+
		"\u011f\5c\62\2\u011f\u0120\5Y-\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2"+
		"\2\u0121\u011e\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011a"+
		"\3\2\2\2\u0124X\3\2\2\2\u0125\u012a\5[.\2\u0126\u0128\5_\60\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\5[.\2\u012a"+
		"\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012bZ\3\2\2\2\u012c\u012f\7\62\2\2"+
		"\u012d\u012f\5]/\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\\\3\2"+
		"\2\2\u0130\u0131\t\4\2\2\u0131^\3\2\2\2\u0132\u0134\5a\61\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"`\3\2\2\2\u0137\u013a\5[.\2\u0138\u013a\7a\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013ab\3\2\2\2\u013b\u013d\7a\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fd\3\2\2\2"+
		"\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\63\2\2"+
		"\u0146f\3\2\2\2\u0147\u0148\7\61\2\2\u0148\u0149\7,\2\2\u0149\u014d\3"+
		"\2\2\2\u014a\u014c\13\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0151\7,\2\2\u0151\u0152\7\61\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b\64\2\2\u0154h\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7\61\2"+
		"\2\u0157\u015b\3\2\2\2\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\f\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\b\65\2\2\u0161j\3\2\2\2\21\2\u0104\u010a\u011c\u0121\u0123\u0127"+
		"\u012a\u012e\u0135\u0139\u013e\u0143\u014d\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}