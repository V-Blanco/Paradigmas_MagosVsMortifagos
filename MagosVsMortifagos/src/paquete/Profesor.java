package paquete;

public class Profesor extends Mago {
	private static final int NIVEL_MAGIA = 2;
	private static final int PUNTOS_VIDA = 100;

	public Profesor(String nombre) {
		super(nombre, NIVEL_MAGIA, PUNTOS_VIDA);
	}

}
