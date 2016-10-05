package br.edu.ifpb.praticas.testeIntegracao;

import br.edu.ifpb.praticas.entidade.Filme;
import br.edu.ifpb.praticas.exception.FimeExceotion;
import br.edu.ifpb.praticas.servicos.FilmeServico;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.LinkedList;
import java.util.List;
import static org.mockito.Mockito.*;

/**
 * @author Jose 2
 */
public class FilmeTest {

    @Mock
    private FilmeServico dao;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);


        List<Filme> nfs = new LinkedList<Filme>();
        nfs.add(new Filme("Homem de aco", "aca", 2015, 3));
        doReturn(nfs).when(dao).listar();

    }

    @Test(expected = FimeExceotion.class)
    public void naoDevePermitirDuasFilmesComMesmoNome() throws FimeExceotion {
        Filme Filme = new Filme("Homem de aco", "", 2015, 3);
        verify(dao, atLeastOnce()).salvar(Filme);
    }


}
