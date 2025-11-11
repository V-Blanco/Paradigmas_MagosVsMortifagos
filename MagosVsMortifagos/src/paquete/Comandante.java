package paquete;

public class Comandante extends Mortifago {
	private static final int NIVEL_MAGIA = 3;
	private static final int PUNTOS_VIDA = 150;

	public Comandante(String nombre) {
		super(nombre, NIVEL_MAGIA, PUNTOS_VIDA);
	}

}
