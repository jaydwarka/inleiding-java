package h11;

import java.applet.Applet;
import java.awt.*;


public class Opdracht113 extends Applet {
  int oud = 0;
  int nieuw = 1;
  int tijd = 1;


    
    public void init() {

        
    }

    
    public void paint(Graphics g) {
        for (int i = 0; i < 17; i++) {
            int tijd = oud + nieuw;
            g.drawString(tijd + "",10,15 + i * 15);
            oud = nieuw;
            nieuw =tijd;




        }
            
        }
        
    }

