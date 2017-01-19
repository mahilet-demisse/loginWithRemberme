package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import service.Authenticate;
import serviceImpl.AuthenticateImpl;

@Controller
// @SessionAttributes("user")
public class loginController {

	@Autowired
	Authenticate a;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {

		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(User u, boolean remember, Model model, HttpServletResponse response, HttpSession session) {


		if (a.check(u)) {

			if (remember) {

				Cookie c = new Cookie("user", u.getUname());
				c.setMaxAge(30*24*60*60);
				response.addCookie(c);

			}
			
			
			else if(!remember){
				
				Cookie c = new Cookie("user", null);
				c.setMaxAge(0);
				response.addCookie(c);
			}

			session.setAttribute("user", u);
			return "redirect:/welcome";

		}
		
		

		else {

			model.addAttribute("error", "username or password incorrect");
			return "login";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(
			@RequestParam(value = "check", required = false) String checkbox) {
		

		return "login";
	}

}
