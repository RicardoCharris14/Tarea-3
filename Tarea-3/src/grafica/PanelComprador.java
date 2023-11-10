package grafica;
import logica.*;
import org.w3c.dom.html.HTMLSelectElement;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    private SeleccionProductos productoComprado;
    private Comprador comprador;
    private PanelMoneda100 pnlMoneda100;
    private PanelMoneda500 pnlMoneda500;
    private PanelMoneda1000 pnlMoneda1000;
    private PanelMoneda5000 pnlMoneda5000;
    private Image imCristianoMessi;
    private Image imSprite;
    private Image imCoca;
    private Image imFanta;
    private Image imSnickers;
    private Image imSuper8;
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
    public Comprador getComprador(){
        return comprador;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(imCristianoMessi,0,200,534,404,this);

        pnlMoneda100.setBounds(10,0,80,80);
        pnlMoneda500.setBounds(90,0,80,80);
        pnlMoneda1000.setBounds(170,0,80,80);
        pnlMoneda5000.setBounds(270,0,80,80);

        if(comprador!=null){
            productoComprado = comprador.getProductoConsumido();
            switch(productoComprado){
                case SPRITE -> {
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString(comprador.getMsgProducto(),0,650);
                    g.drawString("Mi vuelto fue de $"+comprador.getVuelto(),0,170);
                    imSprite = new ImageIcon("src/grafica/imagenes/spriteRot45.png").getImage();
                    g.drawImage(imSprite,130,460,120,120,this);
                    comprador.setProductoConsumido(SeleccionProductos.NULO);
                }
                case COCACOLA ->{
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString(comprador.getMsgProducto(),0,650);
                    g.drawString("Mi vuelto fue de $"+comprador.getVuelto(),0,170);
                    imCoca = new ImageIcon("src/grafica/imagenes/cocaRot45.png").getImage();
                    g.drawImage(imCoca,130,460,120,120,this);
                    comprador.setProductoConsumido(SeleccionProductos.NULO);
                }
                case FANTA -> {
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString(comprador.getMsgProducto(),0,650);
                    g.drawString("Mi vuelto fue de $"+comprador.getVuelto(),0,170);
                    imFanta = new ImageIcon("src/grafica/imagenes/fanta.png").getImage();
                    g.drawImage(imFanta,240,335,100,100,this);
                    comprador.setProductoConsumido(SeleccionProductos.NULO);
                }
                case SNICKERS -> {
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString(comprador.getMsgProducto(),0,650);
                    g.drawString("Mi vuelto fue de $"+comprador.getVuelto(),0,170);
                    imSnickers = new ImageIcon("src/grafica/imagenes/snickersparado.png").getImage();
                    g.drawImage(imSnickers,236,325,130,130,this);
                    comprador.setProductoConsumido(SeleccionProductos.NULO);
                }
                case SUPER8 -> {
                    g.setFont(new Font("Arial", Font.BOLD, 30));
                    g.drawString(comprador.getMsgProducto(),0,650);
                    g.drawString("Mi vuelto fue de $"+comprador.getVuelto(),0,170);
                    imSuper8 = new ImageIcon("src/grafica/imagenes/super8Rot45.png").getImage();
                    g.drawImage(imSuper8,140,460,120,120,this);
                    comprador.setProductoConsumido(SeleccionProductos.NULO);
                }
                default -> {}
            }
        }
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
