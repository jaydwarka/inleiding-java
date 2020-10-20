package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {

    Button knop;
    TextField tekstveld;


    public void init() {
        //toevoegen
        knop = new Button("klik hier");
                add(knop);
        tekstveld = new TextField("type hier",10);
        add(tekstveld);


                //aansluitend knopje op actionlistenere
                knop.addActionListener(new TextToTerminalListener());

    }


    public void paint(Graphics g) {

    }
    class TextToTerminalListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            System.out.println("je hebt geklikt");

        }
    }
}
