package com.sda.stringCalculator;

public class StringCal {

    public int calculate (String text) {
        String[] numbers = text.split(";");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }

}
