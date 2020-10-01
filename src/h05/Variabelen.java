package h05;

import java.applet.Applet;
import java.awt.*;

public class Variabelen extends Applet {
    //variabelen
    int breedte, hoogte;
    int breedtestaaf;
    int hoogtestaaf1,hoogtestaaf2,hoogtestaaf3;
    Color vulkleur = Color.magenta;
    Color lijnkleur = Color.black;
    Color staaf1 = Color.red;
    Color staaf2 = Color.green;
    Color staaf3= Color.blue;


    public void init() {

        breedte = 50;
        hoogte = 30;
        breedtestaaf = 20;
        hoogtestaaf1 = 40;
        hoogtestaaf2 = 160;
        hoogtestaaf3 = 120;

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

        //grafieklijn
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
        g.setColor(staaf1);
        g.drawRect(60,240,breedtestaaf,hoogtestaaf1);
        g.fillRect(60,240,breedtestaaf,hoogtestaaf1);
        g.drawString("valerie",60,295);

        //staaf 2
        g.setColor(staaf2);
        g.drawRect(110,120,breedtestaaf,hoogtestaaf2);
        g.fillRect(110,120,breedtestaaf,hoogtestaaf2);
        g.drawString("jeroen",110,295);

        //staaf 3
        g.setColor(staaf3);
        g.drawRect(160,160,breedtestaaf,hoogtestaaf3);
        g.fillRect(160,160,breedtestaaf,hoogtestaaf3);
        g.drawString("hans",160,295);











    }
}
