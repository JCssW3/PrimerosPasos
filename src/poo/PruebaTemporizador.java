package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {

		// Instancio un objeto de la clase DameLaHora porque
		// implementa la interface ActionListener, lo puedo hacer asá:
		// ActionListener oyente = new DameLaHora(); o asá:
		DameLaHora oyente = new DameLaHora();

		// Creo el Temporizador y le digo que cada 5 segundos ejecute oyente
		Timer miTemporizador = new Timer(5000, oyente);

		// Le doy play al temporizador...
		miTemporizador.start();

		// Y muestro un mensaje para que la ejecucián no termine antes
		// de que el timer llegue a sus primeros 5 seg
		JOptionPane.showMessageDialog(null, "Pulsa para aceptar detener");

		// y ejecuto el fin del programa, aunque terminaráa igual.
		System.exit(0);

	}

}

class DameLaHora implements ActionListener {

	// La interface ActionListener me obliga a crear el mátodo
	// actionPerformed, que seráa la accián a realizar por el
	// Timer cada 5 segundos
	@Override
	public void actionPerformed(ActionEvent e) {

		// Como tengo que devolver la hora tengo que crear un objeto Date
		Date ahora = new Date();

		System.out.println("Te pongo la hora cada 5 sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();

	}

}