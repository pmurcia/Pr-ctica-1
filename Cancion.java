import java.util.*;

public class Cancion
{
	// Atributos de clase
	public static String FORMATO = "mp3";

	// Método que devuelve el formato de las canciones
	public static String getFORMATO()
	{
		return FORMATO;
	}

	// Método que modifica el formato de las canciones
	public static void setFORMATO(String NUEVO_FORMATO)
	{
		FORMATO = NUEVO_FORMATO;
	}
	
	// Atributos de instancia
	public String nombre;
	public int calidad;
	public int valoracion;

	// Constructor
	public Cancion(String nombre, int calidad, int valoracion)
	{
		this.setNombre(nombre);
		this.setCalidad(calidad);
		this.setValoracion(valoracion);
	}
	
	// Método que devuelve el nombre
	public String getNombre()
	{
		return nombre;
	}
	
	// Método que devuelve la calidad
	public int getCalidad()
	{
		return calidad;
	}
	
	// Método que devuelve la valoración
	public int getValoracion()
	{
		return valoracion;
	}
	
	// Método que modifica el nombre de la canción
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	// Método que modifica la calidad de la canción
	public void setCalidad(int calidad)
	{
		if(calidad == 192 || calidad == 256)
		{
			this.calidad = calidad;
		}
		else
		{
			this.calidad = 128;
		}
	}
	
	// Método que modifica la valoración de la canción
	public void setValoracion(int valoracion)
	{
		if(valoracion < 0)
		{
			this.valoracion = 0;
		} 
		else if(valoracion > 5)
		{
			this.valoracion = 5;
		}
		else
		{
			this.valoracion = valoracion;
		}
	}

	// Método que devuelve la información de la canción en un String
	public String getInfo()
	{
		return nombre + "." + FORMATO + ", "
		 + calidad + " kbps, " + valoracion + "/5";
	}
}