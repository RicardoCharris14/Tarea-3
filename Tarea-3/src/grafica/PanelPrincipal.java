package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel{
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setLayout(new GridLayout(1,2));
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);


    }

}

