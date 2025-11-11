package paquete;

public abstract class Mago extends Personaje {

	public Mago(String nombre, int nivelMagia, int puntosVida) {
		super(nombre, nivelMagia, puntosVida);
		this.hechizos.addAll(HechizosFactory.crearHechizosPorTipo(TipoHechizo.DEFENSIVO));
		this.hechizos.addAll(HechizosFactory.crearHechizosPorTipo(TipoHechizo.ATAQUE));
	}

}
