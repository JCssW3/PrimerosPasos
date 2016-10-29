package lenguaje;

public class CalculosConMath {

	public static void main(String[] args) {

		double raiz = Math.sqrt(9);

		System.out.println("La raáz de 9 es " + raiz);

		double num1 = 5.85f;

		int resultado = (int) Math.round(num1);

		System.out.println("El resultado de " + num1 + " redondeado es " + resultado);

		double base = 5;

		double exponente = 3;

		int resultado2 = (int) Math.pow(base, exponente);

		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
	}

}
