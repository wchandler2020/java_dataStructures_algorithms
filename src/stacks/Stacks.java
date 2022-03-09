package stacks;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		
		// stack = LIFO data structure. Last in First out.
		// 		   Stores data in a kind of vertical tower
		//		   push() to add to the top of the stack
		//		   pop() to remove from the top
		//	       peek() to see the item at the top of the stack
		//         empty() to see if the stack is empty returns true or false
		//		   search() look for a certain item in a stack, returns the position of the stack
 		Stack<String> stack = new Stack<String>();
		stack.push("Mario Brothers");
		stack.push("Donkey Kong");
		stack.push("Call of Duty");
		stack.push("Legend of Zelda");
		
		System.out.println(stack.peek());

	}

}
