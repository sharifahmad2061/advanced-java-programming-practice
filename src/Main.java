//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names = new ArrayList();
		names.add("kelly");
		String name = (String) names.get(0);
		System.out.println(name);
		names.add(2);
		
		List<String> names2 = new ArrayList<String>();
		names2.add("nelly");
		String name2 = names2.get(0);
		System.out.println(name2);
	}
	
	public void varargsmethod(String...strings) {
		Integer i = 0;
		while (i<=strings.length) {
			System.out.println("item "+ Integer.toString(i) + " " + strings[i]);
			i++;
		}
	}

}
