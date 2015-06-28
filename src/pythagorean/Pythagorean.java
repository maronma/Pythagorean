package pythagorean;

public class Pythagorean {
	int a;
	int b;
	int c;
	int totalLength=1000;
	int  suma=0;
    public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	
	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}
	
	
	public  int findValueOfThreeSidesOfTriangle(){
		int a;
		for (a = 1; a <= totalLength/3; a++)
        {
            int b;
            for (b = a + 1; b <= totalLength/2; b++)
            {
                int c = totalLength - a - b;
                if (  (a*a + b*b == c*c) && c > 0) {   	
//                 System.out.print("a= "+a+", b= "+b+", c= "+c+"");                
                    suma=a+b+c;                   
                    setA(a);
                    setB(b);
                    setC(c);
                }                    
            }            
        }		
        return suma;
	}	
	
	
	@Override
	public String toString(){
		return "Wartosc bokow a: " +a+" b: "+b+" c: "+c;
	}
	}	

