package org.nanshan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author zhang
 * @Date 2017/8/19 1:06
 * @Content
 */
@Controller
public class IndexController {
	@RequestMapping(value="/",method=RequestMethod.GET)
    public String showIndex(HttpServletRequest request,Model model) {
	    String phone = (String) request.getSession().getAttribute("user");
        model.addAttribute("username",phone);
	    return "index";
    }

}
