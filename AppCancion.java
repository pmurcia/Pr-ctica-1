import java.util.*;

public class AppCancion
{
	public static void main(String[] args)
	{
		// Creamos un array dinámico de canciones
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		
		// Añadimos tres canciones
		canciones.add(new Cancion("Call - Francisco Yates",256,5));
		canciones.add(new Cancion("Dragostea Din Tei - OZone",190,2));
		canciones.add(new Cancion("Gangsta's Paradise - Coolio ft. L.V",192,4));

		// Mostramos toda su información por pantalla (a lo Ruby)
		System.out.println("Información de las canciones:");
		canciones.forEach(cancion -> {
			System.out.println("Nombre: " + cancion.getNombre());
			System.out.println("Formato: " + Cancion.getFORMATO());
			System.out.println("Calidad: " + cancion.getCalidad() + " kbps");
			System.out.println("Valoración: " + cancion.getValoracion() + "/5");
			System.out.println("");
		});

		// Mostramos por pantalla alguna de su información
		System.out.println("Formato de la primera cancion: " + Cancion.getFORMATO());
		System.out.println("Nombre de la segunda cancion: " + canciones.get(1).getNombre());
		canciones.get(2).setValoracion(5);
		System.out.println("");

		// Mostramos la información de la canción de forma ordenada
		System.out.println("Información de las canciones en forma de una sola línea:");
		canciones
			.stream()
			.map(Cancion::getInfo)
			.forEach(System.out::println);
		System.out.println("");

		// Obtenemos el formato de las canciones
		System.out.println("Formato de las canciones:");
		canciones
			.stream()
			.map(cancion -> Cancion.getFORMATO())
			/* En el caso que no tuviesen el mismo formato, se debería escribir
			Cancion::getFormato, modificando la clase */
			.forEach(System.out::println);
		
		System.out.println("");

		// Obtenemos las canciones con una valoración mayor que 3
		System.out.println("Canciones con valoración mayor que 3:");
		canciones
			.stream()
			.filter(cancion -> cancion.getValoracion() > 3)
			.map(Cancion::getInfo)
			.forEach(System.out::println);
						
		System.out.println("");

		// Obtenemos las canciones con una calidad de 256 kbps		
		System.out.println("Canciones con calidad de 256 kbps:");
		canciones
			.stream()
			.filter(cancion -> cancion.getCalidad() == 256)
			.map(Cancion::getInfo)
			.forEach(System.out::println);
	}
}