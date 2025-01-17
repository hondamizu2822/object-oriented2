package sample;

public class Ex04 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(30);
        car.setName("エスティマ");

        System.out.println("現在のスピード: " + car.getSpeed() + "km/h");
        System.out.println("車の名前: " + car.getName());
        
    }

}
