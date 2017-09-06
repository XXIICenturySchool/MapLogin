package com.db.xxii_century_school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Random;


@Controller
@RequestMapping("/maplogin")
public class UIController {
    private Random random;
    @RequestMapping("/sign/up")
    public  String signup(ModelMap modelMap){
        return "signup";
    }



    /*

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        return "hello";
    }  @GetMapping("/hello/exam")
    public String handle() {
        return "OK";
    }
*/
  
    @GetMapping("/signup")
    public String signUp(ModelMap modelMap){
        random = new Random();
        int id = random.nextInt(100);
        modelMap.addAttribute(id);
        return "signup";
    }




}