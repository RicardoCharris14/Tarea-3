package grafica;
import logica.*;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    private Comprador comprador;
    private PanelMoneda100 pnlMoneda100;
    private PanelMoneda500 pnlMoneda500;
    private PanelMoneda1000 pnlMoneda1000;
    private PanelMoneda5000 pnlMoneda5000;
    private Image imCristianoMessi;
    public PanelComprador(){
        comprador = null;
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
    public Comprador getComprador(){
        return comprador;
    }
    public void clickMoneda100(){
        comprador = new Comprador(new Moneda100());
    }
    public void clickMoneda500(){
        comprador = new Comprador(new Moneda500());
    }
    public void clickMoneda1000(){
        comprador = new Comprador(new Moneda1000());
    }
    public void clickMoneda5000(){
        comprador = new Comprador(new Moneda5000());
    }
}
