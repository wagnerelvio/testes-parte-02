package br.com.welc.testes;
import org.junit.Assert;
import org.junit.Test;


import br.com.welc.dao.ContratoDao;
import br.com.welc.dao.IContratoDao;
import br.com.welc.dao.mocks.ContratoDaoMock;
import br.com.welc.service.ContratoService;
import br.com.welc.service.IContratoService;


//import br.com.welc.service.ContratoService;
/*
 * @author wagner.elvio
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirDadosNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarDadosNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    
    
    
    
    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
