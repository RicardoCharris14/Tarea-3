package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel{
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        exp = new PanelExpendedor();
        exp.setBounds(30,30,500,750);

        com = new PanelComprador();

        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);



    }

}

