package net.sagon.agilecoach.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResourceController {

    @RequestMapping(value="/resource", method=RequestMethod.GET)
    public String getResource(ModelMap model, HttpServletRequest request) {
        return "resource";
    }

}
