package taskPersonStudentEmployee;

public class Person {
	
private String name;
private int age;
private boolean isMale;
 Person[] persons;

public Person(String name, int age, boolean isMale) {
	if (name != null && name.trim().length() >0) {
		this.name = name;
	} else {
		System.out.println("Enter name");
	}
	if (age > 0) {
		this.age = age;
	} else {
		System.out.println("The age is negative");
	}
	this.isMale = isMale;
}

void showPersonInfo(){
	System.out.println("The name of person is " + this.name + ", age "
			+ this.age + ", is a man " + this.isMale);
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public boolean isMale() {
	return isMale;
}

}
