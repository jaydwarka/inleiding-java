package h06;

import java.applet.Applet;
import java.awt.*;

public class Getallen extends Applet {
    double getal1,getal2,getal3,delen;
    double uitkomst;
    int geheel;
    double gebroken;





    public void init() {
    getal1 = 5.9;
    getal2 = 6.3;
    getal3 = 6.9;
    delen = 3;
    uitkomst = (int) (getal1 + getal2 + getal3) / delen;
    gebroken = geheel;
    geheel = (int) gebroken ;

    }

    public void paint(Graphics g) {
    g.drawString("De uitkomst is: " + uitkomst, 20,20);
    }
}
