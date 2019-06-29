import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class LambdaExpressions {
    
	public LambdaExpressions(){ }

 	private void getListUsingWhile(List<String> inputList) {
        	Iterator<String> iterator = inputList.iterator();
       		while (iterator.hasNext()) {
        		System.out.println(iterator.next());
        	}
	}

	private void getListUsingForeach1(List<String> inputList) {
		inputList.forEach(stringListValue -> System.out.println(stringListValue));
	}

	private void getListUsingForeach2(List<String> inputList){
        	inputList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("String1","String2","String3");
    		LambdaExpressions lambdaExpressions = new LambdaExpressions();
		// Lots of code very readable (Beginners)        
       		lambdaExpressions.getListUsingWhile(stringList);
        	// Not much code and readable (Intermediate).
        	lambdaExpressions.getListUsingForeach1(stringList);
        	// Less code and not readable (Advanced).
        	lambdaExpressions.getListUsingForeach2(stringList);
	}
}

