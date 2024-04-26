package org.example;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ChangeConsecutiveCharsTest {

    /**
     * For a given string that only contains alphabet characters a-z, if 3 or more consecutivecharacters are identical, remove them from the string. Repeat this process until
     * there is no more than 3 identica characters sitting besides each other.
     */
    @Test
    public void testRemoveConsecutiveChars() {
        //输入字符串
        String input = "aabcccbbad";
        Context context = new Context(new RemoveConsecutiveChars());
        System.out.println(context.changeConsecutiveChars(input));
    }

    /**
     * Instead of removing the consecutively identical characters, replace them with asingle character that comes before it alphabetically.
     */
    @Test
    public void testReplaceConsecutiveChars() {
        //输入字符串
        String input = "abcccbad";
        Context context = new Context(new ReplaceConsecutiveChars());
        System.out.println(context.changeConsecutiveChars(input));
    }

}
