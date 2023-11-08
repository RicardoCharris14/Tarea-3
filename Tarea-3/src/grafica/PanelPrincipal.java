package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelPrincipal extends JPanel{
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();

        exp.setBounds(30,30,500,750);
        com.setBounds(600,30,700,700);

        this.add(exp);
        this.add(com);

        captadorMouse();

        this.setLayout(null);
        this.setBackground(Color.WHITE);
    }
    public void captadorMouse(){
        MouseListener captador = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int panelX = exp.getX()+71;
                int panelY = exp.getY()+601;
                int panelAncho =188;
                int panelAlto =48;
                int clickX = e.getX();
                int clickY = e.getY();
                if(clickX >= panelX && clickX <= panelX + panelAncho && clickY >= panelY && clickY <= panelY + panelAlto){
                    exp.clickDepCompra();
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
        this.addMouseListener(captador);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}

