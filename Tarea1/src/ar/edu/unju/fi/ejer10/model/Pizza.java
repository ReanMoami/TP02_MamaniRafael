package ar.edu.unju.fi.ejer10.model;

public class Pizza {
    // Atributos privados
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes
    private static final double ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500;
    private static final double ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750;
    private static final double ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000;

    // Constructor por defecto
    public Pizza() {
        // Inicialización por defecto
    }

    // Métodos accesores (getters y setters)
    public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

    // Método para calcular el precio
    public void calcularPrecio() {
        switch (this.diametro) {
            case 20:
                this.precio = 4500 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_20 : 0);
                break;
            case 30:
                this.precio = 4800 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_30 : 0);
                break;
            case 40:
                this.precio = 5500 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_40 : 0);
                break;
            default:
                this.precio = 0; // O manejar el error como se prefiera
        }
    }


	// Método para calcular el área
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.diametro / 2.0, 2);
    }
}
