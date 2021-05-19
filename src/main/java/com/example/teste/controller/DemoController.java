package com.example.teste.controller;

import com.example.teste.model.Post;
import com.example.teste.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value="/posts", method=RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = demoService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}
