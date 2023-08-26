public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
       

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];


        //declaring the student class 
        Student hemanth=new Student(22,"rach",8.6f);
        Student kunal=new Student(55,"kUSHWA",55.4f);
        
        // hemanth.name="rachapalli";
        // hemanth.rno=55;
        
        
        System.out.println(kunal.rno);
        System.out.println(hemanth.rno);
        System.out.println(hemanth.name);
        System.out.println(hemanth.marks);

    }
}


        class Student {
            int rno;
            String name;
            float marks=90;
            //default constructor--> specifices what in class and how should it pass 
            Student(){
                this.rno=12;
                this.name="heamnth";
                this.marks=95.4f;

            }
            // pass by value eeN
            Student(int roll,String naam,float marks)
            {
                this.rno=roll;
                this.name=naam;
                this.marks=marks;
                
            }

            
        }