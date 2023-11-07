package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    private PanelMoneda100 pnlMoneda100;
    private PanelMoneda500 pnlMoneda500;
    private PanelMoneda1000 pnlMoneda1000;
    private PanelMoneda5000 pnlMoneda5000;
    public PanelComprador(){
        pnlMoneda100 = new PanelMoneda100();
        pnlMoneda500 = new PanelMoneda500();
        pnlMoneda1000 = new PanelMoneda1000();
        pnlMoneda5000 = new PanelMoneda5000();

        this.add(pnlMoneda100);
        this.add(pnlMoneda500);
        this.add(pnlMoneda1000);
        this.add(pnlMoneda5000);


        this.setLayout(null);
        this.setBackground(Color.green);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        pnlMoneda100.setBounds(10,0,50,50);
        pnlMoneda500.setBounds(70,0,50,50);
        pnlMoneda1000.setBounds(130,0,50,50);
        pnlMoneda5000.setBounds(190,0,50,50);
    }
}
