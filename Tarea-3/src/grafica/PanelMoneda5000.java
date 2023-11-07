package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelMoneda5000 extends JPanel {
    private Image imMoneda5000;

    public PanelMoneda5000(){

        imMoneda5000 = new ImageIcon("src/grafica/imagenes/moneda5000.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda5000,0,0,this.getWidth(),this.getHeight(),this);
    }
}
