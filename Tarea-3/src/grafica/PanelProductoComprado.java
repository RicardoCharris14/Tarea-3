package grafica;

import logica.SeleccionProductos;

import javax.swing.*;
import java.awt.*;

public class PanelProductoComprado extends JPanel {
    SeleccionProductos seleccion;
    private Image imProducto;
    public PanelProductoComprado(){
        seleccion = SeleccionProductos.NULO;

        this.setBackground(Color.CYAN);
    }
    public void setSeleccion(SeleccionProductos seleccion){
        this.seleccion = seleccion;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchoPanel = this.getWidth();
        int altoPanel = this.getHeight();
        switch(seleccion){
            case SPRITE:
                this.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                g.drawLine(0,altoPanel,anchoPanel /10,altoPanel * 3/4);
                g.drawLine(anchoPanel/10,altoPanel * 3/4,anchoPanel/10,0);
                g.drawLine(anchoPanel/10, altoPanel * 3/4, anchoPanel * 19/20, altoPanel * 3/4);
                g.drawLine(anchoPanel * 19/20, altoPanel * 3/4,anchoPanel * 19/20,0 );
                g.drawLine(anchoPanel * 19/20,altoPanel * 3/4,anchoPanel,altoPanel);
                imProducto = new ImageIcon("src/grafica/imagenes/spriteRotada.png").getImage();
                g.drawImage(imProducto,anchoPanel/2-38,altoPanel/2-38,76,76,this);
                break;
            case COCACOLA:
                this.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                g.drawLine(0,altoPanel,anchoPanel /10,altoPanel * 3/4);
                g.drawLine(anchoPanel/10,altoPanel * 3/4,anchoPanel/10,0);
                g.drawLine(anchoPanel/10, altoPanel * 3/4, anchoPanel * 19/20, altoPanel * 3/4);
                g.drawLine(anchoPanel * 19/20, altoPanel * 3/4,anchoPanel * 19/20,0 );
                g.drawLine(anchoPanel * 19/20,altoPanel * 3/4,anchoPanel,altoPanel);
                imProducto = new ImageIcon("src/grafica/imagenes/cocaRotada.png").getImage();
                g.drawImage(imProducto,anchoPanel/2-38,altoPanel/2-38,76,76,this);
                break;

            case FANTA:
                this.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                g.drawLine(0,altoPanel,anchoPanel /10,altoPanel * 3/4);
                g.drawLine(anchoPanel/10,altoPanel * 3/4,anchoPanel/10,0);
                g.drawLine(anchoPanel/10, altoPanel * 3/4, anchoPanel * 19/20, altoPanel * 3/4);
                g.drawLine(anchoPanel * 19/20, altoPanel * 3/4,anchoPanel * 19/20,0 );
                g.drawLine(anchoPanel * 19/20,altoPanel * 3/4,anchoPanel,altoPanel);
                imProducto = new ImageIcon("src/grafica/imagenes/fantaRotada.png").getImage();
                g.drawImage(imProducto,anchoPanel/2-38,altoPanel/2-38,76,76,this);
                break;

            case SNICKERS:
                this.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                g.drawLine(0,altoPanel,anchoPanel /10,altoPanel * 3/4);
                g.drawLine(anchoPanel/10,altoPanel * 3/4,anchoPanel/10,0);
                g.drawLine(anchoPanel/10, altoPanel * 3/4, anchoPanel * 19/20, altoPanel * 3/4);
                g.drawLine(anchoPanel * 19/20, altoPanel * 3/4,anchoPanel * 19/20,0 );
                g.drawLine(anchoPanel * 19/20,altoPanel * 3/4,anchoPanel,altoPanel);
                imProducto = new ImageIcon("src/grafica/imagenes/snickers.png").getImage();
                g.drawImage(imProducto,anchoPanel/2 -38,altoPanel/2-38,76,76,this);
                break;

            case SUPER8:
                this.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                g.drawLine(0,altoPanel,anchoPanel /10,altoPanel * 3/4);
                g.drawLine(anchoPanel/10,altoPanel * 3/4,anchoPanel/10,0);
                g.drawLine(anchoPanel/10, altoPanel * 3/4, anchoPanel * 19/20, altoPanel * 3/4);
                g.drawLine(anchoPanel * 19/20, altoPanel * 3/4,anchoPanel * 19/20,0 );
                g.drawLine(anchoPanel * 19/20,altoPanel * 3/4,anchoPanel,altoPanel);
                imProducto = new ImageIcon("src/grafica/imagenes/super8Rotado.png").getImage();
                g.drawImage(imProducto,anchoPanel/2-38,altoPanel/2-38,76,76,this);
                break;

            default:
                this.setBackground(Color.CYAN);
                g.setColor(Color.BLACK);
                g.fillRect(anchoPanel/2 - 33,altoPanel/4,66,7);
                break;
        }
    }
}