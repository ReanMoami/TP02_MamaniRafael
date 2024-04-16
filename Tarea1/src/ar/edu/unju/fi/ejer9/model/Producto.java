package ar.edu.unju.fi.ejer9.model;

public class Producto {
    // Atributos privados
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento; // Valor entero entre 0 y 50

    // Constructor por defecto
    public Producto() {
        // Inicialización por defecto
    }

    // Métodos accesores (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            this.descuento = 0; // O manejar el error como se prefiera
        }
    }

    // Método para calcular el descuento
    public double calcularDescuento() {
        return precio - (precio * descuento / 100.0);
    }
}
