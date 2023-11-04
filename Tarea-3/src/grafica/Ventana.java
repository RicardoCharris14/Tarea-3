package grafica;
import javax.swing.*;

public class Ventana extends JFrame{
    public Ventana(){
        this.setVisible(true);
        this.setSize(1400, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        Ventana ventana1 = new Ventana();

    }
}
