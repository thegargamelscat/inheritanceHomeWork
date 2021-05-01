package homeworkInheritance;

public class Instructer extends User{
	private String about;
	private String[] givenCourses ;
	
	public Instructer() {
		super();
	}

	public Instructer(String about,String[] givenCourses) {
		super();
		this.about = about;
		this.givenCourses = givenCourses;
	}
	
	public String[] getCourses() {
		return givenCourses;
	}

	public void setCourses(String[] givenCourses ) {
		this.givenCourses = givenCourses;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
}
