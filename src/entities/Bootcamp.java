package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private Date dataInicial;
	private Date dataFinal;
	
	private Set <Dev> devs = new HashSet<>();
	private Set <Mentoria> mentorias = new HashSet<>();
	private Set <Atividade> cursos = new HashSet<>();
	
	public Bootcamp () {
	}
	
	public Bootcamp(String nome, String descricao, Date dataInicial, Date dataFinal) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getNome() {
		return nome;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public Set<Mentoria> getMentorias() {
		return mentorias;
	}

	public Set<Atividade> getCursos() {
		return cursos;
	}
}