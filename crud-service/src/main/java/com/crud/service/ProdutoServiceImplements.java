package com.crud.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImplements implements ProdutoService {
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		Produto chocolate = new Produto();
		chocolate.setId("1");
		chocolate.setNome("Chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
		
	}
	
	//salva
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
		
	}
	//deleta
	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
		
	}
	//lista
	@Override
	public Collection<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return produtoRepository.values();
	}
	
	

}
