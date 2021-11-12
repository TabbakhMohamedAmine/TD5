import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestGarage4 {

	@Test
	public void garageEquality() throws Exception_Discount {
		 Garage garage1 = new Garage();
		 Garage garage2 = new Garage();

		 Car car1 = new Car("BMW", "42abc75" , 90000);
		 Car car2 = new Car("Lada", "42abc76", 6500, 2);
		 Car car3 = new Car("Lada", "42abc76", 5500, 1);
		 Bike bike1 = new Bike("Scott");
		 Bike bike2 = new Bike("Merlin",new Discount(50));
		 Bike bike3 = new Bike("Merlin");
		 
		 garage1.add_vehicule(car1);
		 garage1.add_vehicule(bike1);
		 garage1.add_vehicule(car2);
		 garage1.add_vehicule(bike2);
		 garage1.add_vehicule(car3);        
		 garage1.add_vehicule(bike3);
		 System.out.println(garage1.String_id_vehicules());
		 garage1.trier_garage();
		 System.out.println(garage1.String_id_vehicules());
		 
		 garage2.add_vehicule(bike1);
		 garage2.add_vehicule(car1);    
		 garage2.add_vehicule(car3); 
		 garage2.add_vehicule(car2);
		 garage2.add_vehicule(bike3);
		 garage2.add_vehicule(bike2);       
		 //System.out.println(garage2.String_id_vehicules());
		 garage2.trier_garage();
		 //System.out.println(garage2.String_id_vehicules());
		 //assertEquals(garage1, garage2);
	}
}
