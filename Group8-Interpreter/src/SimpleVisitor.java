// Generated from c:\Users\Bob Kyle\Documents\3rd Year\2nd Sem\Group8-Interpreter\Group8-Interpreter\src\Simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SimpleParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SimpleParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(SimpleParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(SimpleParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleParser.ExpressionContext ctx);
}