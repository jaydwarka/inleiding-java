package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht47 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRoundRect(20,20,150,150,30,30);
        g.drawOval(40,40, 40,40);
        g.drawOval(110,40,40,40);
        g.drawOval(40,110,40,40);
        g.drawOval(110,110,40,40);

    }
}
