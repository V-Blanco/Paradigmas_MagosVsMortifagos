package paquete;

public class Episkey implements Hechizo {
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.armado == true) {
			lanzador.puntosVida += (lanzador.nivelMagia * 20);
			System.out.println(lanzador.getNombre() + " ha sumado vida.\n");
		} else {
			lanzador.armado = true;
			System.out.println(lanzador.getNombre() + " estaba desarmado, no pudo lanzar su hechizo");
		}

	}

}
