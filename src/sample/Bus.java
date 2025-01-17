package sample;

public class Bus extends Car {
    
    public static void main(String[] args) {
            Bus bus = new Bus();
    
            bus.speed = 0;
            bus.name = "タクシー仕様のプリウス";
    
            bus.stepOnAccele();
            bus.stepOnAccele();
            bus.stepOnBrake();
    
            System.out.println("現在の速度は" + bus.speed + "km/hです");
    }

    int price;

    public void payment(){
        System.out.println("料金を" + price + "円支払いました");
        price = 0;
    }


    @Override
    public void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードは" + speed + "km/hです");
        //super.stepOnAccele();

        price = price + 30;

        System.out.println("料金は" + price + "円です");
    
    }


}
