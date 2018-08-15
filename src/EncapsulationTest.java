
class Players {
	private String captainName;

	// String[] pXI;
	public String getCaptain() {
		return captainName;
	}

	public void setCaptain(String name) {
		this.captainName = name;
	}
}

public class EncapsulationTest {
	public static void main(String[] args) {
		Players s = new Players();
		s.setCaptain("Kohli");
		System.out.println(s.getCaptain());
	}
}
