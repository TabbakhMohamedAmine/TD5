
public class Car extends Vehicule {
	public final String model;
	
	public Car(String brand,String model, int value) {
		super(brand, value);
		this.model = model;
		// TODO Auto-generated constructor stub
	}
	public Car(String brand,String model, long value, int ves) {
		super(brand, value, ves);
		this.model= model;
		// TODO Auto-generated constructor stub
	}
	
}
