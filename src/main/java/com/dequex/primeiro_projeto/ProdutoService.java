package com.dequex.primeiro_projeto;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProdutoService {

	private final ProdutoRepository repository;
	
	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}
	
	public List<Produto> listarTodos(){
		return repository.findAll();
	}
	
	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}
	public void deletar(long id) {
		repository.deleteById(id);
	}
	
	public Produto buscarPorId(Long id) {
	    return repository.findById(id)
	        .orElseThrow(() -> new ResponseStatusException(
	            HttpStatus.NOT_FOUND, "Produto não encontrado"));
	}

	public Produto atualizar(Long id, Produto dados) {
	    Produto existente = buscarPorId(id);
	    existente.setNome(dados.getNome());
	    existente.setQuantidade(dados.getQuantidade());
	    existente.setPreco(dados.getPreco());
	    return repository.save(existente);
	}
}
