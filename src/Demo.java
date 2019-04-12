
public class Demo {

		public static void main (String args[]){
			System.out.println();
			for (int a = 1 ;  a <=100 ; a++){
				int b = 2;
				while(b < a){
					if (a % b == 0){
						break;
					}
					b++;
				}
				if(a == b){
					System.out.println(b);
				}
			}
		}
}