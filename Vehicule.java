
public class Vehicule {
	private final String brand;
	private final long value;
	private final int level_of_vetuste;
	private boolean discount;
	public static int number_of_vehicule = 0;
	public final int id_vehicule;
	
	public Vehicule(String brand) {
		this.brand = brand;
		this.value = 0;
		this.level_of_vetuste=0;
		this.discount=false;
		number_of_vehicule++;
		id_vehicule=number_of_vehicule;
	}
	public Vehicule(String brand, long value) {
		if(value <0) {
			throw new IllegalArgumentException();
		}
		this.brand = brand;
		this.value = value;
		this.level_of_vetuste=0;
		this.discount = false;
		number_of_vehicule++;
		id_vehicule=number_of_vehicule;
	}
	
	public void discount_on() {
		this.discount=true;
	}
	public Vehicule(String brand, long value, int level_of_vetuste) {
		long val  = value - 1000*level_of_vetuste;
		if(value <0 || level_of_vetuste <0 || val < 0 ) {
			throw new IllegalArgumentException();
		}
		this.brand = brand;
		this.value = val;
		this.level_of_vetuste = level_of_vetuste;
		this.discount = false;
		number_of_vehicule++;
		id_vehicule=number_of_vehicule;
	}
	public int get_id_vehicule() {
		return this.id_vehicule;
	}
	public String get_brand() {
		return this.brand;
	}
	public long get_value() {
		return this.value;
	}
	public boolean equals2(Object c) {
		if (c==this)return true;
		if(!(c instanceof Vehicule))return false;
		Vehicule var = (Vehicule) c;
		return (var.brand==this.brand && var.value==this.value && var.level_of_vetuste==this.level_of_vetuste);
	}
	public static int get_number_of_vehicule() {
		return number_of_vehicule;
	}
}
