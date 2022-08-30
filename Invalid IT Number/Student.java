package checkITNumber;

public class Student {

	private String StudentId;
	private String StudentName;

	public Student(String studentId, String studentName) {

		StudentId = studentId;
		StudentName = studentName;
	}

	public void display() {
//		System.out.println("Student Name : " + StudentName);
//		System.out.println("Student ID : " + StudentId);

		try {
			if (StudentId.length() == 10) {

				if (StudentId.substring(0, 2).equals("IT")) {

					if (StudentId.substring(2, 10).matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
						System.out.println("Student Name : " + StudentName);
						System.out.println("Student ID : " + StudentId);
					} else {
						throw new InvalidITNumberException("Invalid IT Number Numbers");
					}

				} else {

					throw new InvalidITNumberException("IT invalid");
				}
				;

			} else {
				throw new InvalidITNumberException("Invalid it no size");
			}

		} catch (InvalidITNumberException e) {
			System.out.println(e);
		}

	}

}
