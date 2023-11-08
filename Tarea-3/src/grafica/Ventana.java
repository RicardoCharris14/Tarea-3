package grafica;
import javax.swing.*;

public class Ventana extends JFrame{
    PanelPrincipal panel;
    public Ventana() {
        this.setTitle("Maquina expendedora");

        panel = new PanelPrincipal();
        this.add(panel);

        this.setVisible(true);
        setSize(1600, 900);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}