package helloServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloServletHomeController {
    @GetMapping(value = "/helloServlet")
    public String home() {
        return "helloServlet/login";
    }
}
