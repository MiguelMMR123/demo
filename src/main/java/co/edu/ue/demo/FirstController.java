package co.edu.ue.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstController {
	@GetMapping("saludo")
	public String Saludo() {
		return "Prueba";
	}
	
	@GetMapping(value="suma/{number1}/{number2}")
		public double sumar(@PathVariable("number1") double num1, @PathVariable("number2") double num2){
		return num1 + num2;
	}

	@GetMapping("/restar")
		public double restar(@RequestParam double num1, @RequestParam double num2){	
		return num1 - num2;
	}

	@GetMapping("/multiplicar")
		public double multiplicar(@RequestParam double num1, @RequestParam double num2){	
		return num1 * num2;
	}

	@GetMapping("/dividir")
		public double dividir(@RequestParam double num1, @RequestParam double num2){	
		return num1 / num2;
	}

	@GetMapping("/potencia")
		public double potencia(@RequestParam double num1, @RequestParam double num2){	
		return Math.pow(num1, num2);
	}

	@GetMapping("/raiz")
		public double raiz(@RequestParam double num1){	
		return Math.sqrt(num1);
	}
}