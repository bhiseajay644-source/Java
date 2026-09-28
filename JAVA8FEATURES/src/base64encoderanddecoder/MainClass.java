package base64encoderanddecoder;

public class MainClass {
    public static void main(String[] args) throws Exception{
/*
        String encodedText=TextEncoder.encode("Hello world");
        System.out.println("hello world---->encoded--->"+encodedText);
        System.out.println("===============".repeat(2));

        String normalText=TextEncoder.decode(encodedText);
        System.out.println(normalText);

*/

        String encodedText=ImageEncoder.encode("C:/Users/Ajay/OneDrive/Pictures/wallpaper.jpg");
        System.out.println("The encoded text of the image : "+encodedText);

        System.out.println("=============".repeat(5));

        String result=ImageEncoder.decode(encodedText);
        System.out.println(result);

    }
}
