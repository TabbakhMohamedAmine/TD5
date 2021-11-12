
import java.util.ArrayList;

public class Garage  {
	ArrayList<Vehicule> mon_garage;
	public static long id = 0;
	
	public Garage() {
		this.mon_garage= new ArrayList<>();
		id++;
	}
	public void add_vehicule(Vehicule v1) {
		if(v1==null)throw new NullPointerException();
		this.mon_garage.add(v1);
	}
	public void add_car(Car c1) {
		if(c1==null) {
			throw new NullPointerException();
		}
		this.mon_garage.add(c1);
	}
	public static long get_id() {
		return id;
	}
	public StringBuilder String_Garage() {
		int compteur = 1; // "(" 
		for(Vehicule c : this.mon_garage) {
			compteur+=c.get_brand().length(); 
		}
		int number_of_vehicule = this.mon_garage.size();
		compteur += number_of_vehicule-1; // all the ';' 
		compteur++; // for the last ')'
		StringBuilder our_str = new StringBuilder(compteur);
		our_str.append("(");
		int indicateur_last_vehicule = 0;
		for(Vehicule c : this.mon_garage) {
			indicateur_last_vehicule++;
			if(indicateur_last_vehicule==number_of_vehicule) {
				our_str.append(c.get_brand());
				break;
			}
			our_str.append(c.get_brand()+';'); 
		}
		our_str.append(")");
		/*System.out.println(our_str.toString()); if >> capacity /-> capacity = 48
		System.out.println(our_str.length());
		System.out.println(our_str.capacity());
		our_str.append("test");
		System.out.println(our_str.length()); //
		System.out.println(our_str.capacity()); */
		return our_str;
	}
	public int number_of_vehicule() {
		return this.mon_garage.size();
	}
	public Vehicule firstCarbyBrand(String brand) throws Exception_no_car {
		for(Vehicule c : this.mon_garage) {
			if(c.get_brand()==brand)return c;
		}
		throw new Exception_no_car();
	}
	public void protectionism(String brand) {
		for (Vehicule v1 : this.mon_garage) {
			if(v1.get_brand()==brand) {
				this.mon_garage.remove(v1);
			}
		}
	}
	public void trier_garage() {
		int number_of_vehicule = Vehicule.get_number_of_vehicule(); 
		ArrayList<Vehicule> mon_garage_trie = new ArrayList<>() ;
		for(int i=1 ; i<= number_of_vehicule; i++) {
			for(Vehicule v1 : this.mon_garage) {
				if(v1.get_id_vehicule()==i) {
					mon_garage_trie.add(v1);
				}
			}
		}
		this.mon_garage= mon_garage_trie;
	}
	public String String_id_vehicules() {
		String our_str = "(";
		int number_of_vehicule = Vehicule.get_number_of_vehicule(); 
		for(Vehicule v1 : this.mon_garage) {
			if(v1.get_id_vehicule()==number_of_vehicule) {
				our_str+=v1.get_id_vehicule()+")";
				break;
			}
			our_str+=v1.get_id_vehicule()+";";
		}
		return our_str;
	}
}
