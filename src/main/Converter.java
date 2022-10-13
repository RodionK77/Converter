package main;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Converter {

    private Scanner scanner = new Scanner(System.in);;

    HashMap<Integer, Double> based;
    HashMap<Integer, Double> oldRussianLength;
    HashMap<Integer, Double> americanLength;

    public Converter() {
        based = new HashMap<>();
        based.put(1, 1.0); // см
        based.put(2, 100.0); // м
        based.put(3, 100000.0); // км

        oldRussianLength = new HashMap<>();
        oldRussianLength.put(1, 106680.0); // Верста
        oldRussianLength.put(2, 213.36); // Сажень
        oldRussianLength.put(3, 71.12); // Аршин
        oldRussianLength.put(4, 4.45); // Вершок

        americanLength = new HashMap<>();
        americanLength.put(1, 2.5); // Дюйм
        americanLength.put(2, 30.5); // Фут
        americanLength.put(3, 90.0); // Ярд
        americanLength.put(4, 160000.0); // Миля
    }

    public void start() {
        System.out.println("Из какой системы хотите перевести?\n" +
                "1 - сантиметры\n2 - метры\n3 - километры\n4 - старорусская система\n5 - американская система");
        // int number1
        System.out.println("В какую систему хотите перевести?\n" +
                "1 - сантиметры\n2 - метры\n3 - километры\n4 - старорусская система\n5 - американская система");
        // int number2
        System.out.println("Введите число для перевода:");
        // Double number

    }

    public double getValue(int n) {

    }

    public Double convert(int n, double number, double mult) {
        Double value = getValue(n);
        Double result = number * value * mult;
        return result;
    }
}
