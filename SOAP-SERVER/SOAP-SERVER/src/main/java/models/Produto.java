package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


//Anotações do JAX-B
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) // Para serializar todos os campos por padrão
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
