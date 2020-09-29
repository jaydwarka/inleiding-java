package h04;

import java.applet.Applet;
import java.awt.*;

public class Figuren extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //lijn
        g.drawLine(40,30,200,30);
        g.drawString("lijn",100,45);

        //rechthoek
        g.drawRect(210,30,100,40);
        g.drawString("rechthoek",230,85);

        //ovaal met kleur
        g.setColor(Color.magenta);
        g.drawRect(60,60,100,40);
        g.fillRect(60,60,100,40);
        g.setColor(Color.black);
        g.drawOval(60,60,100,40);
        g.drawString("ovaal met kleur",70,115);


    }
}
