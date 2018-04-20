// Generated from /media/shubham/GyanSangraha/Courses/CS335/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
package src;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, AND=24, LT=25, 
		LTE=26, GT=27, GTE=28, EQU=29, PLUS=30, MINUS=31, TIMES=32, POWER=33, 
		NOT=34, LSB=35, RSB=36, LP=37, RP=38, RETURN=39, EQ=40, REF=41, BooleanLiteral=42, 
		Identifier=43, IntegerLiteral=44, DecimalLiteral=45, WS=46, MULTILINE_COMMENT=47, 
		LINE_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "AND", "LT", "LTE", 
		"GT", "GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", 
		"LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "IntegerLiteral", "DecimalLiteral", "DecimalIntegerLiteral", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'float'", "'char'", 
		"'if'", "'else'", "'while'", "'for'", "'println'", "'print'", "'new'", 
		"'this'", "'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'+'", "'-'", 
		"'*'", "'**'", "'!'", "'['", "']'", "'('", "')'", "'return'", "'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"AND", "LT", "LTE", "GT", "GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER", 
		"NOT", "LSB", "RSB", "LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral", 
		"Identifier", "IntegerLiteral", "DecimalLiteral", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0184\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0124\n+\3,\3,\7,\u0128\n,\f,\16,\u012b"+
		"\13,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\5\62\u013b"+
		"\n\62\3\62\3\62\5\62\u013f\n\62\3\62\3\62\3\62\5\62\u0144\n\62\5\62\u0146"+
		"\n\62\3\63\3\63\5\63\u014a\n\63\3\63\5\63\u014d\n\63\3\64\3\64\5\64\u0151"+
		"\n\64\3\65\3\65\3\66\6\66\u0156\n\66\r\66\16\66\u0157\3\67\3\67\5\67\u015c"+
		"\n\67\38\68\u015f\n8\r8\168\u0160\39\69\u0164\n9\r9\169\u0165\39\39\3"+
		":\3:\3:\3:\7:\u016e\n:\f:\16:\u0171\13:\3:\3:\3:\3:\3:\3;\3;\3;\3;\7;"+
		"\u017c\n;\f;\16;\u017f\13;\3;\3;\3;\3;\4\u016f\u017d\2<\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y\2[\2]._/a\2c\2e\2g\2i\2k\2m\2o\2q\60s\61u\62\3\2\7"+
		"\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2--//\3\2\63;\5\2\13\f\17\17\"\"\2\u0188"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\3w\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0086\3\2\2\2\13\u008d\3"+
		"\2\2\2\r\u0092\3\2\2\2\17\u0097\3\2\2\2\21\u009e\3\2\2\2\23\u00a0\3\2"+
		"\2\2\25\u00a8\3\2\2\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00b0\3\2\2"+
		"\2\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c3\3\2\2\2#\u00c6\3\2\2\2%\u00cb"+
		"\3\2\2\2\'\u00d1\3\2\2\2)\u00d5\3\2\2\2+\u00dd\3\2\2\2-\u00e3\3\2\2\2"+
		"/\u00e7\3\2\2\2\61\u00ec\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67"+
		"\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f9\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2"+
		"\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109"+
		"\3\2\2\2K\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0116\3\2\2\2S"+
		"\u0118\3\2\2\2U\u0123\3\2\2\2W\u0125\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2"+
		"\2\2]\u0130\3\2\2\2_\u0132\3\2\2\2a\u0136\3\2\2\2c\u0145\3\2\2\2e\u0147"+
		"\3\2\2\2g\u0150\3\2\2\2i\u0152\3\2\2\2k\u0155\3\2\2\2m\u015b\3\2\2\2o"+
		"\u015e\3\2\2\2q\u0163\3\2\2\2s\u0169\3\2\2\2u\u0177\3\2\2\2wx\7e\2\2x"+
		"y\7n\2\2yz\7c\2\2z{\7u\2\2{|\7u\2\2|\4\3\2\2\2}~\7}\2\2~\6\3\2\2\2\177"+
		"\u0080\7r\2\2\u0080\u0081\7w\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2"+
		"\u0083\u0084\7k\2\2\u0084\u0085\7e\2\2\u0085\b\3\2\2\2\u0086\u0087\7u"+
		"\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7e\2\2\u008c\n\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f"+
		"\7q\2\2\u008f\u0090\7k\2\2\u0090\u0091\7f\2\2\u0091\f\3\2\2\2\u0092\u0093"+
		"\7o\2\2\u0093\u0094\7c\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096"+
		"\16\3\2\2\2\u0097\u0098\7U\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7i\2\2\u009d\20\3\2\2\2\u009e"+
		"\u009f\7\177\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7z\2"+
		"\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6"+
		"\7f\2\2\u00a6\u00a7\7u\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\26"+
		"\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\u00b6\7c\2\2\u00b6\u00b7\7p\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7"+
		"h\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7t\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\u00ca\7g\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd"+
		"\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"&\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"(\3\2\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7p\2\2"+
		"\u00dc*\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7k\2"+
		"\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7"+
		"p\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7y\2\2\u00e6.\3\2\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7u\2\2\u00eb"+
		"\60\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7(\2\2\u00ee\62\3\2\2\2\u00ef"+
		"\u00f0\7>\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f5\7@\2\2\u00f58\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7"+
		"\u00f8\7?\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7?\2\2\u00fb"+
		"<\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff@"+
		"\3\2\2\2\u0100\u0101\7,\2\2\u0101B\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0104"+
		"\7,\2\2\u0104D\3\2\2\2\u0105\u0106\7#\2\2\u0106F\3\2\2\2\u0107\u0108\7"+
		"]\2\2\u0108H\3\2\2\2\u0109\u010a\7_\2\2\u010aJ\3\2\2\2\u010b\u010c\7*"+
		"\2\2\u010cL\3\2\2\2\u010d\u010e\7+\2\2\u010eN\3\2\2\2\u010f\u0110\7t\2"+
		"\2\u0110\u0111\7g\2\2\u0111\u0112\7v\2\2\u0112\u0113\7w\2\2\u0113\u0114"+
		"\7t\2\2\u0114\u0115\7p\2\2\u0115P\3\2\2\2\u0116\u0117\7?\2\2\u0117R\3"+
		"\2\2\2\u0118\u0119\7\60\2\2\u0119T\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c"+
		"\7t\2\2\u011c\u011d\7w\2\2\u011d\u0124\7g\2\2\u011e\u011f\7h\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122\u0124\7g\2\2"+
		"\u0123\u011a\3\2\2\2\u0123\u011e\3\2\2\2\u0124V\3\2\2\2\u0125\u0129\5"+
		"Y-\2\u0126\u0128\5[.\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012aX\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\t\2\2\2\u012dZ\3\2\2\2\u012e\u012f\t\3\2\2\u012f\\\3\2\2\2\u0130"+
		"\u0131\5a\61\2\u0131^\3\2\2\2\u0132\u0133\5]/\2\u0133\u0134\13\2\2\2\u0134"+
		"\u0135\5]/\2\u0135`\3\2\2\2\u0136\u0137\5c\62\2\u0137b\3\2\2\2\u0138\u0146"+
		"\7\62\2\2\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u0143\5i\65\2\u013d\u013f\5e\63\2\u013e\u013d"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0144\3\2\2\2\u0140\u0141\5o8\2\u0141"+
		"\u0142\5e\63\2\u0142\u0144\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u0140\3\2"+
		"\2\2\u0144\u0146\3\2\2\2\u0145\u0138\3\2\2\2\u0145\u013a\3\2\2\2\u0146"+
		"d\3\2\2\2\u0147\u014c\5g\64\2\u0148\u014a\5k\66\2\u0149\u0148\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5g\64\2\u014c\u0149"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014df\3\2\2\2\u014e\u0151\7\62\2\2\u014f"+
		"\u0151\5i\65\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151h\3\2\2\2"+
		"\u0152\u0153\t\5\2\2\u0153j\3\2\2\2\u0154\u0156\5m\67\2\u0155\u0154\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"l\3\2\2\2\u0159\u015c\5g\64\2\u015a\u015c\7a\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015cn\3\2\2\2\u015d\u015f\7a\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161p\3\2\2\2"+
		"\u0162\u0164\t\6\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b9\2\2\u0168"+
		"r\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7,\2\2\u016b\u016f\3\2\2\2"+
		"\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7,\2\2\u0173\u0174\7\61\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b:"+
		"\2\2\u0176t\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7\61\2\2\u0179\u017d"+
		"\3\2\2\2\u017a\u017c\13\2\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0181\7\f\2\2\u0181\u0182\3\2\2\2\u0182\u0183\b;\2\2\u0183"+
		"v\3\2\2\2\22\2\u0123\u0129\u013a\u013e\u0143\u0145\u0149\u014c\u0150\u0157"+
		"\u015b\u0160\u0165\u016f\u017d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}