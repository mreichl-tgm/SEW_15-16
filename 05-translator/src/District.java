

/**
 * @author mreichl
 * Handles a district
 */

public class District implements Comparable<District> {
	protected int zipCode;
	protected String name;
	
	public District(int zipCode, String name) {
		this.zipCode = zipCode;
		this.name = name;
	}
	
	@Override
	public int compareTo(District d) {
		return name.compareTo(d.name);
	}
}