package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //staafdiagram
        g.drawLine(50,120,50,280);
        g.drawLine(45,280,55,280);
        g.drawString("20",35,280);
        g.drawLine(45,240,55,240);
        g.drawString("40",30,240);
        g.drawLine(45,200,55,200);
        g.drawString("60",30,200);
        g.drawLine(45,160,55,160);
        g.drawString("80",30,160);
        g.drawLine(45,120,55,120);
        g.drawString("100",25,120);

        //staaf 1
        g.setColor(Color.red);
        g.drawRect(60,240,20,40);
        g.fillRect(60,240,20,40);
        g.drawString("valerie",60,295);

        //staaf 2
        g.setColor(Color.green);
        g.drawRect(110,120,20,160);
        g.fillRect(110,120,20,160);
        g.drawString("jeroen",110,295);

        //staaf 3
        g.setColor(Color.blue);
        g.drawRect(160,160,20,120);
        g.fillRect(160,160,20,120);
        g.drawString("hans",160,295);

    }
}
