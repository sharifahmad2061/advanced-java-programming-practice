//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// test with variable args
		
		String v1 = "hello";
		String v2 = "there";
		String v3 = "how";
		varargsmethod(v1, v2, v3);
		//test with multiple literal args
		varargsmethod("are", "you", "good night");
	}
	
	public static void varargsmethod(String...strings) {
		Integer i = 0;
		while (i < strings.length) {
			System.out.println("item "+ Integer.toString(i) + " " + strings[i]);
			i++;
		}
	}

}
