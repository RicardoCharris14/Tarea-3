package grafica;
import logica.SeleccionMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();

        exp.setBounds(30, 30, 500, 750);
        com.setBounds(600, 30, 700, 700);

        this.add(exp);
        this.add(com);

        clickDpstCompra();

        this.setLayout(null);
        this.setBackground(Color.WHITE);
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
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.addMouseListener(captador);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }
}