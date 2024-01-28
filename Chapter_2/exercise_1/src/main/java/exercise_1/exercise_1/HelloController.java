package exercise_1.exercise_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String greeting(@RequestParam(name = "name") String name,@RequestParam(name ="age") Integer age, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("name", name);
        return "hello";
    }
}

