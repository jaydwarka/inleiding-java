package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht45 extends Applet {

    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
      g.fillArc(30,30,90,90,90,180);
        g.drawOval(30,30,90,90);






    }
}
