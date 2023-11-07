package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoCoca extends JPanel {
    private PanelCocaCola panel1;
    private PanelCocaCola panel2;
    private PanelCocaCola panel3;
    private PanelCocaCola panel4;
    private PanelCocaCola panel5;
    public PanelDepositoCoca(){
        panel1 = new PanelCocaCola();
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel1);
        panel2 = new PanelCocaCola();
        panel2.setBackground(Color.white);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel2);
        panel3 = new PanelCocaCola();
        panel3.setBackground(Color.white);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel3);
        panel4 = new PanelCocaCola();
        panel4.setBackground(Color.white);
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel4);
        panel5 = new PanelCocaCola();
        panel5.setBackground(Color.white);
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel5);

        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
}
