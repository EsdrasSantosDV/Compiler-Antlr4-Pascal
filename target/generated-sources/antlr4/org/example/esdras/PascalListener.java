// Generated from org\example\esdras\Pascal.g4 by ANTLR 4.12.0
package org.example.esdras;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(PascalParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(PascalParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(PascalParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(PascalParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(PascalParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(PascalParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(PascalParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(PascalParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(PascalParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(PascalParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(PascalParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(PascalParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(PascalParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(PascalParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(PascalParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(PascalParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(PascalParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(PascalParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(PascalParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(PascalParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(PascalParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(PascalParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(PascalParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(PascalParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(PascalParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(PascalParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(PascalParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(PascalParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(PascalParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(PascalParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(PascalParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(PascalParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(PascalParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(PascalParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(PascalParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(PascalParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(PascalParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(PascalParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PascalParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PascalParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(PascalParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(PascalParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(PascalParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(PascalParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(PascalParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(PascalParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(PascalParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(PascalParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(PascalParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(PascalParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(PascalParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(PascalParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(PascalParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(PascalParser.IntnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PascalParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PascalParser.IdContext ctx);
}