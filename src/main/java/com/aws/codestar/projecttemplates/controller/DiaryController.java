package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
    private final String siteName;

    public DiaryController(final String siteName) {
        this.siteName = siteName;
    }

    @RequestMapping(value = "/diary",method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("diary");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
}
