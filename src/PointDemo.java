

public class PointDemo {

    public static void main(String[] args) {

        // Skapa några punkter

        Point p1 = new Point();
        Point p2 = new Point();

        // Skriver ut referensen inte värdet. p1: Point@10f87f48 p2: Point@b4c966a
        printerline("p1: " + p1);
        printerline("p2: " + p2);

        printer(p1, p2);
        printerline("-------");

        printerline("-------------");
        // Dålig lösning, mer kommer i kap 15, smarta objekt
        p1.x = 5; // flyttar x 5 steg åt höger
        p1.y = -5; // flyttar y 5 steg nedåt

        p2.x = 0;
        p2.y = 0;

        printer(p1, p2);

        // Beräkna avståndet mellan p1 och p2
        double dis = Point.distance(p1,p2);
        Point mid = Point.midPoint(p1,p2);

        System.out.printf("Avstånd = %.2f \n",dis);
        System.out.print("Mittpunkten är ");
        Point.print(mid);
        printerline("-------");


        // Flytta punkt 1
        p1.x = 10;
        p1.y = 0;
        mid = Point.midPoint(p1,p2);

        printer(p1, p2);
        System.out.printf("Avstånd = %.2f \n",Point.distance(p1,p2));
        System.out.println("Mittpunkten är (" + mid.x + "," + mid.y + ")");
        printerline("-------");

        // Flytta punkt 1
        p1.x = 3;
        p1.y = 4;
        mid = Point.midPoint(p1,p2);

        printer(p1, p2);
        System.out.printf("Avstånd = %.2f \n",Point.distance(p1,p2));
        System.out.println("Mittpunkten är (" + mid.x + "," + mid.y + ")");
        printerline("-------");



    }

    private static void printerline(String s) {
        System.out.println(s);
    }

    private static void printer(Point p1, Point p2) {
        System.out.println("p1(" + p1.x + " , " + p1.y + ")"); // Formatering för kordinater p1(0.0 , 0.0)
        System.out.println("p2(" + p2.x + " , " + p2.y + ")"); // p2(0.0 , 0.0)
    }
}
