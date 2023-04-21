package com.BikkadIT.ControllerToUI.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {
	
	@GetMapping("/welmsg")
	public ModelAndView welcomeMessage()
	{
		String msg ="Welcome to India";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("wel");	
		return mav;
		
	}
}



