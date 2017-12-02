// Generated from Prolingua.g4 by ANTLR 4.7
package org.prolingua.pythoninterpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProlinguaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProlinguaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProlinguaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProlinguaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(ProlinguaParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#elifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstatement(ProlinguaParser.ElifstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#elsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestatement(ProlinguaParser.ElsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(ProlinguaParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#printstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstatement(ProlinguaParser.PrintstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#assignstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstatement(ProlinguaParser.AssignstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(ProlinguaParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(ProlinguaParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(ProlinguaParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#elifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifblock(ProlinguaParser.ElifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblock(ProlinguaParser.ElseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#whileblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblock(ProlinguaParser.WhileblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProlinguaParser#forblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForblock(ProlinguaParser.ForblockContext ctx);
}