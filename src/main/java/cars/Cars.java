package cars;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    public static List<CarModel> models() {
        return scala.collection.JavaConversions.asJavaList(package$.MODULE$.models());
    }
    
    public static void main(String ... args) {
    	Set<Integer> years = new HashSet<>();
    	for (CarModel car : models()) {
    		years.add(car.year());
    	}
    	System.out.println(years);
    }
}
