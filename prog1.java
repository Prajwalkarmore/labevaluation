package javaprograms;

public class addition {
	int a,b;
public static void main(String[] args) {
		{
			addition c;
			c= new addition();
			c.a=10;
			c.b=22;
			
			addition c2= new addition();
			c2.a=100;
			c2.b=200;
			
			addition c3;
		    c3=c2;
			c3.a=1000;
			
			c3.b=2000;
			System.out.println(c2.a+""+c2.b);
					
		}

	}

}

