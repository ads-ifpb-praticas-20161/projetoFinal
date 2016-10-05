package br.edu.ifpb.praticas.servicos;

import br.edu.ifpb.praticas.entidade.Filme;
import br.edu.ifpb.praticas.repositorios.Repositorio;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * @author jose2
 */
public class FilmeServico implements Serializable {

    @Inject
    private Repositorio<Filme> repositorio;

    public void salvar(Filme f) {
        repositorio.salvar(f);
    }
    public void atualizar(Filme c) {
        repositorio.atualizar(c);
    }
     public void remover(Filme cliente){
         repositorio.remover(cliente);
     }

    public List<Filme> listar() {
        return repositorio.listarTodos();
    }

    public Filme consultar(Long id) {
        return repositorio.consultar(id);
    }

}
