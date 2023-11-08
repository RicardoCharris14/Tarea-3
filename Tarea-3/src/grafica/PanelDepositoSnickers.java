package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoSnickers extends JPanel {
    private Image imSnickers;
    private int numProductos;
    public PanelDepositoSnickers(int numProductos){
        this.numProductos = numProductos;

        imSnickers = new ImageIcon("src/grafica/imagenes/snickersparado.png").getImage();

        this.setBackground(Color.BLACK);
    }

    public void setNumProductos(int numProductos){
        this.numProductos = numProductos;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchoPanel = this.getWidth();
        int altoPanel = this.getHeight();
        //rectangulo fondo deposito
        g.setColor(Color.GRAY);
        g.fillRect(anchoPanel*4/100,altoPanel*14/100,anchoPanel*94/100,altoPanel*79/100);
        g.drawLine(0,0,anchoPanel*4/100,altoPanel*14/100);
        g.drawLine(0,altoPanel,anchoPanel*4/100,altoPanel*92/100);
        g.drawLine(anchoPanel,0,anchoPanel*98/100,altoPanel*15/100);
        g.drawLine(anchoPanel,altoPanel,anchoPanel*98/100,altoPanel*92/100);
        //productos en el deposito
        int tamanoIm = anchoPanel/5;
        for(int i = 0; i < numProductos; i++){
            g.drawImage(imSnickers,tamanoIm*i,altoPanel/4,tamanoIm,tamanoIm,this);
        }


    }
}