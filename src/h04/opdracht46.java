package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht46 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(30,30,100,200);
        g.fillRect(30,30,100,200);
        //rood
        g.setColor(Color.red);
        g.drawOval(50,40,50,50);
        g.fillOval(50,40,50,50);
        //geel
        g.setColor(Color.yellow);
        g.drawOval(50,100,50,50);
        g.fillOval(50,100,50,50);
        //groen
        g.setColor(Color.green);
        g.drawOval(50,160,50,50);
        g.fillOval(50,160,50,50);

    }
}
