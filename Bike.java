
public class Bike extends Vehicule{
	
	public Bike(String Brand,int value) {
		super(Brand,value,0);
	}
	public Bike(String Brand) {
		super(Brand);
	}
	public Bike(String Brand, Discount disc) {
		super(Brand, disc.get_value());
	}
}
