

public class PointDemo {

    public static void main(String[] args) {

        // Skapa några punkter

        Point p1 = new Point();
        Point p2 = new Point();

        // Skriver ut referensen inte värdet. p1: Point@10f87f48 p2: Point@b4c966a
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        System.out.println("p1(" + p1.x + " , " + p1.y + ")"); // Formatering för kordinater p1(0.0 , 0.0)
        System.out.println("p2(" + p2.x + " , " + p2.y + ")"); // Formatering för kordinater p2(0.0 , 0.0)

    }
}
