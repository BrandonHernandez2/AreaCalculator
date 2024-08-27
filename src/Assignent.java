public class Assignent {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    private static double area(double x, double y) {
        //return -1.0 if x or y or both are negative

        if (x < 0){
            return -1;
        }
        if (y < 0){
            return -1;
        }

        //return area of rectangle: Area = base * length

        double Area = x * y;


        return Area;
    }

    private static double area(double radius) {
        //return -1.0 if radius is negative

        if (radius < 0){
            return -1;
        }

        //return area of circle: Area = Pi * radius * radius

        double AoC = Math.PI * radius * radius;

        // use Math.PI for PI


        return AoC;
    }
}