package br.com.welc.service;

import br.com.welc.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(br.com.welc.dao.IClienteDao mockDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = (IClienteDao) mockDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
    
    public  String buscar(br.com.welc.dao.IClienteDao mockDao) {
        clienteDao.buscar();
        return "Sucesso";
    }
    
    
    public String excluir() {
        clienteDao.excluir();
        return "Sucesso";
    }
    public String atualizar() {
        clienteDao.atualizar();
        return "Sucesso";
    }
    
    
    
    
}

