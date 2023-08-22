//Al ejecutar la ventana aparezca en el centro de la pantalla 
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

public class Ejercicio2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearVentana());
    }

    public static void crearVentana() {
        JFrame ventana = new JFrame("Ventana Centrada");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        // Obtener dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar la ventana
        int ventanaX = (screenSize.width - ventana.getWidth()) / 2;
        int ventanaY = (screenSize.height - ventana.getHeight()) / 2;

        ventana.setLocation(ventanaX, ventanaY);
        ventana.setVisible(true);
    }
}