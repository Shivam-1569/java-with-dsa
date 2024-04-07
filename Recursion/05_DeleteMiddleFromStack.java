import java.util.Stack;

class DeleteMiddle{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i < 6; i++) {
            st.push(i);
        }
        int n = (st.size()/2)+1;
        deleteMiddle(st, n);
        System.out.println(st);
    }

    public static void deleteMiddle(Stack<Integer> st, int n){
        if(n==1){
            st.pop();
            return;
        }
        int temp = st.pop();
        deleteMiddle(st, n-1);
        st.push(temp);
    }
}