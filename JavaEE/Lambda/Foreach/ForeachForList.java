package JavaEE.Lambda.Foreach;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachForList {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        items.forEach(item ->{
            System.out.println(item);
        });

        List<Point> points = Arrays.asList(new Point(1,1),new Point(2,3));
        points.forEach(point ->{
            point.translate(1,2);
        });
        System.out.println(points);
    }
}
