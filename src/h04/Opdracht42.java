package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht42 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(100,150,120,120);
        g.drawLine(100,150,160,100);
        g.drawLine(160,100,220,150);
        g.drawRect(120,170,20,20);
        g.drawLine(130,170,130,190);
        g.drawLine(120,180,140,180);
        g.drawRect(150,230,20,40);
        g.drawRect(180,170,20,20);
        g.drawLine(190,170,190,190);
        g.drawLine(180,180,200,180);


    }
}
