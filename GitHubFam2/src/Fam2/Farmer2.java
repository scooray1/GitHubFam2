
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
	}
	
	public void addAnimalType( String type){
		animalTypes.add( type );
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
	
	
	@Override
	public String toString(){
		String str = "Name: " + getName() + "Location: " + getLocation() + "noOfAnimals: " + getNoOfAnimals();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer2 f = new Farmer2( "Stefan Cooray", "4, Opel St, Dandenong", 35);
		System.out.println( f.toString());

	}

}