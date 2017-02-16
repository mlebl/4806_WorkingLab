package addressbook;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    private final GreetingService service;

    public MyController (GreetingService service){
        this.service = service;
    }

    @RequestMapping("/")
    public @ResponseBody String home() {
        return "Hello World!!";
    }


    @RequestMapping("/mypage")
    public @ResponseBody String greeting() {
        return service.greet();
    }


}

