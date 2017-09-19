package com.andre;

import javax.faces.bean.NoneScoped;
import javax.faces.event.NamedEvent;

@NoneScoped
@NamedEvent
public class CadastroProdutoBean {
	
	public void salvar(){
		throw new RuntimeException("Teste de exeção.");
	}

}
