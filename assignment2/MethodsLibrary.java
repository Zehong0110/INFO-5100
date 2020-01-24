
public class MethodsLibrary {
	/*
	 * 1) Write a method to take a String and character as input and find how many
	 * characters are in the String
	 */
	int countChar(String inputString, char c) {
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == c) {
				count++;
			}
		}

		return count;
	}

	/*
	 * 2) Write a method to find the maximum and minimum number in an array of
	 * numbers
	 */
	void findMaxMin(int[] arr) {
		int max, min;
		max = min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Max is " + max + " and Min is " + min);

	}

	/*
	 * 3) Write a java function that adds all the digits of an integer until it is
	 * single digit.
	 */
	public int addDigits(int input) {

		while (input >= 10) {
			int temp = 0;
			while (input > 0) {
				temp = temp + input % 10;
				input = input / 10;
			}
			input = temp;
		}
		return input;
	}

	/* 4) Question */
	public double socialSecurityTax(Employee employee) {

		double tax;
		double number = employee.salary;
		if (number < 8900) {
			tax = number * 0.062;
		} else {

			tax = 106800 * 0.062;
		}

		return tax;

	}

	public static double insuranceCoverage(Employee employee) {
		double insurance;
		double salary = employee.salary;
		int age = employee.age;
		if (age < 35) {

			insurance = salary * 0.03;
		}

		else if (age >= 35 && age <= 50) {
			insurance = salary * 0.04;
		}

		else if (age >= 50 && age <= 60) {
			insurance = salary * 0.05;
		} else {
			insurance = salary * 0.06;

		}
		return insurance;

	}

	public void sortSalary(Employee e1, Employee e2, Employee e3) {

		Employee e;
		if (e1.salary > e2.salary) {
			e = e1;
			e1 = e2;
			e2 = e;
		}
		if (e2.salary > e3.salary) {
			e = e2;
			e2 = e3;
			e3 = e;
		}
		if (e1.salary > e2.salary) {
			e = e1;
			e1 = e2;
			e2 = e;
		}
		System.out
				.println("The order of employees by sorted salary is " + " " + e1.name + " " + e2.name + " " + e3.name);

	}
	/*
	 * write your understanding here. 
	 * Your Answer: When the method is invoked,
	 * parameters of the method is called by value, not by reference.
	 */
}
