package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository <Produto,Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	 /* Método Personalizado - Buscar todos os Produtos cujo o preço seja maior 
		 *  do que um valor digitado ordenado pelo preço em ordem crescente*/
	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
