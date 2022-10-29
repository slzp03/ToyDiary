package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EditController {
    private final String siteName;

    public EditController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(value = "/edit",method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("edit");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
}
