package Find_X;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Launcher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[32m");
        System.out.println("    This is a demostration of Multi-Threading in a simple Quadratic equation solver console app. \n    Your expression should have the form like ax^2 + bx + c = 0, where a, b and c are numeric values and ^2 means square or ('exit' to quit)");
        System.out.println("\033[0m");
        String equationPattern = "^\\s*([-+]?\\d*\\.?\\d*)\\s*\\*?\\s*x\\s*\\^\\s*2\\s*([-+])\\s*([-+]?\\d*\\.?\\d*)\\s*\\*?\\s*x\\s*([-+])\\s*([-+]?\\d*\\.?\\d*)\\s*=\\s*0\\s*$";
        Pattern pattern = Pattern.compile(equationPattern);
        boolean exitLoop = false;
        while (!exitLoop) {
            String qEquation = scanner.nextLine();

            if (qEquation.equalsIgnoreCase("exit")) {
                exitLoop = true;
            } else {
                Runnable validator = new Runnable() {
                    @Override
                    public void run() {
                        Matcher matcher = pattern.matcher(qEquation);
                        if (matcher.matches()) {
                            double a = Double.parseDouble(matcher.group(1));
                            double b = Double.parseDouble(matcher.group(3));
                            double c = Double.parseDouble(matcher.group(5));
                            double discriminant = b * b - 4 * a * c;
                            FindX findx = new FindX(a, b, c, discriminant);
                            Thread tr = new Thread(findx);
                            tr.start();
                        } else {
                            System.out.println("\033[031m");
                            System.out.println("Invalid equation format. Please enter a quadratic equation in the form ax^2 + bx + c = 0.");
                            System.out.println("\033[0m");
                        }
                    }
                };
                validator.run();
            }
        }
        scanner.close();
    }
}