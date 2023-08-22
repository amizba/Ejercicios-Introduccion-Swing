//Crear una ventana donde aparezca un texto: “Aprendiendo a programar con Java”
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducción a las aplicaciones gráficas swing
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package graf;

import java.awt.Graphics;

import javax.swing.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		VentanaConTexto ventana=new VentanaConTexto();

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class VentanaConTexto extends JFrame {
	
	public VentanaConTexto() {
		
		setVisible(true);
		
		setBounds(400, 300, 300, 300);

        setTitle("Ventana con texto");
        
        Lamina milamina=new Lamina();  

        add(milamina);
	}
}
class Lamina extends JPanel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);

        g.drawString("Aprendiendo a programar con Java", 50, 50);

  }

}