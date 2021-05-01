package homeworkInheritance;

public class Main {

	public static void main(String[] args) {
		Instructer instructer = new Instructer();
		instructer.setId(1);
		instructer.setFirstName("Engin");
		instructer.setLastName("Demiroğ");
		instructer.setEmail("engindemirog@gmail.com");
		instructer.setAbout("Engin Demiroğ");
		String[] courses = {"java","c#"};
		instructer.setCourses(courses);
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Recep");
		student.setLastName("Azman");
		student.setEmail("rcpazman@gmail.com");
		String[] takenCourses = {"Java"};
		student.setTakenCourses(takenCourses);
		
		User[] users = {instructer,student};
		UserManager userManager = new UserManager();
		userManager.addMultipleUser(users);
		
		
	}
}
