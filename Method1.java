/*

Method is nothing but a block of code
with statements for executing a particular logic


return_type method_name(arguments...){
    statements
    .
    .

}

For doing addition operation

int add(int a, int b){
    int sum = a+b;
    return sum;
}

contestants


 */

 class Method1{
    public static void main(String[] args) {
        Method1 m1 = new Method1();
        System.out.println(m1.add(10, 20));
        System.out.println(m1.add(10, 20, 30));
        System.out.println(m1.add(10, 20, 30, 40));
        System.out.println(m1.add(10, 20, 30,40,50));
        System.out.println(m1.add(10.01, 20.02));  
        System.out.println(m1.add(10.01, 20.02,30.03, 40.04, 50.05));      
    }
    int add(int ... a){ //Allow to pass any number of arguments
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
    double add(double ... a){ //Allow to pass any number of arguments
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
   
        // Methods having same name and different arguments is method oveloading
    // No of argumnets can be overloaded
    // Data type can be overloaded
    /*
    int add(int a, int b){
        int sum = a+b;
        return sum;   
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }

    */

 }