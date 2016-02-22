package ua.artcode.week1;

import java.util.Scanner;
// class -> container for metods
public class ShopApp {
    // getMyMoney -> get_my_money -> Java Code Convetion

    // method -> squence of operations
    // structure -> name, in data, out data
    // actions over method -> call method 

    // main method - start point 
    public static void main(String[] args) {
        // create variable = create scanner (tell scanner about console)
        Scanner sc = new Scanner(System.in);


        System.out.println("input time");
        int time = sc.nextInt(); // waiting for your input
        System.out.println("input money");
        double money = sc.nextDouble();
        System.out.println("input name");
        String name = sc.next();
        System.out.println("input energy");
        boolean energy = sc.nextBoolean();

        System.out.println("input product name");
        String productName = sc.next();
        System.out.println("input product price");
        double productPrice = sc.nextInt();


        boolean timeLogicRes = !(time >= 24 && time < 8);
        boolean moneyLogicRes = money >= productPrice;


        boolean finalRes = timeLogicRes && moneyLogicRes
                && energy;

        // Referene type(Complex type)           
        String resultMessage = "Did you buy " + productName + " price "
                + productPrice + "?\n" + finalRes;

        System.out.println(resultMessage);

    }


    public static void go(){
    }
}
