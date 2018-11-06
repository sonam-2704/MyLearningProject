import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author Sonam_Mittal
 *
 */
public class DemoForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		List<Integer> values = Arrays.asList(4,5,6,7,8,9);
		
	/*	values.forEach(i-> System.out.println(i));
		
		values.forEach(i-> System.out.println(i));
		
		values.forEach(System.out::println);
		*/
		
		
		
		/*List<String> names = Arrays.asList("Ankit","Sarika","Sunita","Hans","Shivika");
		
		names.stream().filter(x->x.startsWith("S")).sorted().findFirst().ifPresent(System.out::println);

		names.stream().filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
		
		Arrays.stream(new int[] {2,4,6,8,10}).average().ifPresent(System.out::println);
		
		Arrays.stream(new int[] {2,4,6,8,10}).sorted().filter(x->x>5).forEach(System.out::println);
		
		
		int result = Arrays.stream(new int[] {2,4,6,8,10}).reduce(0,(int a,int b)->a+b);
		System.out.println(result);
		names.stream().map(x-> x.toLowerCase()).forEach(System.out::println);*/
		
		try {
			List <String> stringList = Files.lines(Paths.get("./test.txt")).collect(Collectors.toList());
			System.out.println(stringList.get(stringList.size()-3));
			System.out.println(stringList.get(stringList.size()-2));
			System.out.println(stringList.get(stringList.size()-1));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
