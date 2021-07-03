package core.controller;

import core.data.Tusk;
import core.repos.TuskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private TuskRepo tuskRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping
    public String index(Map<String, Object> model){
        Iterable<Tusk> tusks = tuskRepo.findAll();

        model.put("tusks", tusks);

        return "index";
    }

    @PostMapping
    public String add(@RequestParam String text, @RequestParam String startTime,
                      @RequestParam String endTime, Map<String, Object> model){
        Tusk tusk = new Tusk(text,startTime,endTime);
        tuskRepo.save(tusk);

        Iterable<Tusk> tusks = tuskRepo.findAll();

        model.put("tusks", tusks);

        return "index";
    }

}