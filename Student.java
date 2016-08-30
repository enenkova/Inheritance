package taskPersonStudentEmployee;

public class Student extends Person {

	static final int MAX_SCORE = 6;
	static final int MIN_SCORE = 2;
	private float score;

	public Student(String name, int age, boolean isMale, float score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	void showStudentInfo(){
		super.showPersonInfo();
		System.out.println(" score " + this.getScore());
	}
	
	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		if (score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		} else {
			System.out.println("Enter score between 2 and 6");
		}

	}
}
