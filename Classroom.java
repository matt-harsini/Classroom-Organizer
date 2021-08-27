import java.util.ArrayList;

public class Classroom extends Person implements Displayable {
	int roomNumber;
	Displayable teacher;
	ArrayList<Displayable> students;
	public Classroom() {}
	public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
		this.roomNumber = roomNumber;
		this.teacher = teacher;
		this.students = students;
	}
	@Override
	public String display() {
		String element = "Room Number: " + roomNumber + "\n" + teacher.display() + "\n";
		for(int i = 0; i < students.size(); i++) {
			element += students.get(i).display() + "\n";
		}
		return element;
	}
}
