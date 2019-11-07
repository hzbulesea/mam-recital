package login;

public class Student extends User{
	private String studentID;
	private String courseGrade;
	private int courseFee;
	
	// Constructors
	public Student() {
		super();
	}
	public Student(String lastName, String firstName) {
		super(lastName, firstName);
	}
	// getters and setters 
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
}
