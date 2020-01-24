
public class Employee {

	String name;
	int age;
	Gender gender;
	double salary;

	public Employee(String name, int age, Gender gender, double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

}

enum Gender {
	MALE,FEMALE
}
