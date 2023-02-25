
public abstract class Decorator extends Icecream{
	
	//Give icecream
	protected Icecream icecream;
	
	//Icecream has-a
	protected Decorator(Icecream icecream) {
		this.icecream = icecream;
	}
}
