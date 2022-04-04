package pl.example.discoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class DiscoveryServiceApplication {

//	@Value("${service.instance.name}")
//	private String instance;

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
//
//	@RequestMapping("/")
//	public String message(){
//		return "Hello from " + instance;
//	}

	@RequestMapping("/")
	public String defaultMsg(){
		return "Default message...";
	}

}
