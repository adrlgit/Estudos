package com.andre;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;

import com.andre.pedidovenda.service.NegocioException;

@NamedEvent
@RequestScoped
public class CadastroPedidoBean {
	private List<Integer> itens;
	
	public CadastroPedidoBean(){
		itens = new ArrayList<>();
		itens.add(1);
	}
	
	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi inplementado");
	}

	public List<Integer> getItens() {
		return itens;
	}
	
}
