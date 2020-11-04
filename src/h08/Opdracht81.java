package h08;

import java.applet.Applet;
import java.awt.*;

public class Opdracht81 extends Applet {
    Button knop;
    Button resetknop;
    TextField tekstvak;
    Label sticker;


    public void init() {
        //resetknop
        resetknop = new Button("reset");
        add(resetknop);

        //voegknop
        knop = new Button("voeg toe");
        add(knop);

        //tekstvak
        tekstvak = new TextField("",30);
        add(tekstvak);



    }

    public void paint(Graphics g) {


    }
}

