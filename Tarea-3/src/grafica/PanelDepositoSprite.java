package grafica;
import javax.swing.*;
import java.awt.*;
public class PanelDepositoSprite extends JPanel{
    private PanelSprite panel1;
    private PanelSprite panel2;
    private PanelSprite panel3;
    private PanelSprite panel4;
    private PanelSprite panel5;
    public PanelDepositoSprite(){
        panel1 = new PanelSprite();
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel1);
        panel2 = new PanelSprite();
        panel2.setBackground(Color.white);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel2);
        panel3 = new PanelSprite();
        panel3.setBackground(Color.white);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel3);
        panel4 = new PanelSprite();
        panel4.setBackground(Color.white);
        panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel4);
        panel5 = new PanelSprite();
        panel5.setBackground(Color.white);
        panel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(panel5);

        this.setLayout(new GridLayout(1,5));
        this.setBackground(Color.BLACK);
    }
}
