package fan.core.util.demo.model;

public class Foobar {

	private int bar;
	private String baz;
	private static double version;

	@Override
	public String toString() {
		return bar + "  " + baz + "  [" + version + "]";
	}
	
}