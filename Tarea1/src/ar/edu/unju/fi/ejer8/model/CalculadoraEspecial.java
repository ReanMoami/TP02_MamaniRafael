package ar.edu.unju.fi.ejer8.model;

public class CalculadoraEspecial {
    private int n;

    // Constructor por defecto
    public CalculadoraEspecial() {
        // Inicialización por defecto
    }

    // Métodos accesores (getters y setters)
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Método para calcular la sumatoria
    public double calcularSumatoria() {
        double sumatoria = 0;
        for (int k = 1; k <= n; k++) {
            sumatoria += Math.pow(k * (k + 1) / 2, 2);
        }
        return sumatoria;
    }

    // Método para calcular la productoria
    public double calcularProductoria() {
        double productoria = 1;
        for (int k = 1; k <= n; k++) {
            productoria *= k * (k + 4);
        }
        return productoria;
    }
}
