package taskPersonStudentEmployee;



public class Demo {

	public static void main(String[] args) {
		
		
	       

		Employee first = new Employee("First", 15, false, 16);
		Person second = new Person("Second", 15, false);
		Employee third = new Employee("Third", 54, true, 23);
		Student fourth = new Student("Fourth", 23, true, 4.3f);
		Student fifth = new Student("Fifth", 23, false, 5.6f);
		Person sixth = new Person("Sixth", 43, false);
		Person seventh = new Person("Seventh", 12, false);
		Employee eighth = new Employee("Eighth", 34, true, 32);
		Student ninth = new Student("Ninth", 30, false, 2.6f);
		Person[] people = { first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, null };

		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index] instanceof Student) {
					((Student) people[index]).showStudentInfo();
				} else if (people[index] instanceof Employee) {
					((Employee) people[index]).showEmployeeInfo();
				} else {
					people[index].showPersonInfo();
				}
			}
		}

		first.calculateOverTime(10);
		third.calculateOverTime(10);
		eighth.calculateOverTime(10);
		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index] instanceof Employee) {
					((Employee) people[index]).showEmployeeInfo();
				}
			}
		}
	}
}