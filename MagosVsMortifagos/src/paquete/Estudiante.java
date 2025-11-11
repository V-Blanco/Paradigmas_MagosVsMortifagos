package paquete;

public class Estudiante extends Mago {
	private static final int NIVEL_MAGIA = 1;
	private static final int PUNTOS_VIDA = 50;

	public Estudiante(String nombre) {
		super(nombre, NIVEL_MAGIA, PUNTOS_VIDA);
	}

}
