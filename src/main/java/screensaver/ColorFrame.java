package screensaver;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
//@Scope("prototype")
//public abstract class ColorFrame extends JFrame {
public class ColorFrame extends JFrame {

//    @Autowired
//    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(800));
        Color c1 = getMyColor().getColor();
        Color c2 = getMyColor().getColor();
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        getContentPane().setBackground(c1);
        repaint();
    }

    @Lookup
    public MyColor getMyColor() {
        return null;
    }
}
