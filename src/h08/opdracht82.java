package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht82 extends Applet {
    Button man;
    Button vrouw;
    int counter1, counter2;

    public void init() {
        man = new Button("man");
        add(man);
        counter1 = 1;

        vrouw = new Button("women");
        add(vrouw);
        counter2 = 2;
        man.addActionListener(new knoplistener());
        vrouw.addActionListener(new knopwoman());
    }


    public void paint(Graphics g) {
        man.setLabel("men" + counter1);
        vrouw.setLabel("woman" + counter2);

    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.print("klik" + counter1);
            counter1++;
            repaint();

        }
    }

    class knopwoman implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("klak" + counter2);
            counter2++;
            repaint();
        }
    }
}

