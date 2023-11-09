package grafica;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que simula el panel donde se depositan las bebidas Cocacola
 * @author Vicente Ramirez
 * @author Ricardo Charris
 */

public class PanelDepositoCoca extends JPanel {
    private Image imCoca;

    private int numProductos;

    /**
     * Constructor que inicializa la imagen de Cocacola
     * @param numProducto recibe la cantidad de productos del tipo Cocacola
     */
    public PanelDepositoCoca(int numProducto){
        this.numProductos = numProducto;

        imCoca = new ImageIcon("src/grafica/imagenes/coca.png").getImage();

        this.setBackground(Color.BLACK);
    }

    /**
     * setter de numProductos
     * @param numProductos recibe la cantidad de productos de Cocacola
     */

    public void setNumProductos(int numProductos){
        this.numProductos = numProductos;
    }
    /**
     * Metodo que pinta las imagenes de Cocacola en el panel deposito del expendedor
     * @param g the <code>Graphics</code> object to protect
     */
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
            g.drawImage(imCoca,tamanoIm*i,altoPanel/4,tamanoIm,tamanoIm,this);
        }


    }
}