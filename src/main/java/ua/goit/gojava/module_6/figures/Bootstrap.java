package ua.goit.gojava.module_6.figures;

public class Bootstrap {

    private static Figure figure = null;

    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;

        for (; ; ) {
            System.out.println("Select a figure and enter its number: \n 1. circle \n 2. triangle \n 3. square");
            System.out.println("Enter E to exit");

            choice = (char) System.in.read();

            if (choice == 'E') break;

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (choice < '1' | choice > '3') {
                System.out.println("Figure number should be between 1 and 3 inclusively");
                continue;
            }


            switch (choice) {
                case '1':
                    Circle circle = new Circle(); // создали объект круга
                    circle.printIncomeParameters(); // напечатали мсг с введением данных
                    circle.setRadius();
                    figure = circle;
                    break;
                case '2':
                    Triangle triangle = new Triangle();
                    triangle.printIncomeParameters();
                    triangle.setHeight();
                    triangle.setWidth();
                    figure = triangle;
                    break;
                case '3':
                    Square square = new Square();
                    square.printIncomeParameters();
                    square.setSide();
                    figure = square;
                    break;
            }

            if (InputScanner.value != 0 | InputScanner.width != 0 | InputScanner.height != 0) {
                double calculate = figure.calculate();
                System.out.println("Area of your figure is: " + calculate + "\n");
            }
        }

    }
}