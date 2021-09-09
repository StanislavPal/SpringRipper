package screensaver;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Random;

@Component
@Scope("prototype")
public class MyColor{
    private Color color;

    public MyColor(){
        Random random = new Random();
        color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public Color getColor() {
        return color;
    }
}
