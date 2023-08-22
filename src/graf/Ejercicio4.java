//Crear un circulo
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
import java.awt.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Circulo micirculo = new Circulo();
		
		micirculo.setVisible(true);

	}

}
class Circulo extends JFrame {
    public Circulo() {
        setTitle("Dibujo de un Círculo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(100, 100, 200, 200);
            }
        };

        add(panel);
    }
}