package Intheritence;

public class BoxWeight extends Box {
    int weight;

    
    public BoxWeight(int l,int h,int w,int weight){
        super(l,h,w);//this will class parent class(BOx.java)objects
        this.weight=weight;

    }
}
