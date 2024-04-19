package abstractTest1Pack;

public class XYZ extends ABC {
	
	@Override
	String DAY() {
		return "Thursday";
	}
	
	
	String DAY(String greeting) {
		return greeting + " Thursday";
	}
}