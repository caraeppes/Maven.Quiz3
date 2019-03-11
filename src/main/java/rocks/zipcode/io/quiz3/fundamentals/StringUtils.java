package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String answer = "";
        answer += str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) +
                str.substring(indexToCapitalize + 1);
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string){
        List<String> listOfSubStrings = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j =  i + 1; j <= string.length(); j++){
                if(!listOfSubStrings.contains(string.substring(i, j)))
                listOfSubStrings.add(string.substring(i, j));
            }
        }
        String[] substrings = listOfSubStrings.toArray(new String[listOfSubStrings.size()]);
        return substrings;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
