package ch.evren.android.scoutencryptions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Admin on 22.07.2015.
 */
public class Alphabet {
    public ArrayList<Character> alphabet;

    public Alphabet(){
        alphabet = new ArrayList<Character>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    }
}
