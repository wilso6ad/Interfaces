import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static ArrayList<Object> collectAll(ArrayList<Object> objects,
                                               Filter f) {
        ArrayList<Object> result = new ArrayList<Object>();

        for (Object obj : objects) {
            if (f.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();

        list.add(new Rectangle(85, 25));
        list.add(new Rectangle(30, 20));
        list.add(new Rectangle(3, 2));
        list.add(new Rectangle(5, 3));
        list.add(new Rectangle(20, 20));
        list.add(new Rectangle(1, 2));
        list.add(new Rectangle(5, 6));
        list.add(new Rectangle(2, 3));
        list.add(new Rectangle(0, 0));
        list.add(new Rectangle(2, 1));


        System.out.println("List of Unfiltered rectangles:");
        for (Object ob : list) {
            Rectangle rect = (Rectangle) ob;
            System.out.println("Rectangle with width: " + rect.width
                    + ", height: " + rect.height + ", perimeter: "
                    + (2 * (rect.width + rect.height)));
        }


        ArrayList<Object> filtered = collectAll(list, new BigRectangleFilter());


        System.out.println("\nList of Filtered rectangles with perimeter > 10:");
        for (Object ob : filtered) {
            Rectangle rect = (Rectangle) ob;
            System.out.println("Rectangle with width: " + rect.width
                    + ", height: " + rect.height + ", perimeter: "
                    + (2 * (rect.width + rect.height)));
        }
    }}