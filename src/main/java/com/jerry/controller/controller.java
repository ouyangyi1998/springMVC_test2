package com.jerry.controller;

import domin.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller()
@RequestMapping("/user")
public class controller {
    @RequestMapping("/testString")
    public String testString(Model model, HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println("fjsdi");
        user user=new user();
        user.setAge(12);
        user.setPassword("1234");
        user.setUsername("赵敏");
        model.addAttribute("user",user);
        try {
            request.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testMV()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/testAjax")
    public @ResponseBody user testAjax(@RequestBody user user)
    {
       System.out.println(user);
        user.setUsername("hhh");
        user.setAge(40);
        return user;
    }
}
