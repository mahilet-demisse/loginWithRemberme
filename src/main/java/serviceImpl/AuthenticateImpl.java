package serviceImpl;

import model.User;

import org.springframework.stereotype.Service;

import service.Authenticate;

@Service

public class AuthenticateImpl implements Authenticate {

	public boolean check(User u) {
		if(("admin".equals(u.getUname()))&& ("test123".equals(u.getPword()))){
			
			return true;
		}
		
		return false;
	}
	

}
