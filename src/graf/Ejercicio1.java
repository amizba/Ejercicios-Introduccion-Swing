//Crear una ventana, marco o frame
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducción a las aplicaciones gráficas swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package graf;

import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		MiVentana ventana = new MiVentana();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setVisible(true);
		
		

	}

}
class MiVentana extends JFrame {
	
	public MiVentana() {
		
		setTitle("Mi Ventana");
		
		setBounds(400, 300, 300, 300);
		
	}
	

}