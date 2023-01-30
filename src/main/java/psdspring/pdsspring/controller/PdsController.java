package psdspring.pdsspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PdsController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name , Model model) {
        model.addAttribute("name" , name);
        return "hello-thymeleaf";
    }

    @GetMapping("hello-spring")
    @ResponseBody
    public String helloString(@RequestParam("name") String name ) {

        return "hello" + name; //"hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Pds pdsString(@RequestParam("name") String name) {
        Pds pds = new Pds();
        pds.setName(name);
        return pds;
    }

    static class Pds {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}

