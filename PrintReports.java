import java.util.*;
public class PrintReports {
	Scanner input = new Scanner(System.in);
	ArrayList<Displayable> classroomList = new ArrayList<Displayable>();//classroom list
	int roomNumber;
	public PrintReports() {
		int answer;
		do {
			Displayable classroom = enterClassroom();
			classroomList.add(classroom);
			System.out.println("Would you like to enter another classroom? (1 for yes) (2 for no).");
			answer = input.nextInt();
		} while(answer == 1);
		report(classroomList);
	}
	public Displayable enterClassroom() {
		System.out.println("Enter a room number");
		System.out.println("Please enter a room number greather than 100.");
		roomNumber = input.nextInt();
		Displayable teacher = enterTeacher();
		ArrayList<Displayable> students = new ArrayList<Displayable>();
		boolean flag = true;
		do {
			System.out.println("Would you like to enter a student(enter 1) or would you like to quit(enter 2)");
			int studentNumber = input.nextInt();
			 switch(studentNumber) {
			 	case 1: 
			 		students.add(enterStudents());
			 		break;
			 	case 2:
			 		flag = false; 
			 }
		} while (flag == true);
		Classroom x = new Classroom(roomNumber, teacher, students);
		return (Displayable) x;
	}
	public Displayable enterTeacher() {
		String firstName;
		String lastName;
		String subject;
		System.out.println("Enter first name of the Teacher.");
		firstName = input.next();
		System.out.println("Enter the last name of the Teacher.");
		lastName = input.next();
		System.out.println("Enter the subject that the Teacher teaches.");
		subject = input.next();
		Teacher s = new Teacher(firstName, lastName, subject);
		Displayable teacher1 = (Displayable)s;
		return teacher1;
	}
	public Displayable enterStudents() {
		String firstName;
		String lastName;
		int studentID;
		int studentGrade;
		System.out.println("Enter the first name of Student.");
 		firstName = input.next();
 		System.out.println("Enter last name of Student."); //Lorentz
 		lastName = input.next();
 		System.out.println("Enter the student ID.");
 		studentID = input.nextInt();
 		System.out.println("Enter the student grade.");
 		studentGrade = input.nextInt();
 		Student s = new Student(firstName, lastName, studentID, studentGrade);
 		Displayable student1 = (Displayable)s;
 		return student1;
	}
	void report(ArrayList<Displayable> x) {
		for(Displayable d : x) {
			System.out.println(d.display());
		}
	}
}
