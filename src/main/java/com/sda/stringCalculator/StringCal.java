package com.sda.stringCalculator;

import org.apache.commons.lang3.StringUtils;

public class StringCal {

    public int calculate (String text) {
//         if (StringUtils.isBlank(text) return 0;
        String result = isNullOrBlank(text) ? "0" : StringUtils.deleteWhitespace(text);
        String[] numbers = result.split(";");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        return sum;
    }

    public boolean isNullOrBlank (String text) {
        return StringUtils.isBlank(text);
    }

}
