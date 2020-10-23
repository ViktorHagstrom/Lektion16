import java.lang.reflect.Method;

/**
 * Point är en klass som beskriver
 * en punkt i ett koordinatsystem
 */
public class Point {

    // Instansvariabler
    double x; // x-koordinat
    double y; // y-koordinat


    // En klass metod som returnerar avståndet mellan 2 punkter

    /**
     * En klassmetod som returnerar avståndet mellan 2 punkter i ett koordinatsystem
     * @param p1 referens till första punkten
     * @param p2 referens till andra punkten
     * @return avståndet mellan punkterna
     */
    public static double distance(Point p1, Point p2){
        // Deklarera variabel för return
        // double distance = 0;
        // Beräkna avstånd
        // distance = Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));

        return  Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
    }

    /**
     * En klassmetod som returnerar mitt punkten mellan 2 punkter i ett koordinatsystem
     * @param p1 referens till första punkten
     * @param p2 referens till andra punkten
     * @return punkternas mittpunkt
     */
    public static Point midPoint(Point p1, Point p2){

        Point p = new Point();
        p.x = (p1.x + p2.x)/2;
        p.y = (p1.y + p2.y)/2;
        return p;
    }

    /**
     * En klassmetod som skriver ut en punkt i ett koordinatsystem
     * @param p en punkt
     */
    public static void print(Point p){
        System.out.println("(" + p.x + "," + p.y + ")");

    }
}
