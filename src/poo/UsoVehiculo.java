package poo;

public class UsoVehiculo {

	public static void main(String[] args) {

		Coche miCoche1 = new Coche();

		miCoche1.estableceColor("Rojo");

		Furgoneta miFurgo1 = new Furgoneta(7, 580);

		miFurgo1.estableceColor("Azul");

		miFurgo1.configuraAsientos("Si");

		miFurgo1.configuraClimatizador("Si");

		System.err.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());

		System.err.println(miFurgo1.dimeDatosGenerales() + miFurgo1.dimeDatosFurgoneta());
	}

}
