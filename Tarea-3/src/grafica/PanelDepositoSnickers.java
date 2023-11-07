package grafica;

import javax.swing.*;
import java.awt.*;

public class PanelDepositoSnickers extends JPanel {
    private PanelSnickers panel1;
    private PanelSnickers panel2;
    private PanelSnickers panel3;
    private PanelSnickers panel4;
    private PanelSnickers panel5;
    public PanelDepositoSnickers(){
        panel1 = new PanelSnickers();
        this.add(panel1);
        panel2 = new PanelSnickers();
        this.add(panel2);
        panel3 = new PanelSnickers();
        this.add(panel3);
        panel4 = new PanelSnickers();;
        this.add(panel4);
        panel5 = new PanelSnickers();
        this.add(panel5);

        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
}
