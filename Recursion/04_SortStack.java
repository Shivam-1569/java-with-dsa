import java.util.ArrayList;
import java.util.Stack;

/**
 * 04_SortStack
 */
import java.util.*;
class SortStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        sortStack(st);
        System.out.println(st);
        
    }

    public static void sortStack(Stack<Integer> stack){
        if(stack.size() == 1) return;

        int temp = stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }

    public static void insert(Stack<Integer> stack, int temp){
        if(stack.size() == 0 || stack.peek() < temp){
            stack.push(temp);
            return;
        }
        int x = stack.pop();
        insert(stack, temp);
        stack.push(x);
    }
    
}