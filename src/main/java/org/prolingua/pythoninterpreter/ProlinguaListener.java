// Generated from Prolingua.g4 by ANTLR 4.7
package org.prolingua.pythoninterpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProlinguaParser}.
 */
public interface ProlinguaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProlinguaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProlinguaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProlinguaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProlinguaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(ProlinguaParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(ProlinguaParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#elifstatement}.
	 * @param ctx the parse tree
	 */
	void enterElifstatement(ProlinguaParser.ElifstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#elifstatement}.
	 * @param ctx the parse tree
	 */
	void exitElifstatement(ProlinguaParser.ElifstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(ProlinguaParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(ProlinguaParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(ProlinguaParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(ProlinguaParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintstatement(ProlinguaParser.PrintstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintstatement(ProlinguaParser.PrintstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignstatement(ProlinguaParser.AssignstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#assignstatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignstatement(ProlinguaParser.AssignstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(ProlinguaParser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(ProlinguaParser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(ProlinguaParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(ProlinguaParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(ProlinguaParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(ProlinguaParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#elifblock}.
	 * @param ctx the parse tree
	 */
	void enterElifblock(ProlinguaParser.ElifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#elifblock}.
	 * @param ctx the parse tree
	 */
	void exitElifblock(ProlinguaParser.ElifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void enterElseblock(ProlinguaParser.ElseblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#elseblock}.
	 * @param ctx the parse tree
	 */
	void exitElseblock(ProlinguaParser.ElseblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#whileblock}.
	 * @param ctx the parse tree
	 */
	void enterWhileblock(ProlinguaParser.WhileblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#whileblock}.
	 * @param ctx the parse tree
	 */
	void exitWhileblock(ProlinguaParser.WhileblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProlinguaParser#forblock}.
	 * @param ctx the parse tree
	 */
	void enterForblock(ProlinguaParser.ForblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProlinguaParser#forblock}.
	 * @param ctx the parse tree
	 */
	void exitForblock(ProlinguaParser.ForblockContext ctx);
}