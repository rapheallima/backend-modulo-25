package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.Cliente;
import dao.ClienteDAOMock;
import dao.IClienteDAO;

public class ClienteDAOTest {

	private IClienteDAO clienteDao;

	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDao = new ClienteDAOMock();
	}

	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(234234234L);
		cliente.setNome("Raphael");
		cliente.setCidade("SC");
		cliente.setEstado("SC");
		cliente.setNumero(12);
		cliente.setTel(234523452);
		clienteDao.salvar(cliente);

	}

	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDao.salvar(cliente);

		Assert.assertTrue(retorno);

	}

	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

		Assert.assertNotNull(clienteConsultado);

	}

	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}

	@Test
	public void alterarCliente() {
		cliente.setNome("Lima");
		clienteDao.alterar(cliente);

		Assert.assertEquals("Lima", cliente.getNome());
	}

}
