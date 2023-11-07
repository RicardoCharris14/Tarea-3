package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoSuper8 extends JPanel {
    private PanelSuper8 panel1;
    private PanelSuper8 panel2;
    private PanelSuper8 panel3;
    private PanelSuper8 panel4;
    private PanelSuper8 panel5;
    public PanelDepositoSuper8(){
        panel1 = new PanelSuper8();
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel1);
        panel2 = new PanelSuper8();
        panel2.setBackground(Color.white);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel2);
        panel3 = new PanelSuper8();
        panel3.setBackground(Color.white);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel3);
        panel4 = new PanelSuper8();
        panel4.setBackground(Color.white);
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel4);
        panel5 = new PanelSuper8();
        panel5.setBackground(Color.white);
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel5);

        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
}
