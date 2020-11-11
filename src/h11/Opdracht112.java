package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht112 extends Applet {
    int teller = 20;


    public void init() {


    }

    public void paint(Graphics g) {
        for (int i = 0 ; i < 11; i++) {
            g.drawString(teller + "",10,10 + i * 15);

            teller--;
        }
    }
}
