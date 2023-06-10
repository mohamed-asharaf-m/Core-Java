package functional;
import java.util.function.Function;
public class func2{
	
	   public static void main(String[] args) {
	      int[] array = {1, 2, 3, 4, 5};

	      Function<Integer, Integer> square = t -> t * t;        
	      Function<Integer, Integer> cube = t -> t * t * t;

	      for(int i = 0; i < array.length; i++){
	         print(square, array[i]);
	      }        
	      for(int i = 0; i < array.length; i++){
	         print(cube, array[i]);
	      }
	   }

	   private static <T, R> void print(Function<T, R> function, T t ) {
	      System.out.println(function.apply(t));
	   }
	}
