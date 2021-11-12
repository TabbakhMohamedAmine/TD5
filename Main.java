import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Car c1 = new Car("Mercedes",44343);
		Car c2 = new Car("Mercedes",234);
		Car c3 = new Car("BMW",21);
		Garage g1 = new Garage();
		g1.add_car(c1);
		g1.add_car(c2);
		g1.add_car(c3);
		System.out.println(g1.String_Garage().toString());*/
		/*System.out.println(a==b);  // False | After equals overwrite False 
		System.out.println(b==c);  // False | False
		System.out.println(a==d);  // True | True
		System.out.println(a.equals(b));  //False | False
		System.out.println(b.equals(c)); // False | True
		System.out.println(a.equals(d)); // True | True 
		ArrayList<Car> list = new ArrayList<Car>(); 
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a)); // 0 with good equals overwrite and 0 without
		System.out.println(list.indexOf(b));  // 1 and 1
		System.out.println(list.indexOf(c));  // 1  and -1 with == 
		System.out.println(b.equals(c)); // indexOf use equals, true with good equals overwrite and false with == 
		HashSet<Car> set = new HashSet<Car>(); 
		set.add(b); 
		System.out.println(set.contains(c)); // False with == and True with equals overwrite */
		Car car1 = new Car("BMW", "42abc75" , 90000);
		Car car2 = new Car("Lada", "42abc76", 6500, 2);
		Car car3 = new Car("Lada", "42abc76", 5500, 1);
		Garage garage1 = new Garage();
		garage1.add_vehicule(car2);
		garage1.add_vehicule(car1);
		garage1.add_vehicule(car3);
		System.out.println(garage1.String_id_vehicules());
		garage1.trier_garage();
		System.out.println(garage1.String_id_vehicules());

	}

}
