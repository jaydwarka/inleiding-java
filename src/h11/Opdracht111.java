package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht111 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (int i = 0; i < 10; i++) {
            g.drawLine(10 + i * 10,15, 10 + i * 10,60);

        }

    }
}

