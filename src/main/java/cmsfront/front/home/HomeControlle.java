package cmsfront.front.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlle {

    @GetMapping("")
    public String home() {
        return "index";
    }
}
