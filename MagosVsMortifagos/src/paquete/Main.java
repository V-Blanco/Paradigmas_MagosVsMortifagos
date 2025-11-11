package paquete;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int i;
		Batallon batallonMagos = new Batallon();
		Batallon batallonMortifagos = new Batallon();

		for (i = 0; i < 5; i++) {
			batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
			batallonMortifagos.agregarPersonaje(PersonajeFactory.crearMortifago());
		}

//		System.out.println("Batallon Magos:");
//		System.out.println(batallonMagos.toString());
//		
//		System.out.println("Batallon Mortifagos:");
//		System.out.println(batallonMortifagos.toString());

		Random rand = new Random();
		while (batallonMagos.tienePersonajesSaludables() && batallonMortifagos.tienePersonajesSaludables()) {
			if (rand.nextBoolean()) {
				batallonMagos.atacar(batallonMortifagos);
				if (batallonMortifagos.tienePersonajesSaludables()) {
					batallonMortifagos.atacar(batallonMagos);
				}
			} else {
				batallonMortifagos.atacar(batallonMagos);
				if (batallonMagos.tienePersonajesSaludables()) {
					batallonMagos.atacar(batallonMortifagos);
				}
			}
			System.out.println("----------------------------");
		}

		if (batallonMagos.tienePersonajesSaludables())
			System.out.println("¡Los magos han ganado la batalla!");
		else
			System.out.println("¡Los mortífagos han ganado la batalla!");

	}

}
