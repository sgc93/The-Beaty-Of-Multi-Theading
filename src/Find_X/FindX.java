package Find_X;

public class FindX implements Runnable {
    double a, b, c;
    double discriminant;

    public FindX(double a, double b, double c, double discriminant) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
    }

    @Override
    public void run() {
        if(a == 0){
            double x = -c / b;
            System.out.println("\033[032m");
            System.out.println("The equation is a simple linear type and it has one real solution:");
            System.out.println("x = " + x);
            System.out.println("\033[0m");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("\033[032m");
            System.out.println("The equation has two distinct real solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("\033[0m");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("\033[032m");
            System.out.println("The equation has one real solution:");
            System.out.println("x = " + x);
            System.out.println("\033[0m");
        } else {
            System.out.println("\033[033m");
            System.out.println("The equation has no real solutions.");
            System.out.println("\033[0m");
        }
    }
}