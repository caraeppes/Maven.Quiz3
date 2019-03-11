package rocks.zipcode.io.quiz3.fundamentals;


/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        if(isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }


    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(Character vowel : vowels){
            if (character == vowel){
                return true;
            }
        }
        return false;
    }
}
