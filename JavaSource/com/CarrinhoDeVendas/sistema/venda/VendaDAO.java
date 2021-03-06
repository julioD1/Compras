package com.sistema.venda;

import java.util.List;

import com.sistema.produto.Produto;

public interface VendaDAO {

	public void registra(Venda venda);

	public List<Venda> getLista();

	public void excluir(Venda venda);

	public boolean existeEstoqueProduto(Produto produto);

	public void reduzEstoqueProduto(Produto produto);

}
