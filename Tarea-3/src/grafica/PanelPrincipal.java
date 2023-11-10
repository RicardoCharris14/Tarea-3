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
     * dimensiones respextivas. Llama a los metodos ActionListener que permiten hacer click en los lugares
     * correspindientes
     */
    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();

        exp.setBounds(30, 30, 500, 750);
        com.setBounds(600, 30, 700, 700);

        this.add(exp);
        this.add(com);

        clickDpstCompra();
        actionBtnSprite();
        actionBtnCoca();
        actionBtnFanta();
        actionBtnSnickers();
        actionBtnSuper8();

        this.setLayout(null);
        this.setBackground(Color.WHITE);
    }

    /**
     * Método que permite hacer click en el boton de Sprite
     */
    public void actionBtnSprite() {
        ActionListener listener = new ActionListener() {
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
    public void actionBtnCoca() {
        ActionListener listener = new ActionListener() {
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
    public void actionBtnFanta() {
        ActionListener listener = new ActionListener() {
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
    public void actionBtnSnickers() {
        ActionListener listener = new ActionListener() {
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
    public void actionBtnSuper8() {
        ActionListener listener = new ActionListener() {
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

    public void clickDpstCompra() {
        MouseListener captador = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int panelX = exp.getX() + 71;
                int panelY = exp.getY() + 601;
                int panelAncho = 188;
                int panelAlto = 48;
                int clickX = e.getX();
                int clickY = e.getY();
                if (clickX >= panelX && clickX <= panelX + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    exp.clickDepCompra();
                }
                panelX = com.getX();
                panelY = com.getY();
                panelAncho = 80;
                panelAlto = 80;
                if (clickX >= panelX + 10 && clickX <= panelX + 10 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda100();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA100);
                }
                if (clickX >= panelX + 90 && clickX <= panelX + 90 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda500();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA500);
                }
                if (clickX >= panelX + 170 && clickX <= panelX + 170 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda1000();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA1000);
                }
                if (clickX >= panelX + 270 && clickX <= panelX + 270 + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto) {
                    com.clickMoneda5000();
                    exp.setSeleccionM(SeleccionMonedas.MONEDA5000);
                }
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        this.addMouseListener(captador);
    }
}