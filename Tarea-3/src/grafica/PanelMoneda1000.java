package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelMoneda1000 extends JPanel {

    private Image imMoneda1000;

    public PanelMoneda1000(){

        imMoneda1000 = new ImageIcon("src/grafica/imagenes/moneda1000.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda1000,0,0,this.getWidth(),this.getHeight(),this);
    }
}


