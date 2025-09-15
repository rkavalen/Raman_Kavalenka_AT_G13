package Day0;

import java.util.Scanner;

public class Car {

    String Model;

    float weght;

    int speed;

    String ownerName;

    public void showSpeed() {
        System.out.println(this.speed);
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
        showSpeed();
        newSpeed = 8;
        speed = 3;
        setSetSpeed(newSpeed);
    }

    public void setSetSpeed(int speed){
        speed = speed;
        this.speed = speed;
    }
    public void getOwnerName(){
        System.out.print("Enter your name");
        Scanner scanner = new Scanner(System.in);
        ownerName = scanner.nextLine();
    }
}
