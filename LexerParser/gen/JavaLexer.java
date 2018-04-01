// Generated from /Users/karthikeyan/Desktop/Changes/Compiler_Design/LexerParser/src/Java.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, ABSTRACT=3, BOOLEAN=4, BREAK=5, CHAR=6, CLASS=7, CONST=8, 
		CONTINUE=9, ELSE=10, EXTENDS=11, FLOAT=12, FOR=13, IF=14, IMPORT=15, INSTANCEOF=16, 
		INT=17, NEW=18, PACKAGE=19, PRIVATE=20, PUBLIC=21, RETURN=22, STATIC=23, 
		SUPER=24, THIS=25, VOID=26, WHILE=27, IntegerLiteral=28, FloatingPointLiteral=29, 
		BooleanLiteral=30, CharacterLiteral=31, StringLiteral=32, NullLiteral=33, 
		LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, LBRACK=38, RBRACK=39, SEMI=40, 
		COMMA=41, DOT=42, ASSIGN=43, GT=44, LT=45, BANG=46, TILDE=47, QUESTION=48, 
		COLON=49, EQUAL=50, LE=51, GE=52, NOTEQUAL=53, AND=54, OR=55, INC=56, 
		DEC=57, ADD=58, SUB=59, MUL=60, DIV=61, BITAND=62, BITOR=63, CARET=64, 
		MOD=65, ADD_ASSIGN=66, SUB_ASSIGN=67, MUL_ASSIGN=68, DIV_ASSIGN=69, AND_ASSIGN=70, 
		OR_ASSIGN=71, XOR_ASSIGN=72, MOD_ASSIGN=73, LSHIFT_ASSIGN=74, RSHIFT_ASSIGN=75, 
		Identifier=76, WS=77, LINE_COMMENT=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ABSTRACT", "BOOLEAN", "BREAK", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "ELSE", "EXTENDS", "FLOAT", "FOR", "IF", "IMPORT", "INSTANCEOF", 
		"INT", "NEW", "PACKAGE", "PRIVATE", "PUBLIC", "RETURN", "STATIC", "SUPER", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
		"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
		"BooleanLiteral", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", 
		"WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'...'", "'::'", "'abstract'", "'boolean'", "'break'", "'char'", 
		"'class'", "'const'", "'continue'", "'else'", "'extends'", "'float'", 
		"'for'", "'if'", "'import'", "'instanceof'", "'int'", "'new'", "'package'", 
		"'private'", "'public'", "'return'", "'static'", "'super'", "'this'", 
		"'void'", "'while'", null, null, null, null, null, "'null'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
		"'>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ABSTRACT", "BOOLEAN", "BREAK", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "ELSE", "EXTENDS", "FLOAT", "FOR", "IF", "IMPORT", "INSTANCEOF", 
		"INT", "NEW", "PACKAGE", "PRIVATE", "PUBLIC", "RETURN", "STATIC", "SUPER", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "Identifier", "WS", "LINE_COMMENT"
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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 94:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 95:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0285\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u0176\n\37"+
		"\3\37\3\37\3\37\5\37\u017b\n\37\5\37\u017d\n\37\3 \3 \5 \u0181\n \3 \5"+
		" \u0184\n \3!\3!\5!\u0188\n!\3\"\3\"\3#\6#\u018d\n#\r#\16#\u018e\3$\3"+
		"$\5$\u0193\n$\3%\6%\u0196\n%\r%\16%\u0197\3&\3&\3\'\3\'\3\'\5\'\u019f"+
		"\n\'\3\'\5\'\u01a2\n\'\3\'\5\'\u01a5\n\'\3\'\3\'\3\'\5\'\u01aa\n\'\3\'"+
		"\5\'\u01ad\n\'\3\'\3\'\3\'\5\'\u01b2\n\'\3\'\3\'\3\'\5\'\u01b7\n\'\3("+
		"\3(\3(\3)\3)\3*\5*\u01bf\n*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u01d0\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01da\n.\3/\3/\3\60\3\60\5"+
		"\60\u01e0\n\60\3\60\3\60\3\61\6\61\u01e5\n\61\r\61\16\61\u01e6\3\62\3"+
		"\62\5\62\u01eb\n\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3"+
		"S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3"+
		"[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3^\3_\3_\7_\u025f\n_\f_\16_\u0262"+
		"\13_\3`\3`\3`\3`\3`\3`\5`\u026a\n`\3a\3a\3a\3a\3a\3a\5a\u0272\na\3b\6"+
		"b\u0275\nb\rb\16b\u0276\3b\3b\3c\3c\3c\3c\7c\u027f\nc\fc\16c\u0282\13"+
		"c\3c\3c\2\2d\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\2=\2?\2A\2C\2E\2G\2I\2K\37M\2O\2Q\2S\2U\2W\2Y [!]\2_\"a\2"+
		"c\2e\2g#i$k%m&o\'q(s)u*w+y,{-}.\177/\u0081\60\u0083\61\u0085\62\u0087"+
		"\63\u0089\64\u008b\65\u008d\66\u008f\67\u00918\u00939\u0095:\u0097;\u0099"+
		"<\u009b=\u009d>\u009f?\u00a1@\u00a3A\u00a5B\u00a7C\u00a9D\u00abE\u00ad"+
		"F\u00afG\u00b1H\u00b3I\u00b5J\u00b7K\u00b9L\u00bbM\u00bdN\u00bf\2\u00c1"+
		"\2\u00c3O\u00c5P\3\2\20\3\2\63;\4\2GGgg\4\2--//\4\2HHhh\4\2))^^\4\2$$"+
		"^^\n\2$$))^^ddhhppttvv\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u028f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2K\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\3\u00c7\3\2\2\2\5\u00cb\3\2\2\2\7\u00ce\3\2\2\2\t\u00d7\3\2\2"+
		"\2\13\u00df\3\2\2\2\r\u00e5\3\2\2\2\17\u00ea\3\2\2\2\21\u00f0\3\2\2\2"+
		"\23\u00f6\3\2\2\2\25\u00ff\3\2\2\2\27\u0104\3\2\2\2\31\u010c\3\2\2\2\33"+
		"\u0112\3\2\2\2\35\u0116\3\2\2\2\37\u0119\3\2\2\2!\u0120\3\2\2\2#\u012b"+
		"\3\2\2\2%\u012f\3\2\2\2\'\u0133\3\2\2\2)\u013b\3\2\2\2+\u0143\3\2\2\2"+
		"-\u014a\3\2\2\2/\u0151\3\2\2\2\61\u0158\3\2\2\2\63\u015e\3\2\2\2\65\u0163"+
		"\3\2\2\2\67\u0168\3\2\2\29\u016e\3\2\2\2;\u0170\3\2\2\2=\u017c\3\2\2\2"+
		"?\u017e\3\2\2\2A\u0187\3\2\2\2C\u0189\3\2\2\2E\u018c\3\2\2\2G\u0192\3"+
		"\2\2\2I\u0195\3\2\2\2K\u0199\3\2\2\2M\u01b6\3\2\2\2O\u01b8\3\2\2\2Q\u01bb"+
		"\3\2\2\2S\u01be\3\2\2\2U\u01c2\3\2\2\2W\u01c4\3\2\2\2Y\u01cf\3\2\2\2["+
		"\u01d9\3\2\2\2]\u01db\3\2\2\2_\u01dd\3\2\2\2a\u01e4\3\2\2\2c\u01ea\3\2"+
		"\2\2e\u01ec\3\2\2\2g\u01ef\3\2\2\2i\u01f4\3\2\2\2k\u01f6\3\2\2\2m\u01f8"+
		"\3\2\2\2o\u01fa\3\2\2\2q\u01fc\3\2\2\2s\u01fe\3\2\2\2u\u0200\3\2\2\2w"+
		"\u0202\3\2\2\2y\u0204\3\2\2\2{\u0206\3\2\2\2}\u0208\3\2\2\2\177\u020a"+
		"\3\2\2\2\u0081\u020c\3\2\2\2\u0083\u020e\3\2\2\2\u0085\u0210\3\2\2\2\u0087"+
		"\u0212\3\2\2\2\u0089\u0214\3\2\2\2\u008b\u0217\3\2\2\2\u008d\u021a\3\2"+
		"\2\2\u008f\u021d\3\2\2\2\u0091\u0220\3\2\2\2\u0093\u0223\3\2\2\2\u0095"+
		"\u0226\3\2\2\2\u0097\u0229\3\2\2\2\u0099\u022c\3\2\2\2\u009b\u022e\3\2"+
		"\2\2\u009d\u0230\3\2\2\2\u009f\u0232\3\2\2\2\u00a1\u0234\3\2\2\2\u00a3"+
		"\u0236\3\2\2\2\u00a5\u0238\3\2\2\2\u00a7\u023a\3\2\2\2\u00a9\u023c\3\2"+
		"\2\2\u00ab\u023f\3\2\2\2\u00ad\u0242\3\2\2\2\u00af\u0245\3\2\2\2\u00b1"+
		"\u0248\3\2\2\2\u00b3\u024b\3\2\2\2\u00b5\u024e\3\2\2\2\u00b7\u0251\3\2"+
		"\2\2\u00b9\u0254\3\2\2\2\u00bb\u0258\3\2\2\2\u00bd\u025c\3\2\2\2\u00bf"+
		"\u0269\3\2\2\2\u00c1\u0271\3\2\2\2\u00c3\u0274\3\2\2\2\u00c5\u027a\3\2"+
		"\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7\60\2\2\u00ca"+
		"\4\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\7<\2\2\u00cd\6\3\2\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\b\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\n\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e4\f\3\2\2\2\u00e5"+
		"\u00e6\7e\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2"+
		"\u00e9\16\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7"+
		"c\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7u\2\2\u00ef\20\3\2\2\2\u00f0\u00f1"+
		"\7e\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5\22\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fc\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe\24\3\2\2\2\u00ff\u0100\7"+
		"g\2\2\u0100\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103\26"+
		"\3\2\2\2\u0104\u0105\7g\2\2\u0105\u0106\7z\2\2\u0106\u0107\7v\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010a\u010b\7u\2\2"+
		"\u010b\30\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7n\2\2\u010e\u010f\7"+
		"q\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\32\3\2\2\2\u0112\u0113"+
		"\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115\34\3\2\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7h\2\2\u0118\36\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7o\2\2\u011b\u011c\7r\2\2\u011c\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e"+
		"\u011f\7v\2\2\u011f \3\2\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122"+
		"\u0123\7u\2\2\u0123\u0124\7v\2\2\u0124\u0125\7c\2\2\u0125\u0126\7p\2\2"+
		"\u0126\u0127\7e\2\2\u0127\u0128\7g\2\2\u0128\u0129\7q\2\2\u0129\u012a"+
		"\7h\2\2\u012a\"\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e"+
		"\7v\2\2\u012e$\3\2\2\2\u012f\u0130\7p\2\2\u0130\u0131\7g\2\2\u0131\u0132"+
		"\7y\2\2\u0132&\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0135\7c\2\2\u0135\u0136"+
		"\7e\2\2\u0136\u0137\7m\2\2\u0137\u0138\7c\2\2\u0138\u0139\7i\2\2\u0139"+
		"\u013a\7g\2\2\u013a(\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7t\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7x\2\2\u013f\u0140\7c\2\2\u0140\u0141\7v\2\2"+
		"\u0141\u0142\7g\2\2\u0142*\3\2\2\2\u0143\u0144\7r\2\2\u0144\u0145\7w\2"+
		"\2\u0145\u0146\7d\2\2\u0146\u0147\7n\2\2\u0147\u0148\7k\2\2\u0148\u0149"+
		"\7e\2\2\u0149,\3\2\2\2\u014a\u014b\7t\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7w\2\2\u014e\u014f\7t\2\2\u014f\u0150\7p\2\2\u0150"+
		".\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153\7v\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7v\2\2\u0155\u0156\7k\2\2\u0156\u0157\7e\2\2\u0157\60\3\2\2\2\u0158"+
		"\u0159\7u\2\2\u0159\u015a\7w\2\2\u015a\u015b\7r\2\2\u015b\u015c\7g\2\2"+
		"\u015c\u015d\7t\2\2\u015d\62\3\2\2\2\u015e\u015f\7v\2\2\u015f\u0160\7"+
		"j\2\2\u0160\u0161\7k\2\2\u0161\u0162\7u\2\2\u0162\64\3\2\2\2\u0163\u0164"+
		"\7x\2\2\u0164\u0165\7q\2\2\u0165\u0166\7k\2\2\u0166\u0167\7f\2\2\u0167"+
		"\66\3\2\2\2\u0168\u0169\7y\2\2\u0169\u016a\7j\2\2\u016a\u016b\7k\2\2\u016b"+
		"\u016c\7n\2\2\u016c\u016d\7g\2\2\u016d8\3\2\2\2\u016e\u016f\5;\36\2\u016f"+
		":\3\2\2\2\u0170\u0171\5=\37\2\u0171<\3\2\2\2\u0172\u017d\7\62\2\2\u0173"+
		"\u017a\5C\"\2\u0174\u0176\5? \2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2"+
		"\2\u0176\u017b\3\2\2\2\u0177\u0178\5I%\2\u0178\u0179\5? \2\u0179\u017b"+
		"\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u0172\3\2\2\2\u017c\u0173\3\2\2\2\u017d>\3\2\2\2\u017e\u0183\5A!\2\u017f"+
		"\u0181\5E#\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2"+
		"\2\u0182\u0184\5A!\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184@\3"+
		"\2\2\2\u0185\u0188\7\62\2\2\u0186\u0188\5C\"\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188B\3\2\2\2\u0189\u018a\t\2\2\2\u018aD\3\2\2\2\u018b"+
		"\u018d\5G$\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018fF\3\2\2\2\u0190\u0193\5A!\2\u0191\u0193\7"+
		"a\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193H\3\2\2\2\u0194\u0196"+
		"\7a\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198J\3\2\2\2\u0199\u019a\5M\'\2\u019aL\3\2\2\2\u019b"+
		"\u019c\5? \2\u019c\u019e\7\60\2\2\u019d\u019f\5? \2\u019e\u019d\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\5O(\2\u01a1\u01a0"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5W,\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b7\3\2\2\2\u01a6\u01a7\7\60"+
		"\2\2\u01a7\u01a9\5? \2\u01a8\u01aa\5O(\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5W,\2\u01ac\u01ab\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01b7\3\2\2\2\u01ae\u01af\5? \2\u01af\u01b1\5O(\2"+
		"\u01b0\u01b2\5W,\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b7"+
		"\3\2\2\2\u01b3\u01b4\5? \2\u01b4\u01b5\5W,\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u019b\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b3\3\2"+
		"\2\2\u01b7N\3\2\2\2\u01b8\u01b9\5Q)\2\u01b9\u01ba\5S*\2\u01baP\3\2\2\2"+
		"\u01bb\u01bc\t\3\2\2\u01bcR\3\2\2\2\u01bd\u01bf\5U+\2\u01be\u01bd\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5? \2\u01c1T"+
		"\3\2\2\2\u01c2\u01c3\t\4\2\2\u01c3V\3\2\2\2\u01c4\u01c5\t\5\2\2\u01c5"+
		"X\3\2\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7w\2\2\u01c9"+
		"\u01d0\7g\2\2\u01ca\u01cb\7h\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7n\2\2"+
		"\u01cd\u01ce\7u\2\2\u01ce\u01d0\7g\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01ca"+
		"\3\2\2\2\u01d0Z\3\2\2\2\u01d1\u01d2\7)\2\2\u01d2\u01d3\5]/\2\u01d3\u01d4"+
		"\7)\2\2\u01d4\u01da\3\2\2\2\u01d5\u01d6\7)\2\2\u01d6\u01d7\5e\63\2\u01d7"+
		"\u01d8\7)\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d5\3\2"+
		"\2\2\u01da\\\3\2\2\2\u01db\u01dc\n\6\2\2\u01dc^\3\2\2\2\u01dd\u01df\7"+
		"$\2\2\u01de\u01e0\5a\61\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\7$\2\2\u01e2`\3\2\2\2\u01e3\u01e5\5c\62\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7b\3\2\2\2\u01e8\u01eb\n\7\2\2\u01e9\u01eb\5e\63\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebd\3\2\2\2\u01ec\u01ed\7^\2\2\u01ed\u01ee"+
		"\t\b\2\2\u01eef\3\2\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1\7w\2\2\u01f1\u01f2"+
		"\7n\2\2\u01f2\u01f3\7n\2\2\u01f3h\3\2\2\2\u01f4\u01f5\7*\2\2\u01f5j\3"+
		"\2\2\2\u01f6\u01f7\7+\2\2\u01f7l\3\2\2\2\u01f8\u01f9\7}\2\2\u01f9n\3\2"+
		"\2\2\u01fa\u01fb\7\177\2\2\u01fbp\3\2\2\2\u01fc\u01fd\7]\2\2\u01fdr\3"+
		"\2\2\2\u01fe\u01ff\7_\2\2\u01fft\3\2\2\2\u0200\u0201\7=\2\2\u0201v\3\2"+
		"\2\2\u0202\u0203\7.\2\2\u0203x\3\2\2\2\u0204\u0205\7\60\2\2\u0205z\3\2"+
		"\2\2\u0206\u0207\7?\2\2\u0207|\3\2\2\2\u0208\u0209\7@\2\2\u0209~\3\2\2"+
		"\2\u020a\u020b\7>\2\2\u020b\u0080\3\2\2\2\u020c\u020d\7#\2\2\u020d\u0082"+
		"\3\2\2\2\u020e\u020f\7\u0080\2\2\u020f\u0084\3\2\2\2\u0210\u0211\7A\2"+
		"\2\u0211\u0086\3\2\2\2\u0212\u0213\7<\2\2\u0213\u0088\3\2\2\2\u0214\u0215"+
		"\7?\2\2\u0215\u0216\7?\2\2\u0216\u008a\3\2\2\2\u0217\u0218\7>\2\2\u0218"+
		"\u0219\7?\2\2\u0219\u008c\3\2\2\2\u021a\u021b\7@\2\2\u021b\u021c\7?\2"+
		"\2\u021c\u008e\3\2\2\2\u021d\u021e\7#\2\2\u021e\u021f\7?\2\2\u021f\u0090"+
		"\3\2\2\2\u0220\u0221\7(\2\2\u0221\u0222\7(\2\2\u0222\u0092\3\2\2\2\u0223"+
		"\u0224\7~\2\2\u0224\u0225\7~\2\2\u0225\u0094\3\2\2\2\u0226\u0227\7-\2"+
		"\2\u0227\u0228\7-\2\2\u0228\u0096\3\2\2\2\u0229\u022a\7/\2\2\u022a\u022b"+
		"\7/\2\2\u022b\u0098\3\2\2\2\u022c\u022d\7-\2\2\u022d\u009a\3\2\2\2\u022e"+
		"\u022f\7/\2\2\u022f\u009c\3\2\2\2\u0230\u0231\7,\2\2\u0231\u009e\3\2\2"+
		"\2\u0232\u0233\7\61\2\2\u0233\u00a0\3\2\2\2\u0234\u0235\7(\2\2\u0235\u00a2"+
		"\3\2\2\2\u0236\u0237\7~\2\2\u0237\u00a4\3\2\2\2\u0238\u0239\7`\2\2\u0239"+
		"\u00a6\3\2\2\2\u023a\u023b\7\'\2\2\u023b\u00a8\3\2\2\2\u023c\u023d\7-"+
		"\2\2\u023d\u023e\7?\2\2\u023e\u00aa\3\2\2\2\u023f\u0240\7/\2\2\u0240\u0241"+
		"\7?\2\2\u0241\u00ac\3\2\2\2\u0242\u0243\7,\2\2\u0243\u0244\7?\2\2\u0244"+
		"\u00ae\3\2\2\2\u0245\u0246\7\61\2\2\u0246\u0247\7?\2\2\u0247\u00b0\3\2"+
		"\2\2\u0248\u0249\7(\2\2\u0249\u024a\7?\2\2\u024a\u00b2\3\2\2\2\u024b\u024c"+
		"\7~\2\2\u024c\u024d\7?\2\2\u024d\u00b4\3\2\2\2\u024e\u024f\7`\2\2\u024f"+
		"\u0250\7?\2\2\u0250\u00b6\3\2\2\2\u0251\u0252\7\'\2\2\u0252\u0253\7?\2"+
		"\2\u0253\u00b8\3\2\2\2\u0254\u0255\7>\2\2\u0255\u0256\7>\2\2\u0256\u0257"+
		"\7?\2\2\u0257\u00ba\3\2\2\2\u0258\u0259\7@\2\2\u0259\u025a\7@\2\2\u025a"+
		"\u025b\7?\2\2\u025b\u00bc\3\2\2\2\u025c\u0260\5\u00bf`\2\u025d\u025f\5"+
		"\u00c1a\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2"+
		"\u0260\u0261\3\2\2\2\u0261\u00be\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u026a"+
		"\t\t\2\2\u0264\u0265\n\n\2\2\u0265\u026a\6`\2\2\u0266\u0267\t\13\2\2\u0267"+
		"\u0268\t\f\2\2\u0268\u026a\6`\3\2\u0269\u0263\3\2\2\2\u0269\u0264\3\2"+
		"\2\2\u0269\u0266\3\2\2\2\u026a\u00c0\3\2\2\2\u026b\u0272\t\r\2\2\u026c"+
		"\u026d\n\n\2\2\u026d\u0272\6a\4\2\u026e\u026f\t\13\2\2\u026f\u0270\t\f"+
		"\2\2\u0270\u0272\6a\5\2\u0271\u026b\3\2\2\2\u0271\u026c\3\2\2\2\u0271"+
		"\u026e\3\2\2\2\u0272\u00c2\3\2\2\2\u0273\u0275\t\16\2\2\u0274\u0273\3"+
		"\2\2\2\u0275\u0276\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\bb\2\2\u0279\u00c4\3\2\2\2\u027a\u027b\7\61"+
		"\2\2\u027b\u027c\7\61\2\2\u027c\u0280\3\2\2\2\u027d\u027f\n\17\2\2\u027e"+
		"\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\bc\2\2\u0284"+
		"\u00c6\3\2\2\2\36\2\u0175\u017a\u017c\u0180\u0183\u0187\u018e\u0192\u0197"+
		"\u019e\u01a1\u01a4\u01a9\u01ac\u01b1\u01b6\u01be\u01cf\u01d9\u01df\u01e6"+
		"\u01ea\u0260\u0269\u0271\u0276\u0280\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}