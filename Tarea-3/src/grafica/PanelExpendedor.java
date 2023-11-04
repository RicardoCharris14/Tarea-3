package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor(){
        setBackground(Color.YELLOW);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(getWidth()/4-250/3,getHeight()/4-350/3,250,350);
    }
}