package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht101 extends Applet {
    TextField tekstvak;
    String getal;
    double laagste,hoogste;



    public void init() {
        //tekstvak
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new tekstListener());

       //ingevoerde getal
        getal = "";


        add(tekstvak);

    }

    public void paint(Graphics g) {
        //antwoord
        g.drawString(getal, 150,60);

    }
    class tekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            hoogste = Double.parseDouble(s);
            if (hoogste > laagste){
                laagste = hoogste;
                getal = String.valueOf(hoogste);
            }

            repaint();
        }
    }
}