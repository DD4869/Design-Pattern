
public class NutsDecorator extends Decorator{
	
	//show what should be decorated
	public NutsDecorator(Icecream icecream) {
		super(icecream);
	}
	
	@Override
	public String getName() {
		return "Nuts" + icecream.getName();
	}
	
	@Override
	public int getCost() {//icecream + 100
		return icecream.getCost() + 100;
	}	
	
}
