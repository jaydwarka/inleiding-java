package h10;

import java.applet.Applet;
import java.awt.*;

public class Opdracht102 extends Applet {
    TextField tekstvak;
    String getal1;
    String getal2;
    double laagste, hoogste;

    public void init() {
        tekstvak = new TextField("", 30);
        //tekstvak.addActionListener(new tekstListener());

        getal1 = "";
        getal2 = "";


    }

    public void paint(Graphics g) {

    }
}
