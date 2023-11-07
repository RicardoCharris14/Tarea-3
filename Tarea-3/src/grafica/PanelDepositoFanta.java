package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoFanta extends JPanel {
    public PanelDepositoFanta(){
        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
