package grafica;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que simula el panel donde se insertan las monedas de 500
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelMoneda500 extends JPanel {
    private Image imMoneda500;

    /**
     * Constructor que crea la imagen de moneda500
     */
    public PanelMoneda500(){

        imMoneda500 = new ImageIcon("src/grafica/imagenes/moneda500.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    /**
     * Metodo que pinta la imagen de moneda500 en el panel
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda500,0,0,this.getWidth(),this.getHeight(),this);
    }
}


