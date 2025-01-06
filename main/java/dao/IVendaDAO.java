package dao;

import Main.Venda;
import exceptions.TipoChaveNaoEncontradaException;
import generic.IGenericDAO;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
