class ReversePrint{
    public static void main(String[] args) {
        printInReverse(10);
    }

    public static void printInReverse(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printInReverse(n-1);
    }
}