import java.util.Scanner;


/**
 * Flower bed is shaped like a circle.
 * Calculate its perimeter and area.
 * Input the radius from the console, and output obtained results.
 */
public class FlowerBed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input radius of flower bed, meters: ");
        double radius = scanner.nextDouble();

        double perimeter, area;

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter of flower bed is " + perimeter + " m");
        System.out.println("Area of flower bed is " + area + " m^2");

        scanner.close();
    }

}
