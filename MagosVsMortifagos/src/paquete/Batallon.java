package paquete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Set;
import java.util.Random;

public class Batallon {
	private List<Personaje> personajes;
	//private Set<Hechizo> hechizosUsados;
	private Map<Personaje, List<Hechizo>> hechizosXPersonaje;
	
	public Batallon() {
		personajes = new ArrayList<>();
		hechizosXPersonaje = new HashMap<>();
	}
	
	public void agregarPersonaje(Personaje persona) {
		personajes.add(persona);
	}
	
	public void eliminarPersonaje(Personaje persona) {
		personajes.remove(persona);
	}
	
	
	public void atacar(Batallon batallonEnemigo) {
		Personaje atacante = personajes.getFirst();
		Personaje objetivo = batallonEnemigo.personajes.getFirst();		
//		int cantHechizos = atacante.hechizos.size() ;
		int idxHechizo;
//		
//		atacante.lanzarHechizo(idxHechizo, atacante, objetivo);	
//		registrarHechizoXPersonaje(atacante,idxHechizo,cantHechizos);
		
		List<Hechizo> hechizosLanzados = hechizosXPersonaje.getOrDefault(atacante, new ArrayList<>());
	    
	    // Verifica si ya se han lanzado todos los hechizos
	    if (hechizosLanzados.size() == atacante.hechizos.size())
	        hechizosLanzados.clear(); // Limpia si todos los hechizos han sido usados
	    

	    // Selecciona un hechizo que no haya sido lanzado previamente
	    Hechizo hechizoAUsar;
	    do {
	       idxHechizo = new Random().nextInt(atacante.hechizos.size());
	        hechizoAUsar = atacante.hechizos.get(idxHechizo);
	    } while (hechizosLanzados.contains(hechizoAUsar));
	    
	    // Lanza el hechizo
	    idxHechizo = atacante.hechizos.indexOf(hechizoAUsar);
	    atacante.lanzarHechizo(idxHechizo, atacante, objetivo);

	    // Registra el hechizo lanzado
	    hechizosLanzados.add(hechizoAUsar);
	    hechizosXPersonaje.put(atacante, hechizosLanzados);
		
		
		if(!objetivo.estaVivo())
			batallonEnemigo.eliminarPersonaje(objetivo);		
	}
	
	public void registrarHechizoXPersonaje(Personaje atacante,int idxHechizos,int cantHechizos) {
		//devuelve los usado o sino no hay nada crea una vacia
		List<Hechizo> hechizosLanzados = hechizosXPersonaje.getOrDefault(atacante, new ArrayList<>());
		if(hechizosLanzados.size()==cantHechizos)
			hechizosLanzados.clear();
	    hechizosLanzados.add(atacante.hechizos.get(idxHechizos));	    
	    hechizosXPersonaje.put(atacante, hechizosLanzados);
	}
	
	public boolean tienePersonajesSaludables() {
		return !personajes.isEmpty();
	}
	
	public List<Personaje> getBatallon() {
		return personajes;
	}

	@Override
	public String toString() {
		return " [" + personajes + "]";
	}
	
}
