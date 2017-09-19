package com.hellocontroller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class HelloController extends AbstractController{
 // class accepts the request send by the front controller after
 // the front controller determined that the url pattern request by
 // the client should go to this java class controller
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
        HttpServletResponse response) throws Exception {
    	System.out.println("hello pg route");
        ModelAndView modelandview = new ModelAndView("HelloPage");
        modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
        return modelandview;
    }
}