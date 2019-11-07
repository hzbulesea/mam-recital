package login;

public class Teacher extends User{
	private String teacherID;

	// Constructors
	public Teacher() {
		super();
	}
	public Teacher(String lastName, String firstName) {
		super(lastName, firstName);
	}
	// getters and setters
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	
}
