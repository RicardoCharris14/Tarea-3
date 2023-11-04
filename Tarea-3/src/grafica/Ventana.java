package grafica;
import javax.swing.*;

public class Ventana extends JFrame{
    PanelPrincipal panel;
    public Ventana(){
        panel = new PanelPrincipal();
        this.add(panel);

        this.setVisible(true);
        this.setSize(1400, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        Ventana ventana1 = new Ventana();

    }
}
