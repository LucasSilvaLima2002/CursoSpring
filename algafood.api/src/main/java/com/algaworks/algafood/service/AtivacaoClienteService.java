package com.algaworks.algafood.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.controller.NotificadorEmail;
import com.algaworks.algafood.modelo.Cliente;


public class AtivacaoClienteService {
	
	
	NotificadorEmail notifica = new NotificadorEmail();
	
	public void ativar(Cliente cliente) {
		cliente.Ativar();
		notifica.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	}
	

