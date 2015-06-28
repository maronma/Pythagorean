package pythagorean;

public class Main {
public static void main(String[] args) {
	Pythagorean p = new Pythagorean();	
	p.findValueOfThreeSidesOfTriangle();
	System.out.println(p.toString());
	System.out.println( "Suma powyzszych cyfr wynosi: "+p.findValueOfThreeSidesOfTriangle());
	
}
}
