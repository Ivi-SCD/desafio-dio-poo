package entities;

public class Atividade extends Conteudo {
	
	
	private Integer cargaHoraria;
	
	public Atividade () {
	}
	
	public Atividade(String titulo, String descricao, Integer cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
}