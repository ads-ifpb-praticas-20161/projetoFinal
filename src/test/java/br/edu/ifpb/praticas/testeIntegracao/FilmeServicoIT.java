package br.edu.ifpb.praticas.testeIntegracao;

import br.edu.ifpb.praticas.entidade.Filme;
import br.edu.ifpb.praticas.exception.FimeExceotion;
import br.edu.ifpb.praticas.servicos.FilmeServico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.mockito.InjectMocks;

/**
 * Created by diogomoreira on 17/07/16.
 */
public class FilmeServicoIT extends GenericDatabaseTestCase {
@Inject
    private FilmeServico filmeservico;

private Filme fime;

    @Before
    public void setUp() {
        
    }

    @Test(expected = FimeExceotion.class)
    public void naoDevePermitirDuasFilmesComMesmoNome() throws FimeExceotion {
        this.fime = new Filme( "Homem de aco", "acao", 2015, 4);
        this.filmeservico.salvar(fime);
    }


    public String getDataSetFile() {
        return "src/resources/cadastroFilme.xml";
    }
    
}
