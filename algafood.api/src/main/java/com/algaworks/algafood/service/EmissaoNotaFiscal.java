package com.algaworks.algafood.service;

import com.algaworks.algafood.controller.NotificadorEmail;
import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.modelo.Produto;

public class EmissaoNotaFiscal {
	
	public void Emitir(Cliente cliente, Produto produto) {
		NotificadorEmail notifica = new NotificadorEmail();
		notifica.notificar(cliente, "Nota fiscal do produto"  + produto.getNome() + "foi emitida");
	}

}
