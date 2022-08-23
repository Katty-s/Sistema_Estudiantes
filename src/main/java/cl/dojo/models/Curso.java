package cl.dojo.models;

public class Curso {

	private int codigoCurso;
	private String fechaInicio;
	private String fechaTermino;
	private int codigoComuna;
	private String codigoPlanFormativo;
	
	
	public Curso() {
		super();
	}


	public Curso(int codigoCurso, String fechaInicio, String fechaTermino, int codigoComuna,
			String codigoPlanFormativo) {
		super();
		this.codigoCurso = codigoCurso;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.codigoComuna = codigoComuna;
		this.codigoPlanFormativo = codigoPlanFormativo;
	}


	public int getCodigoCurso() {
		return codigoCurso;
	}


	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}


	public String getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public String getFechaTermino() {
		return fechaTermino;
	}


	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}


	public int getCodigoComuna() {
		return codigoComuna;
	}


	public void setCodigoComuna(int codigoComuna) {
		this.codigoComuna = codigoComuna;
	}


	public String getCodigoPlanFormativo() {
		return codigoPlanFormativo;
	}


	public void setCodigoPlanFormativo(String codigoPlanFormativo) {
		this.codigoPlanFormativo = codigoPlanFormativo;
	}


	@Override
	public String toString() {
		return "Curso [getCodigoCurso()=" + getCodigoCurso() + ", getFechaInicio()=" + getFechaInicio()
				+ ", getFechaTermino()=" + getFechaTermino() + ", getCodigoComuna()=" + getCodigoComuna()
				+ ", getCodigoPlanFormativo()=" + getCodigoPlanFormativo() + "]";
	}
	
	
	
	
   	
	
	
	
}
