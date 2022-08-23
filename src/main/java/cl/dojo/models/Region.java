package cl.dojo.models;

public class Region {
	private int codigoRegion;
	private String nombre;
	
	public Region() {
		super();
	}

	public Region(int codigoRegion, String nombre) {
		super();
		this.codigoRegion = codigoRegion;
		this.nombre = nombre;
	}

	public int getCodigoRegion() {
		return codigoRegion;
	}

	public void setCodigoRegion(int codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Region [getCodigoRegion()=" + getCodigoRegion() + ", getNombre()=" + getNombre() + "]";
	}
	
	
}
