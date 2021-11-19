
public class Mascota {
	private String nombre;
	private int edad;
	private String tipo;
	
	public Mascota(String nombre, int edad, String tipo) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
	}

	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", tipo=" + tipo + "]";
	}
}
