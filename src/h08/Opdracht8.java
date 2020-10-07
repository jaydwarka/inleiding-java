package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8 extends Applet {

    Button voorbeeldKnopje;
    TextField voorbeeldtekstvak;
    int counter;
    Color backgroundColor;


    public void init() {

     voorbeeldKnopje = new Button("klik hier");
     voorbeeldtekstvak = new TextField("", 30);
     add(voorbeeldKnopje);
     add(voorbeeldtekstvak);


     voorbeeldKnopje.addActionListener(new TextToTerminalListener());
     counter = 0;
     backgroundColor = Color.green;


    }

    public void paint(Graphics g) {

        voorbeeldKnopje.setLocation(50,100);
        voorbeeldtekstvak.setLocation(50,10);
        voorbeeldKnopje.setLabel("verander mij");
        voorbeeldKnopje.setSize(300,40);
        voorbeeldtekstvak.setSize(300,40);
        setBackground(backgroundColor);

    }
    class TextToTerminalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = voorbeeldtekstvak.getText();
            voorbeeldKnopje.setLabel(message);
            backgroundColor = Color.yellow;
            repaint();

        }
    }


}
