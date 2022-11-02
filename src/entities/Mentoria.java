package entities;

import java.util.Date;

public class Mentoria extends Conteudo {
	
	private Date dataDaMentoria;
	
	public Mentoria () {
	}

	public Mentoria(String titulo, String descricao, Date dataDaMentoria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDaMentoria = dataDaMentoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDaMentoria() {
		return dataDaMentoria;
	}

	public void setDataDaMentoria(Date dataDaMentoria) {
		this.dataDaMentoria = dataDaMentoria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
}