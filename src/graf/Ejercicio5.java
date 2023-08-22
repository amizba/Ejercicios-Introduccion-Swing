//Crear un rect�ngulo
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Introducci�n a las aplicaciones gr�ficas swing
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package graf;

import javax.swing.*;
import java.awt.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		Rectangulo mirectangulo = new Rectangulo();
		mirectangulo.setVisible(true);

	}

}
class Rectangulo extends JFrame {
    public Rectangulo() {
        setTitle("Dibujo de un Rect�ngulo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(100, 100, 200, 150);
            }
        };

        add(panel);
    }
}