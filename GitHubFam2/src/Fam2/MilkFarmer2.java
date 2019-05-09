package Fam2;

public class MilkFarmer2 extends Farmer2 {
	private int cost;
	public MilkFarmer2(String _name, String _location, int _noOfAnimals,
			int cost){
		super( _name, _location, _noOfAnimals);
		this.cost = cost;
		
	}
	//@Override
	public int costOfMilk(){
		return cost;
	}
	@Override
	public String toString(){
		String str = "Name: " + getName() + " Location: " + 
	    getLocation() + " noOfAnimals: " + getNoOfAnimals() +
	    " Cost Of Milk: " + costOfMilk();
		return str;
	}

}
