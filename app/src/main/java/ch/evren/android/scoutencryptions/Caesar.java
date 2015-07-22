package ch.evren.android.scoutencryptions;

/**
 * Created by Admin on 22.07.2015.
 */
public class Caesar {
    private Alphabet alphabet;
    private int key;

    public Caesar(int key) {
        alphabet = new Alphabet();
        this.key = key;
    }

    public String encryptCaesar(String inputMessage){
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
                output += " ";
            }else {
                int indexInArray = this.alphabet.alphabet.indexOf(currentChar);
                if(indexInArray >= 0) {
                    indexInArray += key;
                    if(indexInArray >= alphabet.alphabet.size()){
                        indexInArray -= alphabet.alphabet.size();
                    }
                    output += this.alphabet.alphabet.get(indexInArray);
                }
            }
        }

        return output;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
