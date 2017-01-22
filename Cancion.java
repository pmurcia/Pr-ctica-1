import java.util.*;

public class Cancion
{
	String formato;
	String nombre;
	int calidad = 128;
	int valoracion;

	public Cancion(String formato, String nombre, int calidad, int valoracion)
	{
		this.formato = formato;
		this.setNombre(nombre);
		this.setCalidad(calidad);
		this.setValoracion(valoracion);
	}

	public String getFormato()
	{
		return formato;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getCalidad()
	{
		return calidad;
	}
	
	public int getValoracion()
	{
		return valoracion;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setCalidad(int calidad)
	{
		if(calidad == 128 || calidad == 192 || calidad == 256)
		{
			this.calidad = calidad;
		}
		else
		{
			this.calidad = 128;
		}
	}
	
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

	public String getInfo()
	{
		return this.nombre + this.formato + ", "
		 + this.calidad + " kbps, " + this.valoracion + "/5";
	}
}