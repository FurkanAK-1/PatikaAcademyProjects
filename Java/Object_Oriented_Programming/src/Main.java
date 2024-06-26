
public class Main {

	public static void main(String[] args) {
		Course math = new Course("Math", "MAT101", "MAT", 0.80, 0.20);
		Course physics = new Course("Physics", "PHY101", "PHY", 0.70, 0.30);
		Course chemistry = new Course("Chemistry", "CHE101", "CHE", 0.75, 0.25);

		Teacher t1 = new Teacher("Professor Mahmut", "90550000000", "MAT");
		Teacher t2 = new Teacher("Professor Fatma", "90550000001", "PHY");
		Teacher t3 = new Teacher("Professor Ali", "90550000002", "CHE");

		math.addTeacher(t1);
		physics.addTeacher(t2);
		chemistry.addTeacher(t3);

		Student s1 = new Student("Student Saban", 4, "140144015", math, physics, chemistry);
		s1.addBulkExamNote(50, 20, 40, 70, 60, 50);
		s1.isPass();

		Student s2 = new Student("Student Necmi", 4, "2211133", math, physics, chemistry);
		s2.addBulkExamNote(100, 50, 40, 90, 85, 75);
		s2.isPass();

		Student s3 = new Student("Student Ismail", 4, "221121312", math, physics, chemistry);
		s3.addBulkExamNote(50, 20, 40, 60, 55, 45);
		s3.isPass();
	}

}
