package in.co.kavya.FirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	
	@GetMapping("/")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "hello hello"+name;
	}

}
