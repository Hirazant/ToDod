package core.controller;

import core.data.Tusk;
import core.data.User;
import core.repos.TuskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private TuskRepo tuskRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){
        return "greeting";
    }

    @GetMapping("/main")
    public String index(Map<String, Object> model){
        Iterable<Tusk> tusks = tuskRepo.findAll();

        model.put("tusks", tusks);

        return "main";
    }

    @PostMapping("/add")
    public String add(@AuthenticationPrincipal User user,
                    @RequestParam String text, @RequestParam String startTime,
                      @RequestParam String endTime, Map<String, Object> model){
        Tusk tusk = new Tusk(text,startTime,endTime, user);
        tuskRepo.save(tusk);

        Iterable<Tusk> tusks = tuskRepo.findAll();

        model.put("tusks", tusks);

        return "main";
    }

}