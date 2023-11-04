package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    public PanelComprador(){
        setBackground(Color.cyan);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(getWidth()/4-250/3,getHeight()/4-350/3,250,350);
    }
}
