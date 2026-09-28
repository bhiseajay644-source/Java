package base64encoderanddecoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TextEncoder {
    public static String encode(String normalText){
        //create encoder instance.
        Base64.Encoder encoder=Base64.getEncoder();
        //convert the normaltext into bytes
        byte[] bytes=normalText.getBytes();
        //convert the bytes into the normal text.
        String encodedText=encoder.encodeToString(bytes);
        return encodedText;
    }

    public static String decode(String encodedText){
        //create decoder instance
        Base64.Decoder decoder=Base64.getDecoder();
        //decode the encoded text into bytes
        byte[] bytes=decoder.decode(encodedText);
        //convert the bytes into normal text
        String normalText=new String(bytes);
        return normalText;
    }
}
