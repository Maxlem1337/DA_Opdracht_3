package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DestinationService {
	private ArrayList<Destination> list = new ArrayList<Destination>();
	
	public DestinationService(){
		list.add(new Destination("Keerbergen", 3140, "Keerbergen description"));
		list.add(new Destination("Leuven", 3000, "Leuven description"));
	}
	
	public List<Destination> getAll(){
		return list;
	}

}
