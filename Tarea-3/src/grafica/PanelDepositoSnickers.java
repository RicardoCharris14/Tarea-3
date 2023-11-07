package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoSnickers extends JPanel {
    private Image imSnickers;
    private int cantidadProducto;
    public PanelDepositoSnickers(){
        cantidadProducto = 5;
        imSnickers = new ImageIcon("src/grafica/imagenes/snickersparado.png").getImage();

        this.setBackground(Color.BLACK);
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
        for(int i = 0 ; i < cantidadProducto ; i++){
            g.drawImage(imSnickers,tamanoIm*i,altoPanel/4,tamanoIm,tamanoIm,this);
        }


    }
}