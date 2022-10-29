package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IntroduceController {

	private final String siteName;

	public IntroduceController(final String siteName) {
		this.siteName = siteName;
	}

	@RequestMapping(value = "/introduce", method=RequestMethod.GET)
    public ModelAndView introduce() {
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("introduce");
    	mav.addObject("siteName", this.siteName);
    	return mav;
    }
}
