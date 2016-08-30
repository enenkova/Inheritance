package taskPersonStudentEmployee;

public class Employee extends Person {
	private static final int MIN_AGE_FOR_WORK = 18;
	static final double COEF_FOR_CALCULATING_OVERTIME = 1.5;
	static final int MAX_WORKING_HOUR_FOR_DAY = 8;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	void showEmployeeInfo(){
		System.out.println("The name of employee is " + this.getName() + ", age "
				+ this.getAge() + ", is a man " + this.isMale() + ", salary "
				+ this.getDaySalary());
	}
	
	
	double calculateOverTime (double hour){
		double hourSalary = (this.getDaySalary()/MAX_WORKING_HOUR_FOR_DAY);
		double extraHour = hour - MAX_WORKING_HOUR_FOR_DAY;
		if (extraHour > 0) {
			if (this.getAge() < MIN_AGE_FOR_WORK) {
				return 0;
			} else {
				 this.setDaySalary((hourSalary*COEF_FOR_CALCULATING_OVERTIME)*extraHour + this.getDaySalary());
			}
		} else {
			System.out.println("The employee doesn't working overtime");
		} 
		return this.getDaySalary();
	}
	
	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("The salary is negative number");
		}
	}
}
