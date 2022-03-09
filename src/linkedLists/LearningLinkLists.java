package linkedLists;
import java.util.*;

public class LearningLinkLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> brands = new LinkedList<String>();
		brands.offer("Mecedes");
		brands.offer("Lexus");
		brands.offer("Audi");
		brands.offer("BMW");
		brands.add(2, "LandRover");
		brands.remove("Lexus");

		System.out.println(brands);
		System.out.println(brands.peekFirst());
		System.out.println(brands.peekLast());
		System.out.println(brands.peekFirst());
	}

}
