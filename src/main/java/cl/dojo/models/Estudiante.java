package cl.dojo.models;

public class Estudiante {

	private int idEstudiante;
	private String rut;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String direccion;
	private int codigoComuna;
	private int codigoCurso;
	
	public Estudiante() {
		super();
	}

	public Estudiante(int idEstudiante, String rut, String nombre, String apellidoPat, String apellidoMat,
			String direccion, int codigoComuna, int codigoCurso) {
		super();
		this.idEstudiante = idEstudiante;
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.direccion = direccion;
		this.codigoComuna = codigoComuna;
		this.codigoCurso = codigoCurso;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoComuna() {
		return codigoComuna;
	}

	public void setCodigoComuna(int codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	@Override
	public String toString() {
		return "Estudiante [getIdEstudiante()=" + getIdEstudiante() + ", getRut()=" + getRut() + ", getNombre()="
				+ getNombre() + ", getApellidoPat()=" + getApellidoPat() + ", getApellidoMat()=" + getApellidoMat()
				+ ", getDireccion()=" + getDireccion() + ", getCodigoComuna()=" + getCodigoComuna()
				+ ", getCodigoCurso()=" + getCodigoCurso() + "]";
	}
	
	
	
	
}
