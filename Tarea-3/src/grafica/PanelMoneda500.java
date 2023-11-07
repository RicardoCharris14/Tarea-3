package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelMoneda500 extends JPanel {
    private Image imMoneda500;

    public PanelMoneda500(){

        imMoneda500 = new ImageIcon("src/grafica/imagenes/moneda500.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda500,0,0,this.getWidth(),this.getHeight(),this);
    }
}


