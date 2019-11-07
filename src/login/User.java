package login;

public class User {
	private String LastName;
	private String FirstName;
	private String password;
	private int age;
	private String sex;
	
	// Constructors
	public User() {};
	public User(String lastName, String firstName) {
		super();
		LastName = lastName;
		FirstName = firstName;
	}
	
	// getters and setters
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}

