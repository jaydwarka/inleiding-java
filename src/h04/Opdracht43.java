package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(30,30,10,250);
        g.setColor(Color.red);
        g.drawRect(40,35,200,30);
        g.fillRect(40,35,200,30);
        g.setColor(Color.black);
        g.drawRect(40,65,200,30);
        g.setColor(Color.blue);
        g.drawRect(40,95,200,30);
        g.fillRect(40,95,200,30);

    }
}
