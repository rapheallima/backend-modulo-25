package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Main.Cliente;
import Service.ClienteService;
import Service.IClienteService;
import dao.ClienteDAOMock;
import dao.IClienteDAO;

public class ClienteTest {

	private IClienteService clienteService;

	private Cliente cliente;

	public ClienteTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
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

	}

	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);

	}

	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}

	@Test
	public void alterarCliente() {
		cliente.setNome("Lima");
		clienteService.alterar(cliente);

		Assert.assertEquals("Lima", cliente.getNome());
	}

}
