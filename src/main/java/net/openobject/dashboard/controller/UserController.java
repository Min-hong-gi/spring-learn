package net.openobject.dashboard.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.openobject.dashboard.dao.UserRepo;
import net.openobject.dashboard.dto.LoginDTO;
import net.openobject.dashboard.dto.RegistDTO;
import net.openobject.dashboard.dto.User;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping(value = "/login")
    public String login(HttpServletRequest request, LoginDTO loginData) {
		try {
			User user = userRepo.getUser(loginData);
            if(user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
            }
		} catch (Exception e) {
            System.out.println(e);
			return "error";
		}
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "user/login";
    }

    @PostMapping("/regist")
    public String regist(HttpServletRequest request, RegistDTO registData) {
		try {
            if(userRepo.idCheck(registData.getUser_id()) != null) {

                return "error";
            }
			userRepo.addUser(registData);
		} catch (Exception e) {
			return "error";
		}
        return "user/login";
    }

    @GetMapping("/regist")
    public String registPage() {
        return "user/regist";
    }
}
