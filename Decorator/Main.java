
public class Main {
	public static void main(String[] args) {
		
		//Makeicecream
		//Matcha
		Icecream im1 = new MatchaIce();
		Icecream im2 = new BananaDecorator(im1);
		Icecream im3 = new NutsDecorator(im1);
		Icecream im4 = new BananaDecorator(new NutsDecorator(new MatchaIce()));
		Icecream im5 = new DoubleMatchaDecorator(im1);
		im1.show();
		im2.show();
		im3.show();
		im4.show();
		im5.show();
		
		System.out.println("--------------------------------------------");
		
		//Vanilla
		Icecream iv1 = new VanillaIce();
		Icecream iv2 = new BananaDecorator(im1);
		Icecream iv3 = new NutsDecorator(im1);
		Icecream iv4 = new BananaDecorator(new NutsDecorator(new VanillaIce()));
		iv1.show();
		iv2.show();
		iv3.show();
		iv4.show();
		
		
	}

}
