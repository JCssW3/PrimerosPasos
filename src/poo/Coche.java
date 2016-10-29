package poo;

public class Coche {

	// Privadas
	private int ruedas;
	private int largo;
	private int ancho;
    private int pesoPlataforma;
	private String color;
	private boolean asientosCuero, climatizador;

	public Coche() {

		ruedas = 4;
		largo = 2000;
		ancho = 300;
        int motor = 1600;
		pesoPlataforma = 500;

	}

	public String dimeDatosGenerales() { // GETTER

		return "La plataforma del veháculo tiene " + ruedas + " ruedas. Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " kg.";

	}

	public void estableceColor(String colorCoche) { // SETTER

		color = colorCoche;

	}

	public String dimeColor() { // GETTER

		return "El color del coche es " + color;

	}

	// -- ASIENTOS --------------------------------------------------

	public void configuraAsientos(String asientosCuero) { // SETTER

        this.asientosCuero = asientosCuero.equalsIgnoreCase("si");

	}

	public String dimeAsientos() { // GETTER

		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}

	}

	// -- CLIMATIZADOR ----------------------------------------------

	public void configuraClimatizador(String climatizador) { // SETTER

        this.climatizador = climatizador.equalsIgnoreCase("si");

	}

	public String dimeClimatizador() { // GETTER

		if (climatizador) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}

	}

	// -- PESO TOTAL ------------------------------------------------

	public String dimePesoCoche() { // SETTER/GETTER

		int pesoCarroceria = 500;

		int pesoTotal = pesoPlataforma + pesoCarroceria;

		if (asientosCuero) {
			pesoTotal += 50;
		}

		if (climatizador) {
			pesoTotal += 20;
		}

		return "El peso del coche es " + pesoTotal + " kgrs";

	}

	// -- PRECIO ----------------------------------------------------

	public int precioCoche() {

		int precioFinal = 10000;

		if (asientosCuero) {
			precioFinal += 2000;
		}

		if (climatizador) {
			precioFinal += 1500;
		}

		return precioFinal;

	}

}
