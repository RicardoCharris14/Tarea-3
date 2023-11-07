package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelProductoComprado extends JPanel {
    public PanelProductoComprado(){
        setBackground(Color.CYAN);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(this.getWidth()/2 - 33,this.getHeight()/4,66,7);
    }
}
