package graficos.dibujar;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Apándice de mátodo generado automáticamente

		miMarco marco1 = new miMarco();

		marco1.setVisible(true);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}

}

class miMarco extends JFrame{

	public miMarco(){

		// eje de coordenadas X, Y
		//setSize(500,300);
		//setLocation(500, 300);

		setBounds(500,300,550,250);

		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);

		setTitle("Mi Ventana");

	}

}