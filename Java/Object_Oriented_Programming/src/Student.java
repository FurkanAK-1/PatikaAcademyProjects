
public class Student {
	String name, stuNo;
	int grade;
	Course math;
	Course physics;
	Course chemistry;
	double average;
	boolean isPass;

	Student(String name, int grade, String stuNo, Course math, Course physics, Course chemistry) {
		this.name = name;
		this.grade = grade;
		this.stuNo = stuNo;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		calcAverage();
		this.isPass = false;
	}

	public void addBulkExamNote(int math, int physics, int chemistry, int mathOral, int physicsOral,
			int chemistryOral) {

		if (math >= 0 && math <= 100) {
			this.math.note = math;
		}

		if (physics >= 0 && physics <= 100) {
			this.physics.note = physics;
		}

		if (chemistry >= 0 && chemistry <= 100) {
			this.chemistry.note = chemistry;
		}

		if (mathOral >= 0 && mathOral <= 100) {
			this.math.oralNote = mathOral;
		}

		if (physicsOral >= 0 && physicsOral <= 100) {
			this.physics.oralNote = physicsOral;
		}

		if (chemistryOral >= 0 && chemistryOral <= 100) {
			this.chemistry.oralNote = chemistryOral;
		}
	}

	public void isPass() {
		if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 || this.math.oralNote == 0
				|| this.physics.oralNote == 0 || this.chemistry.oralNote == 0) {
			System.out.println("Grades have not been fully entered");
		} else {
			this.isPass = checkPass();
			printNote();
			System.out.println("Average : " + this.average);
			if (this.isPass) {
				System.out.println("Passed the class.");
			} else {
				System.out.println("Failed the class.");
			}
		}
	}

	public void calcAverage() {
		this.average = (this.math.calcCourseAverage() + this.physics.calcCourseAverage()
				+ this.chemistry.calcCourseAverage()) / 3;
	}

	public boolean checkPass() {
		calcAverage();
		return this.average > 55;
	}

	public void printNote() {
		System.out.println("=========================");
		System.out.println("Student : " + this.name);
		System.out.println("Math Grade : " + this.math.note + " | Oral Grade : " + this.math.oralNote);
		System.out.println("Physics Grade : " + this.physics.note + " | Oral Grade : " + this.physics.oralNote);
		System.out.println("Chemistry Grade : " + this.chemistry.note + " | Oral Grade : " + this.chemistry.oralNote);
	}
}
