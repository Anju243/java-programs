import java.applet.Applet;
import java.awt.*;

/*
<applet code="ShapeApplet" width=400 height=400>
</applet>
*/

public class ShapeApplet extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 60); 

     
        g.setColor(Color.RED);
        g.drawOval(200, 50, 80, 80);

      
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 300, 200); 

       
        g.setColor(Color.BLACK);
        g.drawString("Rectangle", 50, 45);
        g.drawString("Circle", 200, 45);
        g.drawString("Line", 170, 195);
    }
}

