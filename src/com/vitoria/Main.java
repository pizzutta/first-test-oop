package com.vitoria;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Normaliser normaliser = new Normaliser();

        System.out.println("Write a job title: ");
        String value = scanner.nextLine();

        String normalisedString = normaliser.normalise(value);
        if (StringUtils.isEmpty(normalisedString)) {
            System.out.println("No results.");
        } else {
            System.out.println(((value.equals(normalisedString)) ?
                    "You searched for " : "You must be searching for ") + normalisedString);
        }
    }
}
