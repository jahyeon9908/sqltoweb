package com.example.co.kr.sqltoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class jsptestController {

    @GetMapping("/jsptest")
    public ModelAndView jsptest(ModelAndView model){

        List<String> nameList = new ArrayList<>();
        nameList.add("a");
        nameList.add("b");
        nameList.add("c");
        nameList.add("d");
        nameList.add("e");

        model.setViewName("result");
        model.addObject("names", nameList);
        return model;
    }
}
