package ro.info.uvt.buneatest;

public class MessageDecoder {
    public String decodeMessage(String encodedMessage, String house) {
        if ("atreides".equals(house)) {
            return decodeAtreidesMessage(encodedMessage);
        } else if ("harkonnen".equals(house)) {
            return decodeHarkonnenMessage(encodedMessage);
        } else {
            return "Unknown house: " + house;
        }
    }

    private String decodeAtreidesMessage(String encodedMessage) {
        return encodedMessage.replace("Jbppf", "Messi");
    }

    private String decodeHarkonnenMessage(String encodedMessage) {
        return encodedMessage.replace("Oguuk", "Messi");
    }
}
