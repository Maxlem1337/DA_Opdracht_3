package main;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DestinationController {
	private final DestinationService service = new DestinationService();
	
	@RequestMapping(method = RequestMethod.GET)
	public List getDestinationAll(){
		return service.getAll();
	}
}
