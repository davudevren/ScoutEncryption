package ch.evren.android.scoutencryptions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Admin on 22.07.2015.
 */
public class Nokia {
    public ArrayList<String> nokiaChars;
    private Alphabet alphabet;

    public Nokia(){
        nokiaChars = new ArrayList<String>(
                Arrays.asList("2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"));
        alphabet = new Alphabet();

    }

    public String convertToNokia(String inputMessage){
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
                    output += this.nokiaChars.get(indexInArray);
                    output += "/";
                }
            }
        }
        output += "/";

        return output;
    }
}
