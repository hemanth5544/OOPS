//sattic means it can run with out any object creation as static variable
//static is used in memory managemnt of commman data to save memory



public class Human {
    
    
        public static void main(String[] args) {
            greeting();//sattic funcs can be called only in main
            fun();
              int age;
              int salary;
             boolean married;
           
            System.out.println();
            
        }
        

    
    static void greeting(){
        System.out.println("this is me");
    }
     static void fun(){
        greeting();
    }
}
    