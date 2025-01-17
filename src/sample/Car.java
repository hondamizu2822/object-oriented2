package sample;

public class Car {

    private int speed;
    private String name;
    private boolean flg;
    
    

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlg() {//is になってる！！
        return flg;
    }

    public void setFlg(boolean flg) {
        this.flg = flg;
    }

    public int getSpeed(){
        return speed;

    }

    public void detSPeed(int speed){
        this.speed = speed;

    }

     public Car(){

    }

    public Car(int speed, String name){
        this.speed = speed;
        this.name = name;

    }

    public void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");

    }

    public void stepOnBreake(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }

}
