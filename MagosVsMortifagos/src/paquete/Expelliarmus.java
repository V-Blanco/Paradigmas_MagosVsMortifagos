package paquete;

public class Expelliarmus implements Hechizo {

	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.armado == true)
			if (objetivo.protegido == false) {
				objetivo.armado = false;
				System.out.println(lanzador.getNombre() + " ha desarmado a " + objetivo.getNombre() + "\n");
			} else {
				objetivo.protegido = false;
				System.out.println("el objetivo" + objetivo.getNombre() + " esta protegido\n");
			}
		else {
			lanzador.armado = true;
			System.out.println(lanzador.getNombre() + " estaba desarmado, no pudo lanzar su hechizo");
		}

	}

}
