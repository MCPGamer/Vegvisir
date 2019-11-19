package ch.bbw.vegvisir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.bbw.vegvisir.model.MathInputs;

@Controller
public class VegvisirController {
	private MathInputs inputs;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		inputs = new MathInputs();
		model.addAttribute("inputs", inputs);
		return "index";
	}
	
	@PostMapping("/")
	public String postIndex(Model model, @ModelAttribute MathInputs inputs) {
		this.inputs = inputs;
		model.addAttribute("inputs", inputs);
		return "redirect:../calculations";
	}
	
	@GetMapping("/calc")
	public String getCalc(Model model) {
		model.addAttribute("inputs", inputs);
		return "calculations";
	}
}