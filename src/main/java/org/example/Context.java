package org.example;

import java.util.Scanner;

/**
 * 改变字符串算法策略控制类
 */
public class Context {

    private IChangeConsecutiveChars changeConsecutiveChars;


    public Context(IChangeConsecutiveChars changeConsecutiveChars) {
        this.changeConsecutiveChars = changeConsecutiveChars;
    }

    public String changeConsecutiveChars(String input){
        return changeConsecutiveChars.changeConsecutiveChars(input);
    }
}
