package ru.DinY.springCourse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class HelloUser {
    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message","privet");
        return "hello";
    }
    @GetMapping("/calculator")
    public String calc(@RequestParam(value = "a")int a,
                       @RequestParam(value = "b")int b,
                       @RequestParam(value = "action")String action,
                       Model model){
        switch (action){
            case "multiplication": model.addAttribute("result",a*b);break;
            case "addition": model.addAttribute("result",a+b);break;
            case "subtraction": model.addAttribute("result",a-b);break;
            case "division": model.addAttribute("result",a/b);break;
            default:
                throw new IllegalStateException("Unexpected value: " + action);
        }
        return "result";
        }
    }

