package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoFanta extends JPanel {
    private PanelFanta panel1;
    private PanelFanta panel2;
    private PanelFanta panel3;
    private PanelFanta panel4;
    private PanelFanta panel5;
    public PanelDepositoFanta(){
        panel1 = new PanelFanta();
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel1);
        panel2 = new PanelFanta();
        panel2.setBackground(Color.white);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel2);
        panel3 = new PanelFanta();
        panel3.setBackground(Color.white);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel3);
        panel4 = new PanelFanta();
        panel4.setBackground(Color.white);
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel4);
        panel5 = new PanelFanta();
        panel5.setBackground(Color.white);
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel5);

        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
}
