package grafica;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que simula el panel donde se insertan las monedas de 100
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelMoneda100 extends JPanel {
    private Image imMoneda100;

    /**
     * Constructor que crea la imagen de moneda100
     */
    public PanelMoneda100(){

        imMoneda100 = new ImageIcon("src/grafica/imagenes/moneda100.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }

    /**
     * Metodo que pinta la imagen de moneda100 en el panel
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda100,0,0,this.getWidth(),this.getHeight(),this);
    }
}







