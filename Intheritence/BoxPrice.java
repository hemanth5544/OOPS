package Intheritence;

public class BoxPrice extends BoxWeight{
    int cost;
    BoxPrice(){
        super();
        this.cost=-1;

    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;


    }

}
