/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.praticas.validadores;

import br.edu.ifpb.praticas.entidade.Filme;
import java.time.LocalDate;

/**
 *
 * @author jose2
 */
public class ValidadoFilme implements IValidadoFilme{

    @Override
    public boolean filmeNull(Filme filme) throws Invalid0FilmeException {
        if(filme == null)
            throw new Invalid0FilmeException("Esse filme não existe");
        else return false;
    }

    @Override
    public boolean NoneNull(Filme filme) {
        if(filme.getNome().trim().isEmpty())
            return true;
        return false;
    }

    @Override
    public boolean anoInvalido(Filme filme) {
        
        if(filme.getAno()<1900 || filme.getAno() > LocalDate.now().getYear())
            return true;
        return false;
    }
    
}
