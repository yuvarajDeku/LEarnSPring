package com.yuvarajlearning.learnspringframe.sample.enterprise.flow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private BusinesService businessService;
 @GetMapping("/sum")
 public long display() {
	 return businessService.ReturnCalculator();
 }
}


//Business LOgic
class BusinesService{
	public long ReturnCalculator() {
		return 145;
	}
}


//Getting Data
class DataService{
	
}







/*Sending response in the right format
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;
	
	//"/sum" => 100
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}*/