package org.example;

public class ReplaceConsecutiveChars implements IChangeConsecutiveChars{


    public String changeConsecutiveChars(String input) {
        return replaceConsecutiveChars(input);
    }

    /**
     * 给定a-z字母组成的字符串，三个或以上相同字符替换为顺序字母的前一个字符,如果是相同连续的a字符前面没有字符，就删除
     * @param input 给定a-z字母组成的字符串
     * @return 最终的字符串
     */
    private String replaceConsecutiveChars(String input) {
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) {
                    if(input.charAt(i - 1) != 'a'){
                        char replaceChar = (char) (input.charAt(i - 1) - 1);
                        // 删除连续出现3次以上的字符
                        return replaceConsecutiveChars(input.substring(0, i - count) + replaceChar + input.substring(i));
                    }
                    // 删除连续出现3次以上的字符
                    return replaceConsecutiveChars(input.substring(0, i - count) + input.substring(i));
                }
                count = 1;
            }
        }

        // 处理末尾可能存在的连续字符
        if (count >= 3) {
            if(input.charAt(0) != 'a'){
                char replaceChar = (char) (input.charAt(0) - 1);
                // 删除连续出现3次以上的字符
                return replaceConsecutiveChars(replaceChar + "");
            }
        }

        return input;
    }



}

