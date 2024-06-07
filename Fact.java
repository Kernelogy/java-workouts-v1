class Fact {
    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n * fact(n-1); // recursive call | recursive function
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(5));        
    }
}

//A function calling in by itself

//  5 x 4 x 3 x 2 x 1