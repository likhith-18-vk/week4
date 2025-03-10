class Calculator {
    void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}

class Operations extends Calculator {
    double addition(double a, double b) {
        return a + b;
    }
    
    double subtraction(double a, double b) {
        return a - b;
    }
}

class AdvancedOperations extends Operations {
    double multiplication(double a, double b) {
        return a * b;
    }
    
    double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        AdvancedOperations calculator = new AdvancedOperations();
        
        double additionResult = calculator.addition(18, 3);
        calculator.displayResult(additionResult);

        double subtractionResult = calculator.subtraction(18, 3);
        calculator.displayResult(subtractionResult);

        double multiplicationResult = calculator.multiplication(18, 3);
        calculator.displayResult(multiplicationResult);

        double divisionResult = calculator.division(18, 0); 
        if (!Double.isNaN(divisionResult)) {
            calculator.displayResult(divisionResult);
        }
        
        divisionResult = calculator.division(6, 3);
        calculator.displayResult(divisionResult);
    }
}