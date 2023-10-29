package sakthi;


 import java.util.Arrays;
	import java.util.List;

	public class Average {	
			public static void main(String[] args) {
		        
		        List<Double> doubleList = Arrays.asList(2.2, 3.6, 10.5, 0.45, 1.5, -8.7);

		        double average = calculateAverage(doubleList);
		        
		        System.out.println("List of Doubles : " + doubleList);
		        System.out.println("Average calulated : " + average);
		    }

		    private static double calculateAverage(List<Double> list) {
		        
		        return list.stream()
		                .mapToDouble(Double::doubleValue)
		                .average()
		                .orElse(0.0);

		}

	}
