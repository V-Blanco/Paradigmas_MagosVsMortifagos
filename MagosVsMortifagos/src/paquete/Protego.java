package paquete;

public class Protego implements Hechizo {

	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.armado == true) {
			lanzador.protegido = true;
			System.out.println(lanzador.getNombre() + " se ha protegido\n");
		} else {
			lanzador.armado = true;
			System.out.println(lanzador.getNombre() + " estaba desarmado, no pudo lanzar su hechizo");
		}
	}

}
