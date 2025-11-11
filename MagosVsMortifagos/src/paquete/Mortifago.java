package paquete;

public abstract class Mortifago extends Personaje {

	public Mortifago(String nombre, int nivelMagia, int puntosVida) {
		super(nombre, nivelMagia, puntosVida);
		this.hechizos.addAll(HechizosFactory.crearHechizosPorTipo(TipoHechizo.OSCURO));
		this.hechizos.addAll(HechizosFactory.crearHechizosPorTipo(TipoHechizo.ATAQUE));
		this.hechizos.addAll(HechizosFactory.crearHechizosPorTipo(TipoHechizo.CURATIVO));
	}

}
