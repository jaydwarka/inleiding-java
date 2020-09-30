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
        g.drawLine(40, 30, 200, 30);
        g.drawString("lijn", 100, 45);

        //rechthoek
        g.drawRect(210, 30, 100, 40);
        g.drawString("rechthoek", 230, 85);

        //ovaal met kleur
        g.setColor(Color.magenta);
        g.drawRect(60, 60, 100, 40);
        g.fillRect(60, 60, 100, 40);
        g.setColor(Color.black);
        g.drawOval(60, 60, 100, 40);
        g.drawString("ovaal met kleur", 70, 115);

        //afgeronde rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(60,120,100,40,20,20);
        g.drawString("afgeronde rechthoek",60,175);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.drawOval(210,90,100,40);
        g.fillOval(210,90,100,40);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",220,145);

        //cirkel
        g.setColor(Color.black);
        g.drawOval(60,185,60,60);
        g.drawString("cirkel",75,260);

        //taartpunt met ovaal eromheen
        g.drawArc(210,160,100,50,90,45);
        g.setColor(Color.magenta);
        g.fillArc(210,160,100,50,90,45);
        g.setColor(Color.black);
        g.drawOval(210,160,100,50);
        g.drawString("taartpunt met ovaal eromheen",210,225);


    }
 }
