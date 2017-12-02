// Generated from Prolingua.g4 by ANTLR 4.7
package org.prolingua.pythoninterpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProlinguaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TAB=16, SYMBOL=17, 
		RANGE=18, NUM=19, INT=20, STRING=21, LOGIC=22, TRUE=23, FALSE=24, VAR=25;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_ifstatement = 2, RULE_elifstatement = 3, 
		RULE_elsestatement = 4, RULE_whilestatement = 5, RULE_printstatement = 6, 
		RULE_assignstatement = 7, RULE_forstatement = 8, RULE_chunk = 9, RULE_ifblock = 10, 
		RULE_elifblock = 11, RULE_elseblock = 12, RULE_whileblock = 13, RULE_forblock = 14;
	public static final String[] ruleNames = {
		"program", "expression", "ifstatement", "elifstatement", "elsestatement", 
		"whilestatement", "printstatement", "assignstatement", "forstatement", 
		"chunk", "ifblock", "elifblock", "elseblock", "whileblock", "forblock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "' '", "'if '", "' then'", "'or'", "'otherwise'", "'while'", 
		"' do'", "'print '", "'set '", "' to '", "'for '", "' in '", "'range '", 
		"'\n '", "'\t'", null, null, null, null, null, null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TAB", "SYMBOL", "RANGE", "NUM", "INT", "STRING", 
		"LOGIC", "TRUE", "FALSE", "VAR"
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
	public String getGrammarFileName() { return "Prolingua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProlinguaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				chunk();
				setState(32); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(31);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(34); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11))) != 0) );
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ProlinguaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProlinguaParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ProlinguaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ProlinguaParser.NUM, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(ProlinguaParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(ProlinguaParser.SYMBOL, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(41);
				match(T__1);
				setState(42);
				match(SYMBOL);
				setState(43);
				match(T__1);
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49);
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

	public static class IfstatementContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ProlinguaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProlinguaParser.VAR, i);
		}
		public TerminalNode LOGIC() { return getToken(ProlinguaParser.LOGIC, 0); }
		public TerminalNode TRUE() { return getToken(ProlinguaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ProlinguaParser.FALSE, 0); }
		public TerminalNode NUM() { return getToken(ProlinguaParser.NUM, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__2);
			setState(51);
			match(VAR);
			setState(52);
			match(T__1);
			setState(53);
			match(LOGIC);
			setState(54);
			match(T__1);
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << TRUE) | (1L << FALSE) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(56);
			match(T__3);
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

	public static class ElifstatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ElifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterElifstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitElifstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitElifstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifstatementContext elifstatement() throws RecognitionException {
		ElifstatementContext _localctx = new ElifstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(59);
			ifstatement();
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

	public static class ElsestatementContext extends ParserRuleContext {
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitElsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitElsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__5);
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

	public static class WhilestatementContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ProlinguaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProlinguaParser.VAR, i);
		}
		public TerminalNode LOGIC() { return getToken(ProlinguaParser.LOGIC, 0); }
		public TerminalNode TRUE() { return getToken(ProlinguaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ProlinguaParser.FALSE, 0); }
		public TerminalNode NUM() { return getToken(ProlinguaParser.NUM, 0); }
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__6);
			setState(64);
			match(T__1);
			setState(65);
			match(VAR);
			setState(66);
			match(T__1);
			setState(67);
			match(LOGIC);
			setState(68);
			match(T__1);
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << TRUE) | (1L << FALSE) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(T__7);
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

	public static class PrintstatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ProlinguaParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(ProlinguaParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(ProlinguaParser.STRING, 0); }
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterPrintstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitPrintstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitPrintstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__8);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				match(VAR);
				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				setState(75);
				match(NUM);
				}
				break;
			case 4:
				{
				}
				break;
			case 5:
				{
				setState(77);
				match(STRING);
				}
				break;
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

	public static class AssignstatementContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ProlinguaParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterAssignstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitAssignstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitAssignstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstatementContext assignstatement() throws RecognitionException {
		AssignstatementContext _localctx = new AssignstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__9);
			setState(81);
			match(VAR);
			setState(82);
			match(T__10);
			setState(83);
			expression();
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

	public static class ForstatementContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ProlinguaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProlinguaParser.VAR, i);
		}
		public TerminalNode RANGE() { return getToken(ProlinguaParser.RANGE, 0); }
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__11);
			setState(86);
			match(VAR);
			setState(87);
			match(T__12);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(88);
				match(T__13);
				setState(89);
				match(RANGE);
				}
				break;
			case T__0:
				{
				}
				break;
			case VAR:
				{
				setState(91);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ChunkContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public ForblockContext forblock() {
			return getRuleContext(ForblockContext.class,0);
		}
		public PrintstatementContext printstatement() {
			return getRuleContext(PrintstatementContext.class,0);
		}
		public AssignstatementContext assignstatement() {
			return getRuleContext(AssignstatementContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chunk);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				ifblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				whileblock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				forblock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				printstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				assignstatement();
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

	public static class IfblockContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public List<ElifblockContext> elifblock() {
			return getRuleContexts(ElifblockContext.class);
		}
		public ElifblockContext elifblock(int i) {
			return getRuleContext(ElifblockContext.class,i);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			ifstatement();
			setState(106);
			match(T__0);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(TAB);
					setState(108);
					chunk();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					elifblock();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
				elseblock();
				}
				break;
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

	public static class ElifblockContext extends ParserRuleContext {
		public ElifstatementContext elifstatement() {
			return getRuleContext(ElifstatementContext.class,0);
		}
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public ElifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterElifblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitElifblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitElifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifblockContext elifblock() throws RecognitionException {
		ElifblockContext _localctx = new ElifblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elifblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			elifstatement();
			setState(124);
			match(T__14);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(TAB);
					setState(126);
					chunk();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ElseblockContext extends ParserRuleContext {
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterElseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitElseblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitElseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			elsestatement();
			setState(133);
			match(T__0);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(TAB);
					setState(135);
					chunk();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class WhileblockContext extends ParserRuleContext {
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterWhileblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitWhileblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitWhileblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			whilestatement();
			setState(142);
			match(T__0);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					match(TAB);
					setState(144);
					chunk();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ForblockContext extends ParserRuleContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public ForblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).enterForblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProlinguaListener ) ((ProlinguaListener)listener).exitForblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProlinguaVisitor ) return ((ProlinguaVisitor<? extends T>)visitor).visitForblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForblockContext forblock() throws RecognitionException {
		ForblockContext _localctx = new ForblockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			forstatement();
			setState(151);
			match(T__0);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(TAB);
					setState(153);
					chunk();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r"+
		"\2\16\2$\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13"+
		"\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\7\r\u0082"+
		"\n\r\f\r\16\r\u0085\13\r\3\16\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16"+
		"\u008e\13\16\3\17\3\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17"+
		"\3\20\3\20\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\4\2\25\25\33\33\4\2\25\25"+
		"\31\33\2\u00aa\2&\3\2\2\2\4*\3\2\2\2\6\64\3\2\2\2\b<\3\2\2\2\n?\3\2\2"+
		"\2\fA\3\2\2\2\16J\3\2\2\2\20R\3\2\2\2\22W\3\2\2\2\24i\3\2\2\2\26k\3\2"+
		"\2\2\30}\3\2\2\2\32\u0086\3\2\2\2\34\u008f\3\2\2\2\36\u0098\3\2\2\2 \""+
		"\5\24\13\2!#\7\3\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2"+
		"\2\2& \3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*\61\t\2\2\2+"+
		",\7\4\2\2,-\7\23\2\2-.\7\4\2\2.\60\t\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\7\5\2\2\65\66"+
		"\7\33\2\2\66\67\7\4\2\2\678\7\30\2\289\7\4\2\29:\t\3\2\2:;\7\6\2\2;\7"+
		"\3\2\2\2<=\7\7\2\2=>\5\6\4\2>\t\3\2\2\2?@\7\b\2\2@\13\3\2\2\2AB\7\t\2"+
		"\2BC\7\4\2\2CD\7\33\2\2DE\7\4\2\2EF\7\30\2\2FG\7\4\2\2GH\t\3\2\2HI\7\n"+
		"\2\2I\r\3\2\2\2JP\7\13\2\2KQ\7\33\2\2LQ\3\2\2\2MQ\7\25\2\2NQ\3\2\2\2O"+
		"Q\7\27\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\17\3\2\2"+
		"\2RS\7\f\2\2ST\7\33\2\2TU\7\r\2\2UV\5\4\3\2V\21\3\2\2\2WX\7\16\2\2XY\7"+
		"\33\2\2Y^\7\17\2\2Z[\7\20\2\2[_\7\24\2\2\\_\3\2\2\2]_\7\33\2\2^Z\3\2\2"+
		"\2^\\\3\2\2\2^]\3\2\2\2_\23\3\2\2\2`j\5\26\f\2aj\3\2\2\2bj\5\34\17\2c"+
		"j\3\2\2\2dj\5\36\20\2ej\3\2\2\2fj\5\16\b\2gj\3\2\2\2hj\5\20\t\2i`\3\2"+
		"\2\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2"+
		"\2\2ih\3\2\2\2j\25\3\2\2\2kl\5\6\4\2lq\7\3\2\2mn\7\22\2\2np\5\24\13\2"+
		"om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\30\r"+
		"\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z|\5\32"+
		"\16\2{z\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}~\5\b\5\2~\u0083\7\21\2\2\177\u0080"+
		"\7\22\2\2\u0080\u0082\5\24\13\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\31\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\5\n\6\2\u0087\u008c\7\3\2\2\u0088\u0089\7\22\2\2"+
		"\u0089\u008b\5\24\13\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\5\f\7\2\u0090\u0095\7\3\2\2\u0091\u0092\7\22\2\2\u0092\u0094\5"+
		"\24\13\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\35\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\22\n"+
		"\2\u0099\u009e\7\3\2\2\u009a\u009b\7\22\2\2\u009b\u009d\5\24\13\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\37\3\2\2\2\u00a0\u009e\3\2\2\2\17$(\61P^iqw{\u0083\u008c\u0095"+
		"\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}