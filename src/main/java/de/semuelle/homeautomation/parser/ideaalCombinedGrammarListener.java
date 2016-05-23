package de.semuelle.homeautomation.parser;

// Generated from C:\Users\sebastian\ideaalCombinedGrammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ideaalCombinedGrammarParser}.
 */
public interface ideaalCombinedGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#queryFile}.
	 * @param ctx the parse tree
	 */
	void enterQueryFile(@NotNull ideaalCombinedGrammarParser.QueryFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#queryFile}.
	 * @param ctx the parse tree
	 */
	void exitQueryFile(@NotNull ideaalCombinedGrammarParser.QueryFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#aktor}.
	 * @param ctx the parse tree
	 */
	void enterAktor(@NotNull ideaalCombinedGrammarParser.AktorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#aktor}.
	 * @param ctx the parse tree
	 */
	void exitAktor(@NotNull ideaalCombinedGrammarParser.AktorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#commandFile}.
	 * @param ctx the parse tree
	 */
	void enterCommandFile(@NotNull ideaalCombinedGrammarParser.CommandFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#commandFile}.
	 * @param ctx the parse tree
	 */
	void exitCommandFile(@NotNull ideaalCombinedGrammarParser.CommandFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#imperativeValue}.
	 * @param ctx the parse tree
	 */
	void enterImperativeValue(@NotNull ideaalCombinedGrammarParser.ImperativeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#imperativeValue}.
	 * @param ctx the parse tree
	 */
	void exitImperativeValue(@NotNull ideaalCombinedGrammarParser.ImperativeValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull ideaalCombinedGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull ideaalCombinedGrammarParser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull ideaalCombinedGrammarParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull ideaalCombinedGrammarParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull ideaalCombinedGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull ideaalCombinedGrammarParser.CommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#questionWord}.
	 * @param ctx the parse tree
	 */
	void enterQuestionWord(@NotNull ideaalCombinedGrammarParser.QuestionWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#questionWord}.
	 * @param ctx the parse tree
	 */
	void exitQuestionWord(@NotNull ideaalCombinedGrammarParser.QuestionWordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#imperativeCommand}.
	 * @param ctx the parse tree
	 */
	void enterImperativeCommand(@NotNull ideaalCombinedGrammarParser.ImperativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#imperativeCommand}.
	 * @param ctx the parse tree
	 */
	void exitImperativeCommand(@NotNull ideaalCombinedGrammarParser.ImperativeCommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#testFile}.
	 * @param ctx the parse tree
	 */
	void enterTestFile(@NotNull ideaalCombinedGrammarParser.TestFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#testFile}.
	 * @param ctx the parse tree
	 */
	void exitTestFile(@NotNull ideaalCombinedGrammarParser.TestFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#valuedVerb}.
	 * @param ctx the parse tree
	 */
	void enterValuedVerb(@NotNull ideaalCombinedGrammarParser.ValuedVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#valuedVerb}.
	 * @param ctx the parse tree
	 */
	void exitValuedVerb(@NotNull ideaalCombinedGrammarParser.ValuedVerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#subcommand}.
	 * @param ctx the parse tree
	 */
	void enterSubcommand(@NotNull ideaalCombinedGrammarParser.SubcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#subcommand}.
	 * @param ctx the parse tree
	 */
	void exitSubcommand(@NotNull ideaalCombinedGrammarParser.SubcommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(@NotNull ideaalCombinedGrammarParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(@NotNull ideaalCombinedGrammarParser.PlaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#queryValue}.
	 * @param ctx the parse tree
	 */
	void enterQueryValue(@NotNull ideaalCombinedGrammarParser.QueryValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#queryValue}.
	 * @param ctx the parse tree
	 */
	void exitQueryValue(@NotNull ideaalCombinedGrammarParser.QueryValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ideaalCombinedGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ideaalCombinedGrammarParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#imperative}.
	 * @param ctx the parse tree
	 */
	void enterImperative(@NotNull ideaalCombinedGrammarParser.ImperativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#imperative}.
	 * @param ctx the parse tree
	 */
	void exitImperative(@NotNull ideaalCombinedGrammarParser.ImperativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ideaalCombinedGrammarParser#valuedImperative}.
	 * @param ctx the parse tree
	 */
	void enterValuedImperative(@NotNull ideaalCombinedGrammarParser.ValuedImperativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ideaalCombinedGrammarParser#valuedImperative}.
	 * @param ctx the parse tree
	 */
	void exitValuedImperative(@NotNull ideaalCombinedGrammarParser.ValuedImperativeContext ctx);
}