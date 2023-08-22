//Crear un frame con una frase con un formato de letra y tamaño.
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
import java.awt.Font;

public class Ejercicio6 {

	public static void main(String[] args) {
		Fuentes fuente = new Fuentes();

	}

}
class Fuentes extends JFrame {
    public Fuentes() {
        setTitle("Ejemplo de Fuentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear un objeto de fuente
        Font font = new Font("Arial", Font.BOLD, 24);


        // Crear un componente de etiqueta con la fuente personalizada
        JLabel label = new JLabel("Aprendiendo a programar en Java");
        label.setFont(font);


        // Agregar la etiqueta al marco
        add(label);


        setVisible(true);
    }
}
