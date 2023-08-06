package br.com.welc.service;

import br.com.welc.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		   contratoDao.buscar();
	        return "Sucesso";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		   contratoDao.excluir();
	        return "Sucesso";
	}

	
	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		   contratoDao.atualizar();
	        return "Sucesso";
	}
	
}
