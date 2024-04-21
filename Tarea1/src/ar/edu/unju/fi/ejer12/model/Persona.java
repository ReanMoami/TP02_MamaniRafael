package ar.edu.unju.fi.ejer12.model;

import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int añoActual = hoy.get(Calendar.YEAR);
        int añoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        return añoActual - añoNacimiento;
    }

    public String obtenerSignoZodiaco() {
        int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH) ;
        String signo;
        switch (mesNacimiento) {
        case 0: // Enero
            signo = (dia < 21) ? "Capricornio" : "Acuario";
            break;
        case 1: // Febrero
            signo = (dia < 20) ? "Acuario" : "Piscis";
            break;
        case 2: // Marzo
            signo = (dia < 21) ? "Piscis" : "Aries";
            break;
        case 3: // Abril
            signo = (dia < 21) ? "Aries" : "Tauro";
            break;
        case 4: // Mayo
            signo = (dia < 22) ? "Tauro" : "Géminis";
            break;
        case 5: // Junio
            signo = (dia < 22) ? "Géminis" : "Cáncer";
            break;
        case 6: // Julio
            signo = (dia < 24) ? "Cáncer" : "Leo";
            break;
        case 7: // Agosto
            signo = (dia < 24) ? "Leo" : "Virgo";
            break;
        case 8: // Septiembre
            signo = (dia < 24) ? "Virgo" : "Libra";
            break;
        case 9: // Octubre
            signo = (dia < 24) ? "Libra" : "Escorpio";
            break;
        case 10: // Noviembre
            signo = (dia < 23) ? "Escorpio" : "Sagitario";
            break;
        case 11: // Diciembre
            signo = (dia < 22) ? "Sagitario" : "Capricornio";
            break;
        default:
            signo = "Fecha de nacimiento inválida";
        };
        return signo;
        
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerEstacion() {
		int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH) ;
        if(mesNacimiento==11&&dia>21){
        	return "Verano";
        }
        if(mesNacimiento>7&&!(mesNacimiento==8&&dia>23)) {
        	return "Primavera";
        }
        if(mesNacimiento>4&&!(mesNacimiento==5&&dia>21)) {
        	return "Invierno";
        }
        if(mesNacimiento>1&&!(mesNacimiento==11&&dia>20)) {
        	return "Otoño";
        }else {
        	return "Verano &1";
        }
    }
}