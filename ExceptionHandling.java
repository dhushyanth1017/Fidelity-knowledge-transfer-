
import java.util.Scanner;



public class SalaryChecker {

    
    static void evaluateSalary(double salary) throws SalaryEvaluationException {
        if (salary < 0) {
            throw new SalaryEvaluationException("Invalid input: salary cannot be negative.");
        } else if (salary < 2100) {
            throw new SalaryEvaluationException("you need to work hard");
        } else if (salary >= 2100 && salary <= 5000) {
            throw new SalaryEvaluationException("your salary is somehow good");
        } else if (salary >= 5100 && salary <= 9000) {
            throw new SalaryEvaluationException("salary is very good");
        } else if (salary > 9000) {
            throw new SalaryEvaluationException("excellent salary");
        } else {
            throw new SalaryEvaluationException("range not defined in the requirement (5001–5099)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your monthly salary: ");
            double salary = sc.nextDouble();

            
            evaluateSalary(salary);

            
            System.out.println("Salary evaluation completed.");
        } catch (SalaryEvaluationException see) {
            System.out.println(see.getMessage());
        } 
    }
}



class SalaryEvaluationException extends Exception {
    public SalaryEvaluationException(String message) {
        super(message);
    }
}

