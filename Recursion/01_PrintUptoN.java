class Print{
    public static void main(String[] args){
        print(7);
    }

    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

}