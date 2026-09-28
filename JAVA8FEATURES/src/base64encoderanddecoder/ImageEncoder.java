package base64encoderanddecoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;


public class ImageEncoder {
    public static String encode(String filePath) throws Exception{
        File file=new File(filePath);
        FileInputStream fis=new FileInputStream(file);
        byte[] bytes=new byte[(int)file.length()];

        fis.read(bytes);

        Base64.Encoder encoder=Base64.getEncoder();
        String encodedText=encoder.encodeToString(bytes);
        return encodedText;
    }

    public static String decode(String encodedText) throws Exception{
        Base64.Decoder decoder=Base64.getDecoder();
        byte[] bytes=decoder.decode(encodedText);

        File file=new File("C:/Users/Ajay/OneDrive/Pictures/wallpaper.jpg");
        FileOutputStream fos=new FileOutputStream(file);
        fos.write(bytes);
        return "Image is constucted for the encoded text ";
    }
}
