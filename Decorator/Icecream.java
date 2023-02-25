
public abstract class Icecream {

	public abstract String getName();//abstract Name
	public abstract int getCost();//abstract Cost
	
	public void show() {//Name and Cost
		System.out.println(getName() + ":" + getCost() + "yen");
	}
}
