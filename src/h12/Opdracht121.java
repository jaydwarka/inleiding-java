package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht121 extends Applet {
    double[] getallen;
    double[] kopie;

    public void init() {
        getallen = new double[10];

        for (int teller = 0; teller < getallen.length; teller++) {
            getallen[teller] = 1 * (teller + 1);
            
        }



    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 80, 20 * teller + 20);
            g.drawString("gemiddelde" + " 5,5", 15, 220);
            
        }

        }

    }

