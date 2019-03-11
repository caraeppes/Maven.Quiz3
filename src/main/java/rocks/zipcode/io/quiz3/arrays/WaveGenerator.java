package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> waveStrings = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                waveStrings.add(capitalizeNthCharacter(str, i));

            }
        }
        return waveStrings.toArray(new String[waveStrings.size()]);
    }
}
