package br.edu.ifpb.praticas.controladores;

import br.edu.ifpb.praticas.entidade.Filme;
import br.edu.ifpb.praticas.servicos.FilmeServico;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Jose 2
 */
@Named
@javax.enterprise.context.SessionScoped
public class ControladorCadastroFilme implements Serializable {

    @Inject
    private Filme Filme;

    @Inject
    private FilmeServico servico;

    public String salvar() {
        String url;
        if (this.Filme.getId() == null) {
            this.servico.salvar(Filme);
            url = "index?faces-redirect=true";
        } else {
            servico.atualizar(Filme);
        }
        url = "gerenciamento?faces-redirect=true";

        Filme = new Filme();
        return url;
    }

    public String principal() {
        String url;
        url = "index?faces-redirect=true";
        Filme = new Filme();
        return url;
    }

    public String gerenciamento() {
        String url;
        url = "gerenciamento?faces-redirect=true";
        Filme = new Filme();
        return url;
    }

    public List<Filme> listar() {
        return servico.listar();

    }

    public String atualizar(Long id) {
        Filme = consultar(id);
        if (Filme != null) {
            return "editar.xhtml?faces-redirect=true";
        } else {
            return null;
        }
    }

    public Filme consultar(Long id) {
        return servico.consultar(id);
    }

    public String mostraCliente(Long id) {
        Filme = servico.consultar(id);
        return "informacoes";
    }


    public String remover(Filme c) {
        servico.remover(c);
        return null;
    }

    public Filme getFilme() {
        return Filme;
    }

    public void setFilme(Filme Filme) {
        this.Filme = Filme;
    }

    public void limparCampos() {
        this.Filme = new Filme();
    }

}
