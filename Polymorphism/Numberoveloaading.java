package Polymorphism;
//method overloading same name of method can be there with differnt objects, return types an diff dat types
public class Numberoveloaading {
    int sum(int a,int b){
    return a+b;
      }
    //   int sum(int a,int b){ //this is same method to call same method with sum you should have diff return type or diff datat type
    // return a+b; 
    //   }


    int sum(int a,int b,int c){
    return a+b+c;
      }
     public static void main(String[] args) {
        Numberoveloaading obj =new Numberoveloaading();
        obj.sum(2,4);//if two inp given it will take first sum construct

        obj.sum(2,3,4);//if three inp given it will take second sum construct
        

     }
}
