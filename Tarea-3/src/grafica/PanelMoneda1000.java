package grafica;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que simula el panel donde se insertan las monedas de 1000
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelMoneda1000 extends JPanel {

    private Image imMoneda1000;

    /**
     * Constructor que crea la imagen de moneda1000
     */
    public PanelMoneda1000(){

        imMoneda1000 = new ImageIcon("src/grafica/imagenes/moneda1000.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    /**
     * Metodo que pinta la imagen de moneda1000 en el panel
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda1000,0,0,this.getWidth(),this.getHeight(),this);
    }
}


