package Intheritence;

public class Main {
    public static void main(String[] args) {
        Box box =new Box();// we dint pass any args so it will tacke default constructor opt -1,-1,-1
        Box box2 =new Box(4);//it will take one arg constructor in box.java file with side arg
        BoxWeight box3 =new BoxWeight();

         Box box4=new  BoxWeight();//creating parent class (BoX) AS refernce variablre anfd with boxweight(child class)

        System.out.println(box.l + " " + box.w +" "+ box.h);
        System.out.println(box2.l + " " + box2.w +" "+ box2.h);
        System.out.println(box4.h);
         

        System.out.println(box3.weight +""+box3.h);//now the child class 
        
        
    }

}
