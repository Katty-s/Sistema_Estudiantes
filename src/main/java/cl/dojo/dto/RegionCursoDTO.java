package cl.dojo.dto;

public class RegionCursoDTO {

	private String rut;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private int codigoCurso;
	private String descripcion;
	
	
	public RegionCursoDTO() {
		super();
	}


	public RegionCursoDTO(String rut, String nombre, String apellidoPat, String apellidoMat, int codigoCurso,
			String descripcion) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.codigoCurso = codigoCurso;
		this.descripcion = descripcion;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoPat() {
		return apellidoPat;
	}


	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}


	public String getApellidoMat() {
		return apellidoMat;
	}


	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}


	public int getCodigoCurso() {
		return codigoCurso;
	}


	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "EstudianteCursoDTO [getRut()=" + getRut() + ", getNombre()=" + getNombre() + ", getApellidoPat()="
				+ getApellidoPat() + ", getApellidoMat()=" + getApellidoMat() + ", getCodigoCurso()=" + getCodigoCurso()
				+ ", getDescripcion()=" + getDescripcion() + "]";
	}
	
	
}
