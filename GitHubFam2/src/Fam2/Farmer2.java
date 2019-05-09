
package Fam2;

import java.util.ArrayList;
public class Farmer2 {
	private String name;
	private String location;
	private int noOfAnimals;
	private ArrayList<String> animalTypes;
	
	public Farmer2( String _name, String _location, int _noOfAnimals){
		name = _name;
		location = _location;
		noOfAnimals = _noOfAnimals;
		animalTypes = new ArrayList<String>();
	}
	
	public boolean addAnimalType( String type){
		return (animalTypes.add( type ));
	}
	public String getLocation(){
		return location;
	}
	public String getName(){
		return name;
	}
	public int getNoOfAnimals(){
		return noOfAnimals;
	}
	public boolean isItAnAnimalType( String an){
		if (animalTypes.contains(an)){
			return true;
		}
		else
			return false;
	}
	
	
	@Override
	public String toString(){
		String str = "Name: " + getName() + "Location: " + getLocation() + "noOfAnimals: " + getNoOfAnimals();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer2 f = new Farmer2( "Stefan Cooray", " 4, Opel St, "
				+ " Dandenong", 35);
		System.out.println( f.toString());
		System.out.println("\n");
		f.addAnimalType("Dog");
		f.addAnimalType("Cattle");
		f.addAnimalType("Horse");
		if( f.isItAnAnimalType("Horse")){
			System.out.println("Horse, animal type");
		}
		if( f.isItAnAnimalType("Cattle")){
			System.out.println("Cattle, animal type");
		}
		if( f.isItAnAnimalType("Dog")){
			System.out.println("Dog, animal type");
		}
		Farmer2 mF = new MilkFarmer2("Sunil Cooray", "3, Bonar Crt, "
				+ "Endeavour Hills", 30, 20);
		//System.out.println( "Cost of Milk is: ", mF.costOfMilk());
		System.out.println( mF.toString());
		

	}

}