package br.com.welc.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

	@Override
	public void buscar() {
        throw new UnsupportedOperationException("Não funciona a opção buscar no banco");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
        throw new UnsupportedOperationException("Não funciona  a opção exluir no banco");
		
	}

	@Override
	public void atualizar() {
        throw new UnsupportedOperationException("Não funciona a opção ataulizar no banco");
		
	}
}
