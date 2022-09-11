package com.ilyap.Calculator;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IPv4 адрес:      ");
        String ipAddr = scanner.next();
        IPv4 ipv4 = new IPv4(ipAddr);
        System.out.println("Маска подсети:           " + ipv4.getMask());
        System.out.println("Количество хостов:       " + ipv4.getHosts());
        System.out.println("Адрес сети:              " + ipv4.getNetworkAddress());
        System.out.println("Широковещательный адрес: " + ipv4.getBroadcastAddress());
        System.out.println("Класс подсети:           " + ipv4.getNetworkClass());
    }
}