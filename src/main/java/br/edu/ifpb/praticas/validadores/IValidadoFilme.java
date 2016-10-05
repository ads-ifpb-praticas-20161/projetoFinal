/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.validadores;

import br.edu.ifpb.praticas.entidade.Filme;

/**
 *
 * @author jose2
 */
public interface IValidadoFilme {

    public boolean filmeNull(Filme filme) throws Invalid0FilmeException;

    public boolean NoneNull(Filme filme);

    public boolean anoInvalido(Filme filme);
}
