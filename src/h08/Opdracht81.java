//het lukt mij niet om de resetknop te laten werken
package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
    Button knop;
    Button resetknop;
    TextField tekstvak;
    Label label;


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

        label = new Label("antwoord");
        add(label);



        knop.addActionListener(new knoplistener());
        //resetknop.addActionListener(new knopdelete());



    }

    public void paint(Graphics g) {



    }

    private void clearFields(){
        label.setText(".");

    }
    class knoplistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String message = tekstvak.getText();
            label.setText(message);





        }
    class knopdelete implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String delete = tekstvak.getText();
            resetknop. setLabel(delete);

            repaint();

        }
    }

    }

}

