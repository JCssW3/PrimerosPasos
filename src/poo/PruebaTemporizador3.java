package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador3 {

	public static void main(String[] args) {

		Reloj2 miReloj = new Reloj2();

		miReloj.enMarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener!");

		System.exit(0);

	}

}

class Reloj2 {

	public void enMarcha(int intervalo, final boolean sonido) {

		class DameLaHora2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				Date ahora = new Date();

				System.out.println("Te pongo la hora cada 3 seg: " + ahora);

				if (sonido) {

					Toolkit.getDefaultToolkit().beep();
				}

			}
		}

		ActionListener oyente = new DameLaHora2();

		Timer miTemporizador = new Timer(intervalo, oyente);

		miTemporizador.start();

	}

}
