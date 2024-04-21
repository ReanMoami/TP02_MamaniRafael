package ar.edu.unju.fi.ejer17.model;

import java.util.Calendar;

public class Jugador {
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    private String nacionalidad;
    private double estatura;
    private double peso;
    private String posicion; // delantero, medio, defensa, arquero

    public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, double estatura, double peso, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
    }

    public int calcularEdad() {
    	Calendar hoy = Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int añoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.MONTH)>=fechaNacimiento.get(Calendar.MONTH)&&hoy.get(Calendar.DAY_OF_MONTH)>=fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
        	return añoActual - añoNacimiento;	
        }else {
        	return añoActual - añoNacimiento-1;	
        }
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}
    
    
}
