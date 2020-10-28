package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht51 extends Applet {
    int breedte, hoogte;
    Color vulkleur = Color.magenta;
    Color lijnkleur = Color.black;

    public void init() {
        hoogte = 30;
        breedte = 50;

    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(10,30,100,30);
        g.drawString("lijn", 50,45);

        //rechthoek
        g.drawRect(120,10,breedte,hoogte);
        g.drawString("rechthoek", 120,53);

        //afgeronde rechthoek
        g.drawRoundRect(10,60,breedte,hoogte,20,20);
        g.drawString("ronde rechthoek", 10,105);

        //gevulde rechthoek met ovaal
        g.setColor(vulkleur);
        g.drawRect(120,60,breedte,hoogte);
        g.fillRect(120,60,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(120,60,breedte,hoogte);
        g.drawString("rechthoek met ovaal",120,105);

        //gevulde ovaal
        g.setColor(vulkleur);
        g.drawOval(200,10,breedte,hoogte);
        g.fillOval(200,10,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("gevulde ovaal",200,55);

        //cirkel
        g.drawOval(240,60,40,40);
        g.drawString("cirkel",245,115);

        //taartpunt
        g.drawArc(300,10,breedte,hoogte,45,90);
        g.setColor(vulkleur);
        g.fillArc(300,10,breedte,hoogte,45,90);
        g.setColor(lijnkleur);
        g.drawOval(300,10,breedte,hoogte);
        g.drawString("taartpunt met ovaal",290,55);



    }
}
