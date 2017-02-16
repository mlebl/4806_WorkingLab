package addressbook;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MyController {

    private final GreetingService service;

    public MyController (GreetingService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("app/index");
        return modelAndView;
    }

    /*
    @RequestMapping("/")
    public @ResponseBody String home() {
        return "Hello World!!";
    }


    @RequestMapping("/mypage")
    public @ResponseBody String greeting() {
        return service.greet();
    }
    */

}

