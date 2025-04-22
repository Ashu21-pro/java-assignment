
public class multdiv {

	 public static int multiply(int a, int b) {
		//multiply program
        int result = 0;
        boolean negative = false;

        // Handle negative numbers
        if (a < 0) {
            a = -a;
            negative = !negative;
        }
        if (b < 0) {
            b = -b;
            negative = !negative;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return negative ? -result : result;
    }

    //divding program
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        int quotient = 0;
        boolean negative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        int a = -158;
        int b = 88;

        System.out.println("Multiplication of " + a + " and " + b + " = " + multiply(a, b));
        System.out.println("Division of " + a + " by " + b + " = " + divide(a, b));
    }


	}


