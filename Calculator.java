package Day_06;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

}

public class Calculator {

	int x;
	int y;

	Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int Add() throws MyException {
		if (x < 0 || y < 0) {
			throw new MyException("Value must not a Negative Number");
		}
		return (x + y);

	}

	public int Sub() throws MyException {
		if (x < 0 || y < 0) {
			throw new MyException("Value must not a Negative Number");
		}
		return (x - y);
	}

	public int Mul() throws MyException {
		if (x == 0 || y == 0) {
			throw new MyException("numbers should not be zero");
		}
		return (x * y);
	}

	public int Div() throws MyException {
		if (x == 0 || y == 0) {
			throw new MyException("numbers should not be zero");
		}
		return (x / y);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter first value:");
			int a = sc.nextInt();
			System.out.println("Enter Second value..");
			int b = sc.nextInt();

			Calculator calculator = new Calculator(a, b);
			System.out.println(" Addition :"+calculator.Add());
			System.out.println(" Substraction :"+calculator.Sub());
			System.out.println(" Multiplication :"+calculator.Mul());
			System.out.println(" Division "+calculator.Div());

		} catch (MyException my) {
			System.out.println(my.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e1) {
			System.out.println("Wrong Input");
		} finally {
			sc.close();
		}

	}
}
