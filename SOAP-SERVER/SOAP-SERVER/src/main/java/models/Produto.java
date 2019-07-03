package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


//Anota��es do JAX-B
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) // Para serializar todos os campos por padr�o
public class Produto {

	private String nome;

	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	// O JAX-B precisa de um construtor sem argumentos
	public Produto() {
		super();
	}

	
}
