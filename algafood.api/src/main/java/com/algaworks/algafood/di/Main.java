package com.algaworks.algafood.di;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.modelo.Produto;
import com.algaworks.algafood.service.AtivacaoClienteService;
import com.algaworks.algafood.service.EmissaoNotaFiscal;

public class Main {

	public static void main(String[] args) {
		
	
	

		
	Cliente Lucas = new Cliente("Lucas","szlucas","123");
	Cliente Jorge = new Cliente("Maria","maria","234");
	
	
	AtivacaoClienteService teste = new AtivacaoClienteService();	
	teste.ativar(Lucas);
	teste.ativar(Jorge);
	
		
	}
}
