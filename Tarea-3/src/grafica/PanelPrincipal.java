package grafica;
import javax.swing.*;
import java.awt.*;

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

        this.setLayout(null);
        this.setBackground(Color.WHITE);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);



    }

}

