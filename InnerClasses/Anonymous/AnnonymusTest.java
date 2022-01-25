package annoyinner;

public class AnnonymusTest {  // By this anonymous class we do not need to implement class can call directly here

	public static void main(String[] args) {
		 Car c=new Car() //interface object
		 {
	            
	            @Override
	            public void stop() {
	                System.out.println("car started from anonymous class");
	                
	            }
	            
	            @Override
	            public void start() {
	                System.out.println("Car stopped from anonymous class");
	                
	            }
	        };
	        
	        c.start();
	        c.stop();
	}

}
