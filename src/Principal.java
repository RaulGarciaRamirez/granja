
public class Principal {

	public static void main(String[] args) {
		Granjero paco = new Granjero("Paco", "Mart�nez", 58, 'H');
		Granja granjaDePaco = new Granja(paco, "Granja de Paco", "");
		System.out.println(granjaDePaco);
	}

}
