package Marathon;

import java.util.Arrays;   


public class Marathon {

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
        
        int fastest_time = find_fastest_time(times);
        int second_fastest = find_second_fastest_time(times);
        for (int i = 0; i < names.length; i++) {
            if (times[i] == fastest_time) {
            System.out.println("The fastest runner is " + names[i] + " with " + times[i]);
            }
            if (times[i] == second_fastest) {
            	System.out.println("The second fastest runner is " + names[i] + " with " + times[i]);
      }
    }
  }     
    
    public static int find_fastest_time(int[] times) {
    	int fastest_time = 0;
    	Arrays.sort(times);
    	for (int i = 0; i < times.length; i++) {
    		fastest_time = times[0];
    	}
    	return fastest_time;
    }
    
    public static int find_second_fastest_time(int[] times) {
    	int second_fastest = 0;
    	Arrays.sort(times);
    	for (int i = 0; i < times.length; i++) {
    		second_fastest = times[1];
    	}
    	return second_fastest;
    }
    	
}
