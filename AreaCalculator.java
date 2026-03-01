import java.util.Scanner
class AreaCalculator 
{

   
    static double rectangleArea(double length, double width) 
	{
        return length * width;
    }

    
    static double circleArea(double radius) 
	{
        return Math.PI * radius * radius;
    }

    
    static double squareArea(double side) 
	{
        return side * side;
    }

    
    static double triangleArea(double base, double height) 
	{
        return 0.5 * base * height;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Area Calculator ===");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    System.out.println("Area = " + rectangleArea(l, w));
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + circleArea(r));
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    System.out.println("Area = " + squareArea(s));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Area = " + triangleArea(b, h));
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        
    }
}
