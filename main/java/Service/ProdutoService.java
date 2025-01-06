package Service;

import Main.Produto;
import generic.IGenericDAO;
import genericS.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IGenericDAO<Produto, String> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}



}
