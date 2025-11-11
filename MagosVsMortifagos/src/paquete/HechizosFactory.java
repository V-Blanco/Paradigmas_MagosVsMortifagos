package paquete;

import java.util.ArrayList;
import java.util.List;

public class HechizosFactory {

	public static List<Hechizo> crearHechizosPorTipo(TipoHechizo tipo) {
		List<Hechizo> hechizos = new ArrayList<>();
		switch (tipo) {
		case DEFENSIVO:
			hechizos.add(new Protego());
			break;
		case ATAQUE:
			hechizos.add(new Expelliarmus());
			hechizos.add(new Desmaius());
			break;
		case CURATIVO:
			hechizos.add(new Episkey());
			break;
		case OSCURO:
			hechizos.add(new AvadaKedavra());
			break;
		}
		return hechizos;
	}

}
