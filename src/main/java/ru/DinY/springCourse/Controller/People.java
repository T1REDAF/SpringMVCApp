package ru.DinY.springCourse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.DinY.springCourse.DAO.personDAO;

@Controller
@RequestMapping("/people")
public class People {
    private final personDAO personDAO;

    public People(personDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("people",personDAO.index());
        return "show";
    }
    @GetMapping("/{id}")
    public  String show(@PathVariable("id")int id ,Model model){
        model.addAttribute("person",personDAO.show(id));
        return "index";
    }


}
