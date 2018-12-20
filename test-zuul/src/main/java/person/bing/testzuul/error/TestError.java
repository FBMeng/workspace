package person.bing.testzuul.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestError {
	@RequestMapping("/e")
	public String toError(){
		return "发生故障";
	}
}
