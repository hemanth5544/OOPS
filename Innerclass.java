public class Innerclass {
    static class Test{//class inner
        String name;
     public Test(String name){//constructor of test class
        this.name= name;
     }
    }
    public static void main(String[] args) {
        Test a =new Test("heamnth");
        Test b=new Test("heath");
        System.out.println(a.name);
        System.out.println(b.name);
    
    }
    }




    

    
    

