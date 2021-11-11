import java.util.ArrayList;

import java.util.Objects;
import java.util.Collections;


public class Garage {

	private ArrayList <Vehicule> vehicules= new ArrayList();
	
	private static int id;
	
	public Garage() {
		id++;
	}
	
	public void add(Vehicule c) {
		c= Objects.requireNonNull(c);
		this.vehicules.add(c);
		 Collections.sort(vehicules, c.ComparatorMarque);
	}
	public int getId() {
		return id;
	}
	public ArrayList<Vehicule> getVehicules() {
		return vehicules;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Garage d'id: ");
		sb.append(this.id);
		sb.append("ayant les voitures :");
		sb.append(this.vehicules);
		
		return sb.toString();
	}
	
	public long contains(Garage g) {
		int somme=0 ;
		for(int i=0; i<g.vehicules.size();i++) {
			somme+=g.vehicules.get(i).getValue();
			
		}
		return somme;
		
	}
	
	public Vehicule firstCarByBrand (String brand) {
		
		for(int i=0; i<vehicules.size();i++) {
			if(vehicules.get(i).getBrand().equals(brand)) {
				return vehicules.get(i);
			}
			
		}
		return null; 
	}
	
	public void remove(Vehicule c) {
		
		for(int i=0; i<vehicules.size();i++) {
			if(vehicules.get(i).equals(c)) {
				this.vehicules.remove(this.vehicules.get(i));
				return;
			}
		}
		throw new IllegalStateException("véhicule n'existe pas dans le garage");
	}
	
	void protectionism(String brand) {
		/**
		 * Ce code est faux, voir le code en dessous
		 * for (int i=0; i<vehicules.size(); i++) {
			if (vehicules.get(i).getBrand().equals(brand))
				this.vehicules.remove(i);
			    
		}**/
		
		ArrayList<Vehicule> deleteVehicules=new ArrayList();
		
		for (Vehicule v: vehicules) {
			if (v.getBrand().equals(brand))
				deleteVehicules.add(v);
		}
		for (Vehicule deletev: deleteVehicules) {
			vehicules.remove(deletev);
		}
	}
	public boolean equals(Garage g) {
		return this.vehicules.equals(g.vehicules);
	}
}


//Pour exercice 1 et 2 :
/**
public class Garage {

	private ArrayList <Car> cars= new ArrayList();
	
	private static int id;
	
	public Garage() {
		id++;
	}
	
	public void add(Car c) {
		c= Objects.requireNonNull(c);
		this.cars.add(c);
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Garage d'id: ");
		sb.append(this.id);
		sb.append("ayant les voitures :");
		sb.append(this.cars);
		
		return sb.toString();
	}
	
	public long contains(Garage g) {
		int somme=0 ;
		for(int i=0; i<g.cars.size();i++) {
			somme+=g.cars.get(i).getValue();
			
		}
		return somme;
		
	}
	
	public Car firstCarByBrand (String brand) {
		
		for(int i=0; i<cars.size();i++) {
			if(cars.get(i).getBrand().equals(brand)) {
				return cars.get(i);
			}
			
		}
		return null; 
	}
	
	public void remove(Car c) {
		
		for(int i=0; i<cars.size();i++) {
			if(cars.get(i).equals(c)) {
				this.cars.remove(this.cars.get(i));
				
			}
		}
		throw new IllegalStateException("car n'existe pas dans le garage");
	}
	
}
***/
