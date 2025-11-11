package paquete;

import java.util.Random;

public class PersonajeFactory {

	public static Personaje crearPersonaje(String tipo, String nombre) {
		switch (tipo) {
		case "Estudiante":
			return new Estudiante(nombre);
		case "Auror":
			return new Auror(nombre);
		case "Profesor":
			return new Profesor(nombre);
		case "Seguidor":
			return new Seguidor(nombre);
		case "Comandante":
			return new Comandante(nombre);
		default:
			throw new IllegalArgumentException("Tipo de personaje no soportado: " + tipo);
		}
	}

	public static Mago crearMago() {
		switch (new Random().nextInt(3)) {
		case 0:
			return new Estudiante("Estudiante" + new Random().nextInt(100));
		case 1:
			return new Profesor("Profesor" + new Random().nextInt(100));
		case 2:
			return new Auror("Auror" + new Random().nextInt(100));
		default:
			throw new IllegalArgumentException("Tipo de mago no soportado");
		}
	}

	public static Mortifago crearMortifago() {
		switch (new Random().nextInt(2)) {
		case 0:
			return new Seguidor("Seguidor" + new Random().nextInt(100));
		case 1:
			return new Comandante("Comandante" + new Random().nextInt(100));
		default:
			throw new IllegalArgumentException("Tipo de mago no soportado");
		}
	}

}
