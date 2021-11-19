
public class Principal {

	public static void main(String[] args) {
		Granjero paco = new Granjero("Paco", "Martinez", 58, 'H');
        Granja granjaDePaco = new Granja(paco, "Granja de Paco", "Croacia");
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        paco.setMascota(mascota);
        System.out.println(granjaDePaco);
	}

}
