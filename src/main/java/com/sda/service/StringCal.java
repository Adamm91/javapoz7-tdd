package com.sda.service;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StringCal {

    public int calculate (String text) {
//         if (StringUtils.isBlank(text) return 0;
        String withoutSpaces = StringUtils.deleteWhitespace(text);
        String[] numbers = StringUtils.split(withoutSpaces, ";");
        numbers = numbers == null ? new String[0] : numbers;
        return Arrays.stream(numbers)
                .mapToInt(e -> Integer.valueOf(e))
                .sum();
    }


}
