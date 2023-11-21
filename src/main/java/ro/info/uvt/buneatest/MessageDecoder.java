package ro.info.uvt.buneatest;

import java.util.HashMap;
import java.util.Map;

public class MessageDecoder {
    public String decodeMessage(String encodedMessage, String house) {
        StringBuilder decodedMessage = new StringBuilder();

        for (char c : encodedMessage.toCharArray()) {
            if (Character.isLetter(c)) {
                int charVal;
                if("atreides".equals(house)) charVal =  'J' - 'M';
                else charVal = 'O' - 'M';
                char decodedChar = (char) (c - charVal);
                decodedMessage.append(decodedChar);
            } else {
                decodedMessage.append(decodeNonLetter(c));
            }
        }
        return decodedMessage.toString();
    }

    private String decodeNonLetter(char nonLetter) {
        switch (nonLetter) {
            case '^':
                return "a";
            case '`':
                return "c";
            case ')':
                return ",";
            case '"', '\u001D':
                return " ";
            default:
                return String.valueOf(nonLetter);
        }
    }

}
