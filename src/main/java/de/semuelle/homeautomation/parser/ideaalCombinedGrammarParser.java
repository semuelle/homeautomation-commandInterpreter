package de.semuelle.homeautomation.parser;

// Generated from C:\Users\sebastian\ideaalCombinedGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ideaalCombinedGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, UND=45, ID=46, INT=47, 
		NEWLINE=48, WS=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'Musik'", "'Lampen'", "'aus'", "'senken'", "'einschalten'", 
		"'Stelle'", "'noch'", "'den'", "'oben'", "'Prozent'", "'Schlafzimmer'", 
		"'im'", "'Ist'", "'das'", "'irgendwo'", "'alle'", "'runterfahren'", "'Rolladen'", 
		"'erh�hen'", "'Fenster'", "'Licht'", "'Sind'", "'lauter'", "'ausschalten'", 
		"'in der K�che'", "'Wohnzimmer'", "'Fahre'", "'um'", "'Lichter'", "'die'", 
		"'zu'", "'runter'", "'leiser'", "'Schliesse'", "'ein'", "'auf'", "'Rollaeden'", 
		"'hoch'", "'Bad'", "'stellen'", "'Schalte'", "'Senke'", "'an'", "'Badezimmer'", 
		"'und'", "ID", "INT", "NEWLINE", "WS"
	};
	public static final int
		RULE_testFile = 0, RULE_commandFile = 1, RULE_command = 2, RULE_subcommand = 3, 
		RULE_imperativeCommand = 4, RULE_aktor = 5, RULE_place = 6, RULE_value = 7, 
		RULE_valuedVerb = 8, RULE_verb = 9, RULE_imperative = 10, RULE_valuedImperative = 11, 
		RULE_imperativeValue = 12, RULE_queryFile = 13, RULE_query = 14, RULE_questionWord = 15, 
		RULE_queryValue = 16;
	public static final String[] ruleNames = {
		"testFile", "commandFile", "command", "subcommand", "imperativeCommand", 
		"aktor", "place", "value", "valuedVerb", "verb", "imperative", "valuedImperative", 
		"imperativeValue", "queryFile", "query", "questionWord", "queryValue"
	};

	@Override
	public String getGrammarFileName() { return "ideaalCombinedGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ideaalCombinedGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TestFileContext extends ParserRuleContext {
		public CommandFileContext commandFile() {
			return getRuleContext(CommandFileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ideaalCombinedGrammarParser.EOF, 0); }
		public QueryFileContext queryFile() {
			return getRuleContext(QueryFileContext.class,0);
		}
		public TestFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterTestFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitTestFile(this);
		}
	}

	public final TestFileContext testFile() throws RecognitionException {
		TestFileContext _localctx = new TestFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_testFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); commandFile();
			setState(35); queryFile();
			setState(36); match(EOF);
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

	public static class CommandFileContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ideaalCombinedGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ideaalCombinedGrammarParser.NEWLINE, i);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterCommandFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitCommandFile(this);
		}
	}

	public final CommandFileContext commandFile() throws RecognitionException {
		CommandFileContext _localctx = new CommandFileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commandFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 8) | (1L << 14) | (1L << 16) | (1L << 20) | (1L << 21) | (1L << 27) | (1L << 30) | (1L << 34) | (1L << 41) | (1L << 42))) != 0)) {
				{
				{
				setState(38); command();
				setState(40);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(39); match(NEWLINE);
					}
				}

				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode UND() { return getToken(ideaalCombinedGrammarParser.UND, 0); }
		public SubcommandContext subcommand(int i) {
			return getRuleContext(SubcommandContext.class,i);
		}
		public List<SubcommandContext> subcommand() {
			return getRuleContexts(SubcommandContext.class);
		}
		public ImperativeCommandContext imperativeCommand() {
			return getRuleContext(ImperativeCommandContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case 1:
			case 8:
			case 14:
			case 16:
			case 20:
			case 21:
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(47); subcommand();
				setState(50);
				_la = _input.LA(1);
				if (_la==UND) {
					{
					setState(48); match(UND);
					setState(49); subcommand();
					}
				}

				setState(52); verb();
				}
				}
				break;
			case 6:
			case 27:
			case 34:
			case 41:
			case 42:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); imperativeCommand();
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

	public static class SubcommandContext extends ParserRuleContext {
		public AktorContext aktor() {
			return getRuleContext(AktorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public SubcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterSubcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitSubcommand(this);
		}
	}

	public final SubcommandContext subcommand() throws RecognitionException {
		SubcommandContext _localctx = new SubcommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subcommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(57); aktor();
			setState(59);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 15) | (1L << 25))) != 0)) {
				{
				setState(58); place();
				}
			}

			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(62);
				_la = _input.LA(1);
				if (_la==28 || _la==36) {
					{
					setState(61); value();
					}
				}

				}
				break;

			case 2:
				{
				setState(64); verb();
				}
				break;
			}
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

	public static class ImperativeCommandContext extends ParserRuleContext {
		public AktorContext aktor() {
			return getRuleContext(AktorContext.class,0);
		}
		public ValuedImperativeContext valuedImperative() {
			return getRuleContext(ValuedImperativeContext.class,0);
		}
		public ImperativeValueContext imperativeValue() {
			return getRuleContext(ImperativeValueContext.class,0);
		}
		public ImperativeContext imperative() {
			return getRuleContext(ImperativeContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public ImperativeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperativeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterImperativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitImperativeCommand(this);
		}
	}

	public final ImperativeCommandContext imperativeCommand() throws RecognitionException {
		ImperativeCommandContext _localctx = new ImperativeCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imperativeCommand);
		int _la;
		try {
			setState(79);
			switch (_input.LA(1)) {
			case 34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(67); imperative();
				setState(68); aktor();
				setState(70);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 15) | (1L << 25))) != 0)) {
					{
					setState(69); place();
					}
				}

				}
				}
				break;
			case 6:
			case 27:
			case 41:
			case 42:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(72); valuedImperative();
				setState(73); aktor();
				setState(75);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 15) | (1L << 25))) != 0)) {
					{
					setState(74); place();
					}
				}

				setState(77); imperativeValue();
				}
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

	public static class AktorContext extends ParserRuleContext {
		public AktorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aktor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterAktor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitAktor(this);
		}
	}

	public final AktorContext aktor() throws RecognitionException {
		AktorContext _localctx = new AktorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aktor);
		int _la;
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(82);
				_la = _input.LA(1);
				if (_la==14) {
					{
					setState(81); match(14);
					}
				}

				setState(84); match(21);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==16 || _la==30) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(86); match(29);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==16 || _la==30) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(88); match(2);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(90);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(89); match(30);
					}
				}

				setState(92); match(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==16 || _la==30) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(94); match(37);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				{
				setState(95); match(8);
				}
				setState(96); match(18);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 16) | (1L << 30))) != 0)) {
					{
					setState(97);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 16) | (1L << 30))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(100); match(20);
				}
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

	public static class PlaceContext extends ParserRuleContext {
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitPlace(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_place);
		int _la;
		try {
			setState(107);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(103); match(12);
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 26) | (1L << 39) | (1L << 44))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(25);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(15);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ideaalCombinedGrammarParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==28 || _la==36) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(110); match(INT);
			setState(111); match(10);
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

	public static class ValuedVerbContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuedVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuedVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterValuedVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitValuedVerb(this);
		}
	}

	public final ValuedVerbContext valuedVerb() throws RecognitionException {
		ValuedVerbContext _localctx = new ValuedVerbContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valuedVerb);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case 28:
			case 36:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); value();
				setState(114); match(4);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(19);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); match(40);
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

	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 17) | (1L << 23) | (1L << 24) | (1L << 33) | (1L << 35) | (1L << 43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ImperativeContext extends ParserRuleContext {
		public ImperativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterImperative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitImperative(this);
		}
	}

	public final ImperativeContext imperative() throws RecognitionException {
		ImperativeContext _localctx = new ImperativeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imperative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(34);
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

	public static class ValuedImperativeContext extends ParserRuleContext {
		public ValuedImperativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuedImperative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterValuedImperative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitValuedImperative(this);
		}
	}

	public final ValuedImperativeContext valuedImperative() throws RecognitionException {
		ValuedImperativeContext _localctx = new ValuedImperativeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valuedImperative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 27) | (1L << 41) | (1L << 42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ImperativeValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ImperativeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperativeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterImperativeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitImperativeValue(this);
		}
	}

	public final ImperativeValueContext imperativeValue() throws RecognitionException {
		ImperativeValueContext _localctx = new ImperativeValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imperativeValue);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case 28:
			case 36:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); value();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(43);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(3);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); match(32);
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

	public static class QueryFileContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ideaalCombinedGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ideaalCombinedGrammarParser.NEWLINE, i);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public QueryFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterQueryFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitQueryFile(this);
		}
	}

	public final QueryFileContext queryFile() throws RecognitionException {
		QueryFileContext _localctx = new QueryFileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_queryFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==13 || _la==22) {
				{
				{
				setState(132); query();
				setState(134);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(133); match(NEWLINE);
					}
				}

				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QueryContext extends ParserRuleContext {
		public AktorContext aktor() {
			return getRuleContext(AktorContext.class,0);
		}
		public QueryValueContext queryValue() {
			return getRuleContext(QueryValueContext.class,0);
		}
		public QuestionWordContext questionWord() {
			return getRuleContext(QuestionWordContext.class,0);
		}
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_query);
		int _la;
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(141); questionWord();
				setState(143);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(142); match(7);
					}
				}

				setState(145); aktor();
				setState(147);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 15) | (1L << 25))) != 0)) {
					{
					setState(146); place();
					}
				}

				setState(150);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(149); match(7);
					}
				}

				setState(152); queryValue();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(154); questionWord();
				setState(155); place();
				setState(157);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(156); match(7);
					}
				}

				setState(159); aktor();
				setState(161);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(160); match(7);
					}
				}

				setState(163); queryValue();
				}
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

	public static class QuestionWordContext extends ParserRuleContext {
		public QuestionWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterQuestionWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitQuestionWord(this);
		}
	}

	public final QuestionWordContext questionWord() throws RecognitionException {
		QuestionWordContext _localctx = new QuestionWordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_questionWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==13 || _la==22) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class QueryValueContext extends ParserRuleContext {
		public QueryValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).enterQueryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ideaalCombinedGrammarListener ) ((ideaalCombinedGrammarListener)listener).exitQueryValue(this);
		}
	}

	public final QueryValueContext queryValue() throws RecognitionException {
		QueryValueContext _localctx = new QueryValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_queryValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 31) | (1L << 36) | (1L << 38) | (1L << 43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\63\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\5\3+\n\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3"+
		"\4\5\4\65\n\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\5\5"+
		"\5D\n\5\3\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\5\6R\n\6\3\7"+
		"\5\7U\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"e\n\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u0085\n\16\3\17\3\17\5\17\u0089\n\17\7\17\u008b\n\17\f\17\16\17\u008e"+
		"\13\17\3\20\3\20\5\20\u0092\n\20\3\20\3\20\5\20\u0096\n\20\3\20\5\20\u0099"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a0\n\20\3\20\3\20\5\20\u00a4\n"+
		"\20\3\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\22\3\22\3\22\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\n\4\2\22\22  \5\2\20\20\22\22  \6\2"+
		"\r\r\34\34))..\4\2\36\36&&\t\2\5\5\7\7\23\23\31\32##%%--\5\2\b\b\35\35"+
		"+,\4\2\17\17\30\30\7\2\13\13!!&&((--\u00bf\2$\3\2\2\2\4.\3\2\2\2\69\3"+
		"\2\2\2\b;\3\2\2\2\nQ\3\2\2\2\fg\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22x\3"+
		"\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0084\3\2\2\2\34\u008c\3"+
		"\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$%\5\4\3\2%&\5\34"+
		"\17\2&\'\7\2\2\3\'\3\3\2\2\2(*\5\6\4\2)+\7\62\2\2*)\3\2\2\2*+\3\2\2\2"+
		"+-\3\2\2\2,(\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3"+
		"\2\2\2\61\64\5\b\5\2\62\63\7/\2\2\63\65\5\b\5\2\64\62\3\2\2\2\64\65\3"+
		"\2\2\2\65\66\3\2\2\2\66\67\5\24\13\2\67:\3\2\2\28:\5\n\6\29\61\3\2\2\2"+
		"98\3\2\2\2:\7\3\2\2\2;=\5\f\7\2<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>C\3\2\2"+
		"\2?A\5\20\t\2@?\3\2\2\2@A\3\2\2\2AD\3\2\2\2BD\5\24\13\2C@\3\2\2\2CB\3"+
		"\2\2\2CD\3\2\2\2D\t\3\2\2\2EF\5\26\f\2FH\5\f\7\2GI\5\16\b\2HG\3\2\2\2"+
		"HI\3\2\2\2IR\3\2\2\2JK\5\30\r\2KM\5\f\7\2LN\5\16\b\2ML\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OP\5\32\16\2PR\3\2\2\2QE\3\2\2\2QJ\3\2\2\2R\13\3\2\2\2SU\7"+
		"\20\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vh\7\27\2\2WX\t\2\2\2Xh\7\37\2\2"+
		"YZ\t\2\2\2Zh\7\4\2\2[]\7 \2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^h\7\3\2"+
		"\2_`\t\2\2\2`h\7\'\2\2ab\7\n\2\2bh\7\24\2\2ce\t\3\2\2dc\3\2\2\2de\3\2"+
		"\2\2ef\3\2\2\2fh\7\26\2\2gT\3\2\2\2gW\3\2\2\2gY\3\2\2\2g\\\3\2\2\2g_\3"+
		"\2\2\2ga\3\2\2\2gd\3\2\2\2h\r\3\2\2\2ij\7\16\2\2jn\t\4\2\2kn\7\33\2\2"+
		"ln\7\21\2\2mi\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2op\t\5\2\2pq\7\61"+
		"\2\2qr\7\f\2\2r\21\3\2\2\2st\5\20\t\2tu\7\6\2\2uy\3\2\2\2vy\7\25\2\2w"+
		"y\7*\2\2xs\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\23\3\2\2\2z{\t\6\2\2{\25\3\2\2"+
		"\2|}\7$\2\2}\27\3\2\2\2~\177\t\7\2\2\177\31\3\2\2\2\u0080\u0085\5\20\t"+
		"\2\u0081\u0085\7-\2\2\u0082\u0085\7\5\2\2\u0083\u0085\7\"\2\2\u0084\u0080"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\33\3\2\2\2\u0086\u0088\5\36\20\2\u0087\u0089\7\62\2\2\u0088\u0087\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\35\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0091\5 \21\2\u0090\u0092\7\t\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5\f\7\2\u0094"+
		"\u0096\5\16\b\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0099\7\t\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\5\"\22\2\u009b\u00a8\3\2\2\2\u009c\u009d\5"+
		" \21\2\u009d\u009f\5\16\b\2\u009e\u00a0\7\t\2\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5\f\7\2\u00a2\u00a4\7\t"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\5\"\22\2\u00a6\u00a8\3\2\2\2\u00a7\u008f\3\2\2\2\u00a7\u009c\3"+
		"\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\t\b\2\2\u00aa!\3\2\2\2\u00ab\u00ac"+
		"\t\t\2\2\u00ac#\3\2\2\2\33*.\649=@CHMQT\\dgmx\u0084\u0088\u008c\u0091"+
		"\u0095\u0098\u009f\u00a3\u00a7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}