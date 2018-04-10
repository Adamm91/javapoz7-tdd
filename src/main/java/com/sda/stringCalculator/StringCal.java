package com.sda.stringCalculator;

import org.apache.commons.lang3.StringUtils;

public class StringCal {

    public int calculate (String text) {
//         if (StringUtils.isBlank(text) return 0;
        String withoutSpaces = StringUtils.deleteWhitespace(text);
        String[] numbers = StringUtils.split(withoutSpaces, ";");
        numbers = numbers == null ? new String[0] : numbers;
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }


}
