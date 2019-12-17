package ch.bbw.vegvisir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.bbw.vegvisir.model.MathInputs;
import ch.bbw.vegvisir.model.MathOperations;

@Controller
public class VegvisirController {
	private MathInputs inputs;
	
	@GetMapping("/")
	public String getIndexRoot(Model model) {
		inputs = new MathInputs();
		model.addAttribute("inputs", inputs);
		return "index";
	}
	
	@GetMapping("/index")
	public String getIndex(Model model) {
		inputs = new MathInputs();
		model.addAttribute("inputs", inputs);
		return "index";
	}
	
	@PostMapping("/index")
	public String postIndex(Model model, @ModelAttribute MathInputs inputs) {
		this.inputs = inputs;
		return "redirect:calculations";
	}
	
	@GetMapping("calculations")
	public String getCalc(Model model) {
		model.addAttribute("inputs", inputs);
		return "calculations";
	}
	
	@GetMapping("calculations/calc")
	public String doCalc(Model model) {
		MathOperations.calcValues(inputs);
		model.addAttribute("inputs", inputs);
		return "redirect:../calculations";
	}
}