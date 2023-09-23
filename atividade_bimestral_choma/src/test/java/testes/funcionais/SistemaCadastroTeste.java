package testes.funcionais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SistemaCadastroTeste {
	
	@Test
	public void deveCadastrarProduto() {
		SistemaCadastro sistemaCadastro = new SistemaCadastro();
		
		assertEquals(true, sistemaCadastro.adicionarProduto("renan", 18.00));
	}
	
	@Test
	public void deveListarProdutos() {
		SistemaCadastro sistemaCadastro = new SistemaCadastro();
		
		assertEquals("Lista de Produtos:\n", sistemaCadastro.listarProdutos());
	}

	@Test
	public void deveBuscarProduto(){
		SistemaCadastro sistemaCadastro = new SistemaCadastro();
		
		assertEquals("Resultados da busca por 'renan':\n",sistemaCadastro.buscarProduto("renan"));
	}
}
