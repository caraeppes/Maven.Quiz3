package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.getAllSubStrings;
import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.getNumberOfSubStrings;
import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String lowerCaseStr = str.toLowerCase();

        if (!containsOnlyAlphaCharacters(lowerCaseStr)) {
            return null;
        }
        if (startsWithVowel(str)) {
            return str + "way";
        }
        if (!hasVowels(str)) {
            return str + "ay";
        }
        if (!containsSpace(str)) {
            int indexOfFirstVowel = getIndexOfFirstVowel(str);
            return str.substring(indexOfFirstVowel) + str.substring(0, indexOfFirstVowel) + "ay";
        }

        String answer = "";
        String[] strings = str.split(" ");
        for(String string : strings){
            answer += translate(string) + " ";
        }
        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }

    public boolean containsOnlyAlphaCharacters(String str) {
        for (Character character : str.toCharArray()) {
            if ((!Character.isAlphabetic(character)) && (!(character == ' '))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsSpace(String str) {
        for (Character character : str.toCharArray()) {
            if (character == ' ') {
                return true;
            }
        }
        return false;
    }
}
