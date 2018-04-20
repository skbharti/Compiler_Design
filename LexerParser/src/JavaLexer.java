// Generated from /home/varun/IdeaProjects/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, LTE=25, 
		GT=26, GTE=27, EQU=28, PLUS=29, MINUS=30, TIMES=31, POWER=32, NOT=33, 
		LSB=34, RSB=35, LP=36, RP=37, RETURN=38, EQ=39, REF=40, BooleanLiteral=41, 
		Identifier=42, IntegerLiteral=43, DecimalLiteral=44, WS=45, MULTILINE_COMMENT=46, 
		LINE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "AND", "LT", "LTE", "GT", 
		"GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", 
		"LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "IntegerLiteral", "DecimalLiteral", "DecimalIntegerLiteral", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'float'", "'char'", 
		"'if'", "'else'", "'while'", "'for'", "'println'", "'new'", "'this'", 
		"'&&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'+'", "'-'", "'*'", "'**'", 
		"'!'", "'['", "']'", "'('", "')'", "'return'", "'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "AND", 
		"LT", "LTE", "GT", "GTE", "EQU", "PLUS", "MINUS", "TIMES", "POWER", "NOT", 
		"LSB", "RSB", "LP", "RP", "RETURN", "EQ", "REF", "BooleanLiteral", "Identifier", 
		"IntegerLiteral", "DecimalLiteral", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u017c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u011c\n*\3+\3+\7+\u0120\n+\f+\16+\u0123\13+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3/\3/\3\60\3\60\3\61\3\61\5\61\u0133\n\61\3\61\3\61\5\61\u0137\n\61"+
		"\3\61\3\61\3\61\5\61\u013c\n\61\5\61\u013e\n\61\3\62\3\62\5\62\u0142\n"+
		"\62\3\62\5\62\u0145\n\62\3\63\3\63\5\63\u0149\n\63\3\64\3\64\3\65\6\65"+
		"\u014e\n\65\r\65\16\65\u014f\3\66\3\66\5\66\u0154\n\66\3\67\6\67\u0157"+
		"\n\67\r\67\16\67\u0158\38\68\u015c\n8\r8\168\u015d\38\38\39\39\39\39\7"+
		"9\u0166\n9\f9\169\u0169\139\39\39\39\39\39\3:\3:\3:\3:\7:\u0174\n:\f:"+
		"\16:\u0177\13:\3:\3:\3:\3:\4\u0167\u0175\2;\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W\2Y\2[-]._\2a\2c\2e\2g\2i\2k\2m\2o/q\60s\61\3\2\7\6\2&&C\\aac|\7\2"+
		"&&\62;C\\aac|\4\2--//\3\2\63;\5\2\13\f\17\17\"\"\2\u0180\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5{\3\2\2"+
		"\2\7}\3\2\2\2\t\u0084\3\2\2\2\13\u008b\3\2\2\2\r\u0090\3\2\2\2\17\u0095"+
		"\3\2\2\2\21\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a6\3\2\2\2\27\u00a8\3"+
		"\2\2\2\31\u00aa\3\2\2\2\33\u00ae\3\2\2\2\35\u00b6\3\2\2\2\37\u00bc\3\2"+
		"\2\2!\u00c1\3\2\2\2#\u00c4\3\2\2\2%\u00c9\3\2\2\2\'\u00cf\3\2\2\2)\u00d3"+
		"\3\2\2\2+\u00db\3\2\2\2-\u00df\3\2\2\2/\u00e4\3\2\2\2\61\u00e7\3\2\2\2"+
		"\63\u00e9\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f1\3\2\2\2;\u00f4"+
		"\3\2\2\2=\u00f6\3\2\2\2?\u00f8\3\2\2\2A\u00fa\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u0107\3\2"+
		"\2\2O\u010e\3\2\2\2Q\u0110\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u0124"+
		"\3\2\2\2Y\u0126\3\2\2\2[\u0128\3\2\2\2]\u012a\3\2\2\2_\u012e\3\2\2\2a"+
		"\u013d\3\2\2\2c\u013f\3\2\2\2e\u0148\3\2\2\2g\u014a\3\2\2\2i\u014d\3\2"+
		"\2\2k\u0153\3\2\2\2m\u0156\3\2\2\2o\u015b\3\2\2\2q\u0161\3\2\2\2s\u016f"+
		"\3\2\2\2uv\7e\2\2vw\7n\2\2wx\7c\2\2xy\7u\2\2yz\7u\2\2z\4\3\2\2\2{|\7}"+
		"\2\2|\6\3\2\2\2}~\7r\2\2~\177\7w\2\2\177\u0080\7d\2\2\u0080\u0081\7n\2"+
		"\2\u0081\u0082\7k\2\2\u0082\u0083\7e\2\2\u0083\b\3\2\2\2\u0084\u0085\7"+
		"u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7e\2\2\u008a\n\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2\u008f\f\3\2\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094"+
		"\16\3\2\2\2\u0095\u0096\7U\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7i\2\2\u009b\20\3\2\2\2\u009c"+
		"\u009d\7\177\2\2\u009d\22\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7z\2"+
		"\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4"+
		"\7f\2\2\u00a4\u00a5\7u\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7\26"+
		"\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7d\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7"+
		"h\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7j\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7t\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7g\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"&\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7p\2\2"+
		"\u00da*\3\2\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7y\2"+
		"\2\u00de,\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7"+
		"k\2\2\u00e2\u00e3\7u\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6"+
		"\7(\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\62\3\2\2\2\u00e9\u00ea"+
		"\7>\2\2\u00ea\u00eb\7?\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7@\2\2\u00ed\66"+
		"\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f08\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2\u00f3\7?\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5<\3"+
		"\2\2\2\u00f6\u00f7\7/\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9@\3\2"+
		"\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7,\2\2\u00fcB\3\2\2\2\u00fd\u00fe"+
		"\7#\2\2\u00feD\3\2\2\2\u00ff\u0100\7]\2\2\u0100F\3\2\2\2\u0101\u0102\7"+
		"_\2\2\u0102H\3\2\2\2\u0103\u0104\7*\2\2\u0104J\3\2\2\2\u0105\u0106\7+"+
		"\2\2\u0106L\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u010b\7w\2\2\u010b\u010c\7t\2\2\u010c\u010d\7p\2\2\u010d"+
		"N\3\2\2\2\u010e\u010f\7?\2\2\u010fP\3\2\2\2\u0110\u0111\7\60\2\2\u0111"+
		"R\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7t\2\2\u0114\u0115\7w\2\2\u0115"+
		"\u011c\7g\2\2\u0116\u0117\7h\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2"+
		"\u0119\u011a\7u\2\2\u011a\u011c\7g\2\2\u011b\u0112\3\2\2\2\u011b\u0116"+
		"\3\2\2\2\u011cT\3\2\2\2\u011d\u0121\5W,\2\u011e\u0120\5Y-\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"V\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\t\2\2\2\u0125X\3\2\2\2\u0126"+
		"\u0127\t\3\2\2\u0127Z\3\2\2\2\u0128\u0129\5_\60\2\u0129\\\3\2\2\2\u012a"+
		"\u012b\5[.\2\u012b\u012c\13\2\2\2\u012c\u012d\5[.\2\u012d^\3\2\2\2\u012e"+
		"\u012f\5a\61\2\u012f`\3\2\2\2\u0130\u013e\7\62\2\2\u0131\u0133\t\4\2\2"+
		"\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b"+
		"\5g\64\2\u0135\u0137\5c\62\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013c\3\2\2\2\u0138\u0139\5m\67\2\u0139\u013a\5c\62\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0136\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0130\3\2\2\2\u013d\u0132\3\2\2\2\u013eb\3\2\2\2\u013f\u0144\5e\63\2"+
		"\u0140\u0142\5i\65\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0145\5e\63\2\u0144\u0141\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"d\3\2\2\2\u0146\u0149\7\62\2\2\u0147\u0149\5g\64\2\u0148\u0146\3\2\2\2"+
		"\u0148\u0147\3\2\2\2\u0149f\3\2\2\2\u014a\u014b\t\5\2\2\u014bh\3\2\2\2"+
		"\u014c\u014e\5k\66\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150j\3\2\2\2\u0151\u0154\5e\63\2\u0152"+
		"\u0154\7a\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154l\3\2\2\2\u0155"+
		"\u0157\7a\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159n\3\2\2\2\u015a\u015c\t\6\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\b8\2\2\u0160p\3\2\2\2\u0161\u0162\7\61\2\2"+
		"\u0162\u0163\7,\2\2\u0163\u0167\3\2\2\2\u0164\u0166\13\2\2\2\u0165\u0164"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7,\2\2\u016b\u016c\7\61"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b9\2\2\u016er\3\2\2\2\u016f\u0170"+
		"\7\61\2\2\u0170\u0171\7\61\2\2\u0171\u0175\3\2\2\2\u0172\u0174\13\2\2"+
		"\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\f\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\b:\2\2\u017bt\3\2\2\2\22\2\u011b\u0121\u0132"+
		"\u0136\u013b\u013d\u0141\u0144\u0148\u014f\u0153\u0158\u015d\u0167\u0175"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}