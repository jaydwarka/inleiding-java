package h02;


import java.applet.Applet;
import java.awt.*;

public class Kleuren extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("jay",50,60);
        //opdracht 2.1


        //opdracht 2.2
        g.setColor(Color.white);
        g.fillRect(50,100,170,170);
        //achtergrond

        g.setColor(Color.blue);
        g.drawString("jay",100,170);
        //voornaam

        g.setColor(Color.red);
        g.drawString("dwarka",100, 180);


    }
}
