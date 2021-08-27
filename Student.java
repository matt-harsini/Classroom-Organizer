
public class Student  extends Person implements Displayable{
	int studentId;
	int finalGrade;
	
	public Student(String fname, String lname, int id, int grade)
	{
		firstName=fname;
		lastName=lname;
		studentId=id;
		finalGrade=grade;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void setStudentId(int id)
	{
		studentId=id;
	}
	
	public int getFinalGrade()
	{
		return finalGrade;
	}
	
	public void setFinalGrade(int grade)
	{
		finalGrade=grade;
	}
	
	public String display()
	{
		return "Student ID: "+studentId+ "   "+getFullName()+" Final Grade: "+finalGrade; 
	}
	
}
