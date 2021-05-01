package homeworkInheritance;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kaydedildi.");
		
	}
	public void addMultipleUser(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	

}
