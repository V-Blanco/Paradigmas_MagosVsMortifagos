package paquete;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
	protected String nombre;
	protected int nivelMagia;
	protected int puntosVida;
	protected List<Hechizo> hechizos;

	protected boolean protegido = false;
	protected boolean armado = true;

	public Personaje(String nombre, int nivelMagia, int puntosVida) {
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVida;
		this.hechizos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public boolean estaVivo() {
		return this.puntosVida > 0;
	}

	public void lanzarHechizo(int idxHechizo, Personaje lanzador, Personaje objetivo) {
		this.hechizos.get(idxHechizo).ejecutar(lanzador, objetivo);
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivelMagia=" + nivelMagia + ", puntosVida=" + puntosVida
				+ ", hechizos=" + hechizos + ", protegido=" + protegido + ", armado=" + armado + "]\n";
	}

}
