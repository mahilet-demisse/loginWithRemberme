package service;

import model.User;

import org.springframework.stereotype.Service;

@Service
public interface Authenticate {

	
	public boolean check(User u);
}
