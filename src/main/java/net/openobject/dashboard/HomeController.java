package net.openobject.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home() {
        return "redirect:board";
    }
}
