package tekup.tn.formsproject.web.controllers;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import lombok.val;
import tekup.tn.formsproject.web.models.RegisterForm;


@Controller
public class FormController {

	
	@RequestMapping( "/register" )
	public String showRegisterForm(Model model) 
	{
		model.addAttribute("registerForm",new RegisterForm());
		return "register";
	}
	
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("registerForm") RegisterForm registerForm, BindingResult bindingResult) {
		//BindingResult interface pour les gestions d'erruers
		if(bindingResult.hasErrors())
		{
			return "register";
		}
			return "redirect:home?username"+registerForm.getUsername();
			
		}
	
	@RequestMapping ("/home")
	public String Home(@RequestParam("username")String username,Model model)
	{
		model.addAttribute("username",username);
		return "home";
	}
}