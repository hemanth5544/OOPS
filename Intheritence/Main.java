package Intheritence;

public class Main {
    public static void main(String[] args) {
        Box box =new Box();// we dint pass any args so it will tacke default constructor opt -1,-1,-1
        Box box2 =new Box(4);//it will take one arg constructor in box.java file with side arg
        System.out.println(box.l + " " + box.w +" "+ box.h);
        System.out.println(box2.l + " " + box2.w +" "+ box2.h);


        BoxWeight box3 =new BoxWeight();
        System.out.println(box3.weight +""+box3.h);//now the child class 
        
    }

}
