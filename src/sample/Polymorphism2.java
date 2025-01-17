package sample;

public class Polymorphism2 {
    public static void main(String[] args) {
        TV2 tv2 = new TV2();
        PC pc = new PC();
        use(tv2);
      
        use(pc);
    
    
    }

    public static void use(Electrical ele){
        ele.power();


    }

}    
