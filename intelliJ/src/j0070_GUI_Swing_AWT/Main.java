package j0070_GUI_Swing_AWT;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private Container panel;
    private JButton miboton;

    public Main() {
        super("Ejemplo 01 con botón");
        miboton = new JButton("Aceptar");
        panel = getContentPane();
        panel.add(miboton);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Main aplicacion = new Main();
    }
}
