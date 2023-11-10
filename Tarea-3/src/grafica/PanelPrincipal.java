package grafica;
import logica.SeleccionMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * Clase que simula el panel de expendedor
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    /**
     * Constructor que hace referencia  a PanelExpendedor y PanelComprador, los añade el panel principal con sus
     * dimensiones respectivas. Llama a los metodos ActionListener que permiten hacer click en los lugares
     * correspondientes
     */

    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();

        exp.setBounds(30, 30, 500, 700);
        com.setBounds(600, 30, 700, 700);

        this.add(exp);
        this.add(com);

        clickDpstCompra();
        clickMoneda100();
        clickMoneda500();
        clickMoneda1000();
        clickMoneda5000();
        actionBtnSprite();
        actionBtnCoca();
        actionBtnFanta();
        actionBtnSnickers();
        actionBtnSuper8();
        clickMostradorExpendedor();

        this.setLayout(null);
        this.setBackground(Color.WHITE);
    }
    /**
     * Método que permite hacer click en el boton de Sprite
     */
    public void actionBtnSprite(){
        ActionListener listener= new ActionListener(){
            /**
             * Llama al metodo eventoBtnSprite de panel expendedor
             * @param e EL evento va a ser procesado
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                exp.eventoBtnSprite(com.getComprador());
            }
        };
        exp.setActionBtnSprite(listener);
    }
    /**
     * Método que permite hacer click en el boton de Cocacola
     */
    public void actionBtnCoca(){
        ActionListener listener= new ActionListener(){
            /**
             * Llama al metodo eventoBtnCoca de panel expendedor
             * @param e EL evento va a ser procesado
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                exp.eventoBtnCoca(com.getComprador());
            }
        };
        exp.setActionBtnCoca(listener);
    }
    /**
     * Método que permite hacer click en el boton de Fanta
     */
    public void actionBtnFanta(){
        ActionListener listener= new ActionListener(){
            /**
             * Llama al metodo eventoBtnFanta de panel expendedor
             * @param e EL evento va a ser procesado
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                exp.eventoBtnFanta(com.getComprador());
            }
        };
        exp.setActionBtnFanta(listener);
    }
    /**
     * Método que permite hacer click en el boton de Snicker
     */
    public void actionBtnSnickers(){
        ActionListener listener= new ActionListener(){
            /**
             * Llama al metodo eventoBtnSnickers de panel expendedor
             * @param e EL evento va a ser procesado
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                exp.eventoBtnSnickers(com.getComprador());
            }
        };
        exp.setActionBtnSnickers(listener);
    }
    /**
     * Método que permite hacer click en el boton de Super8
     */
    public void actionBtnSuper8(){
        ActionListener listener= new ActionListener(){
            /**
             * Llama al metodo eventoBtnSuper8 de panel expendedor
             * @param e EL evento va a ser procesado
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                exp.eventoBtnSuper8(com.getComprador());
            }
        };
        exp.setActionBtnSuper8(listener);
    }

    public void clickMoneda100(){
        MouseListener captador1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int panelX = com.getX();
                int panelY = com.getY();
                int panelAncho = 80;
                int panelAlto = 80;
                if (clickX >= panelX + 10 && clickX <= panelX + 10 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda100();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA100);
                    repaint();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador1);
    }

    public void clickMoneda500(){
        MouseListener captador2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int panelX = com.getX();
                int panelY = com.getY();
                int panelAncho = 80;
                int panelAlto = 80;
                if (clickX >= panelX + 90 && clickX <= panelX + 90 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda500();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA500);
                    repaint();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador2);
    }

    public void clickMoneda1000(){
        MouseListener captador3 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int panelX = com.getX();
                int panelY = com.getY();
                int panelAncho = 80;
                int panelAlto = 80;
                if (clickX >= panelX + 170 && clickX <= panelX + 170 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda1000();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA1000);
                    repaint();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador3);
    }

    public void clickMoneda5000(){
        MouseListener captador4 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int panelX = com.getX();
                int panelY = com.getY();
                int panelAncho = 80;
                int panelAlto = 80;
                if (clickX >= panelX + 270 && clickX <= panelX + 270 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda5000();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA5000);
                    repaint();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador4);
    }

    public void clickDpstCompra() {
        MouseListener captador5 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int panelX = exp.getX() + 71;
                int panelY = exp.getY() + 601;
                int panelAncho = 188;
                int panelAlto = 48;
                int clickX = e.getX();
                int clickY = e.getY();
                if (clickX >= panelX && clickX <= panelX + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    if(com.getComprador()!= null){
                        if(com.getComprador().getHayProducto()){
                            exp.clickDepCompra(com.getComprador());
                            repaint();
                        }
                    }
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador5);
    }
    public void clickMostradorExpendedor(){
        MouseListener captador6 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickX = e.getX();
                int clickY = e.getY();
                int panelX = exp.getX();
                int panelY = exp.getY();
                if(clickX>=panelX+15 && clickX<=panelX+315 && clickY>=panelX+15 && clickY<=panelY+573){
                    exp.clickMostradorExpendedor();
                    repaint();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador6);
    }
}