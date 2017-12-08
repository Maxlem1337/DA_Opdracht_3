package main;

public class Destination {
	private String location;
	private int postalcode;
	private String description;

	public Destination(String location, int postalcode, String description) {
		super();
		this.location = location;
		this.postalcode = postalcode;
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
