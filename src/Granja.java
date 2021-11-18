
public class Granja {
	private Granjero granjero;
	private String nombre;
	private String ubicacion;
	
	public Granja(Granjero granjero, String nombre, String ubicacion) {
		this.granjero = granjero;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Granja [granjero=" + granjero + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
}
