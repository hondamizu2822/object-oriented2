public class Zoo {

   
    public static void main(String[] args) {
        Animal[] animals = {
            new Sheep(),
            new Horse(),
            new Goat(),
            new Monkey(),

            
        
        };


        for (Animal animal : animals){
            animal.cry();

        }
        
        
    
        
        
    }

}
