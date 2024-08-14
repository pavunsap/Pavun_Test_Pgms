package methodOverLoadingAndOverRiding;

public class MethodOverloading {

		public void Cat() {
			
			System.out.println("Cat speaking with Meow Sound");
		}

		public void Cat(int num) {
			
			for(int i=0; i<num;i++) {
				
				System.out.println("Meow");
			}
		}
}
