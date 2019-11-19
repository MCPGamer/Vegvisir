package ch.bbw.vegvisir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ch.bbw.vegvisir.model.MathInputs;

@Controller
public class VegvisirController {
	private MathInputs inputs;
	
	@GetMapping("/")
	public String index(Model model) {
		inputs = new MathInputs();
		model.addAttribute("inputs", inputs);
		return "index";
	}
}