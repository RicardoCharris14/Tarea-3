package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    private PanelMoneda100 pnlMoneda100;
    private PanelMoneda500 pnlMoneda500;
    private PanelMoneda1000 pnlMoneda1000;
    private PanelMoneda5000 pnlMoneda5000;

    private Image imCristianoMessi;
    public PanelComprador(){
        imCristianoMessi = new ImageIcon("src/grafica/imagenes/cr7ypessi.png").getImage();

        pnlMoneda100 = new PanelMoneda100();
        pnlMoneda500 = new PanelMoneda500();
        pnlMoneda1000 = new PanelMoneda1000();
        pnlMoneda5000 = new PanelMoneda5000();

        this.add(pnlMoneda100);
        this.add(pnlMoneda500);
        this.add(pnlMoneda1000);
        this.add(pnlMoneda5000);

        this.setLayout(null);
        this.setBackground(Color.white);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imCristianoMessi,0,150,534,404,this);

        pnlMoneda100.setBounds(10,0,80,80);
        pnlMoneda500.setBounds(90,0,80,80);
        pnlMoneda1000.setBounds(170,0,80,80);
        pnlMoneda5000.setBounds(270,0,80,80);


    }
}
