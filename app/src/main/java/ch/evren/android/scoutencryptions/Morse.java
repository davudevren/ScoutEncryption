package ch.evren.android.scoutencryptions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Admin on 22.07.2015.
 */
public class Morse {
    public ArrayList<String> morseChars;
    private Alphabet alphabet;

    public Morse(){
        morseChars = new ArrayList<>(
                Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));
        alphabet = new Alphabet();

    }

    public String convertToMorse(String inputMessage){
        String message = inputMessage;
        message = message.toLowerCase();
        message = message.replace("ä","ae");
        message = message.replace("ö","oe");
        message = message.replace("ü","ue");
        String output = "";
        char[] messageArray = message.toCharArray();
        for(int i = 0 ; i < messageArray.length ; i++){
            char currentChar = messageArray[i];
            if(currentChar == ' '){
                output += "/";
            }else {
                int indexInArray = this.alphabet.alphabet.indexOf(currentChar);
                if(indexInArray >= 0) {
                    output += this.morseChars.get(indexInArray);
                    output += "/";
                }
            }
        }
        output += "/";

        return output;
    }
}
