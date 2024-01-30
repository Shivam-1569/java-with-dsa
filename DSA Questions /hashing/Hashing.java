/**
 * Hashing
 */
public class Hashing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,3,4,3,5,6};
        HashMap<Integer, Integer> op = new HashMap<>();
        for(int num: arr){
            if(op.containsKey(num)){
                op.put(num, op.get(num)+1);
            }else{
                op.put(num, 1);
            }
        }
    }
}
