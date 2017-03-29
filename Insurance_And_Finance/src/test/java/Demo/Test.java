package Demo;

import com.infi.dao.UserHome;
import com.infi.model.User;

public class Test {

	public static void main(String[] args) {
		UserHome user = new UserHome();
		User u = user.findById(1);
		System.out.println(u.getFirstName());
	}

}
