public class ArithmeticOperations {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ArithmeticOperations <num1> <num2>");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Subtraction: " + (num1 - num2));
            System.out.println("Multiplication: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Division: " + (num1 / num2));
            } else {
                System.out.println("Division: Cannot divide by zero");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}

