
public class Discount {
	private final long value;
	public Discount(long value) throws Exception_Discount {
		if(value<0) throw new Exception_Discount();
		this.value=value;
	}
	public long get_value() {
		return this.value;
	}
}
