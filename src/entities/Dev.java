package entities;

import java.util.HashSet;
import java.util.Set;

public class Dev {
	
	private String nome;
	
	Set <Mentoria> mentorias = new HashSet<>();
	Set <Atividade> atividades = new HashSet<>();
	
	public Dev () {
	}
	
	public Dev(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Mentoria> getMentorias() {
		return mentorias;
	}
	
	public Set<Atividade> getAtividades() {
		return atividades;
	}
}