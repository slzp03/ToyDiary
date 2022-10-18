package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller
public class ToyDiaryController {

    private final String siteName;

    public ToyDiaryController(final String siteName) {
        this.siteName = siteName;
    }


    @RequestMapping(value = "/",method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
}
