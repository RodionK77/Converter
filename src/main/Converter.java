package main;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Converter {

    private Scanner scanner = new Scanner(System.in);

    HashMap<Integer, Double> based, oldRussianLength, americanLength;

    public Converter(){

    }
    public void start(){
        System.out.println("Из какой системы хотите перевести?\n" +
                "1 - сантиметры\n2 - метры\n3 - километры\n4 - старорусская система\n5 - американская система");
        //int number1
        System.out.println("В какую систему хотите перевести?\n" +
                "1 - сантиметры\n2 - метры\n3 - километры\n4 - старорусская система\n5 - американская система");
        //int number2
        System.out.println("Введите число для перевода:");
        //Double number

    }

    public double getValue(int n){

    }
    public Double convert(int n, double number, double mult){
        Double value = getValue(n);
        Double result = number * value * mult;
        return result;
    }
}
