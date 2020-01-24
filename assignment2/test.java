
public class test {
	
	public static void main(String[] args) {
		
		/*int result;
		MethodsLibrary ml=new MethodsLibrary();
		result=ml.countChar("northnnnn", 'n');
		System.out.println(result);
		*/
		
		/*int[] arrtest= {1,11,4,6,8};
		MethodsLibrary ml=new MethodsLibrary();
		ml.findMaxMin(arrtest);*/
		
		MethodsLibrary ml=new MethodsLibrary();
		//System.out.println(ml.addDigits(37));
		
		Employee a=new Employee("Jenny", 20, Gender.FEMALE, 2000);
		Employee b=new Employee("John", 30, Gender.MALE, 8500);
		Employee c=new Employee("Alex", 30, Gender.MALE, 5500);
		ml.sortSalary(a, b, c);
		//System.out.println("Before: a=" + a.getName());
        //System.out.println("Before: b=" + b.getName());
        //ml.swap(a, b);
        //System.out.println("After: a=" + a.getName());
        //System.out.println("After: b=" + b.getName());
		
	};

}
