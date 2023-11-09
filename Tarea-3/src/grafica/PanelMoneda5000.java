package grafica;

import javax.swing.*;
import java.awt.*;
/**
 * Clase que simula el panel donde se insertan las monedas de 5000
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelMoneda5000 extends JPanel {
    private Image imMoneda5000;

    /**
     * Constructor que crea la imagen de moneda5000
     */
    public PanelMoneda5000(){

        imMoneda5000 = new ImageIcon("src/grafica/imagenes/moneda5000.png").getImage();

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    /**
     * Metodo que pinta la imagen de moneda5000 en el panel
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imMoneda5000,0,0,this.getWidth(),this.getHeight(),this);
    }
}
