package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelMoneda100 extends JPanel {
    private Image imMoneda100;

    public PanelMoneda100(){

        imMoneda100 = new ImageIcon("src/grafica/imagenes/moneda100.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda100,0,0,this.getWidth(),this.getHeight(),this);




    }
}







