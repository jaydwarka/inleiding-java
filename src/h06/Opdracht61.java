package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht61 extends Applet {
    int Jan, Ali, Jeanette, Jay, Bedrag, Eindbedrag1, Eindbedrag2, Eindbedrag3,Eindbedrag4;

    public void init() {
        Jan = 4;
        Ali = 4;
        Jeanette = 4;
        Jay = 4;
        Bedrag = 113;

        Eindbedrag1 = Bedrag / Jan;
        Eindbedrag2 = Bedrag / Ali;
        Eindbedrag3 = Bedrag / Jeanette;
        Eindbedrag4 = Bedrag / Jay;



    }

    public void paint(Graphics g) {
        //jan
        g.drawString("Jan: ",50,40);
        g.drawString(String.valueOf(Eindbedrag1),75,40);
        //ali
        g.drawString("Ali: ",55,60);
        g.drawString(String.valueOf(Eindbedrag2),75,60);
        //jeanette
        g.drawString("Jeanette: ",20,80);
        g.drawString(String.valueOf(Eindbedrag3),75,80);
        //jay
        g.drawString("Jay: ",50,100);
        g.drawString(String.valueOf(Eindbedrag4),75,100);




    }
}
