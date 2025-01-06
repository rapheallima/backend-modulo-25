package dao;

import Main.Cliente;

public class ClienteDAOMock implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		return true;
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}
