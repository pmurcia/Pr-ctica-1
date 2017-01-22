import java.util.*;

public class AppCancion
{
	public static void main(String[] args)
	{
		// ¿Por qué no puede ir fuera del main?
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		canciones.add(new Cancion(".mp3","Call - Francisco Yates",256,5));
		canciones.add(new Cancion(".ogg","Dragostea Din Tei - OZone",190,2));
		canciones.add(new Cancion(".wav","Gangsta's Paradise - Coolio ft. L.V",192,4));

		canciones.forEach(cancion -> {
			System.out.println(cancion.getNombre());
			System.out.println(cancion.getFormato());
			System.out.println(cancion.getCalidad() + " kbps");
			System.out.println(cancion.getValoracion() + "/5");
			System.out.println("");
		});

		System.out.println(canciones.get(0).getFormato());
		System.out.println(canciones.get(1).getNombre());
		canciones.get(2).setValoracion(5);
		System.out.println("");

		canciones.forEach(cancion -> {
			System.out.println(cancion.getInfo());
		});
		System.out.println("");

		canciones.forEach(cancion -> {
			System.out.println(cancion.getFormato());
		});
		System.out.println("");

		canciones.forEach(cancion -> {
			if(cancion.getValoracion() > 3)
			{
				System.out.println(cancion.getInfo());
			}
		});
		System.out.println("");
		
		canciones.forEach(cancion -> {
			if(cancion.getCalidad() == 256)
			{
				System.out.println(cancion.getInfo());
			}
		});
		System.out.println("");
	}
}