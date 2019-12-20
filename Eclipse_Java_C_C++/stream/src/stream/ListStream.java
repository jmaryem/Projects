package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class ListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List  <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		List <Integer> twoEvenSquares=
				numbers.stream()
				.filter(n -> {System.out.println("filtring"+n);
				return n% 2 == 0;
				})
				.map(n-> {
					System.out.println("maping" + n );
		     return n*n;
		})
				.limit(2)
				.collect(Collecters.toList());
		
				
	}

}
