package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht52 extends Applet {
    int breedtestaaf;
    int hoogtestaaf1,hoogtestaaf2,hoogtestaaf3;
    Color staaf1 = Color.red;
    Color staaf2 = Color.green;
    Color staaf3= Color.blue;

    public void init() {
        breedtestaaf = 20;
        hoogtestaaf1 = 40;
        hoogtestaaf2 = 160;
        hoogtestaaf3 = 120;

    }


    public void paint(Graphics g) {
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
