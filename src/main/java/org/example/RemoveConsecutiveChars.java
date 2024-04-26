package org.example;

import java.util.Scanner;

public class RemoveConsecutiveChars implements IChangeConsecutiveChars{


    public String changeConsecutiveChars(String input) {
        return removeConsecutiveChars(input);
    }

    /**
     * 给定a-z字母组成的字符串，删除三个或以上相同字符
     * @param input 给定a-z字母组成的字符串
     * @return 最终的字符串
     */
    private String removeConsecutiveChars(String input) {
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) {
                    // 删除连续出现3次以上的字符
                    return removeConsecutiveChars(input.substring(0, i - count) + input.substring(i));
                }
                count = 1;
            }
        }

        // 处理末尾可能存在的连续字符
        if (count >= 3) {
            return removeConsecutiveChars(input.substring(0, input.length() - count));
        }

        return input;
    }

}

