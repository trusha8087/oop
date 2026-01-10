//  Write a Java program that accepts two numbers as command-line arguments. Convert these 
// arguments to appropriate numeric types (e.g., int or double), perform a simple calculation 
// (e.g., sum or product), and print the result to the console. 


 class P8 {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please provide two value for command line");

        }else if(args.length == 2){
            double num1 = Double.parseDouble(args [0]);
            double num2 = Double.parseDouble(args [1]);

            double sum = (num1 + num2);
            System.out.printf("the sum of %.2f + %.2f : %.2f" , num1 , num2, sum );
        }else{
            System.out.println("Invalid value!! Please try again!");
        }
        
    }
    
}
