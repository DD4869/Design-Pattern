
public class BananaDecorator extends Decorator{

	//show what should be decorated
	public BananaDecorator(Icecream icecream) {
		super(icecream);
	}
	
	@Override
	public String getName() {
		return "Banana" + icecream.getName();
	}
	
	@Override
	public int getCost() {//icecream+200
		return icecream.getCost() + 200;
	}	
	
}
