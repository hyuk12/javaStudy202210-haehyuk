package j25_문자열;

public class String2 {

    public static void main(String[] args) {

        String phoneNumber = "010-1234-3456";

        int lastHyphenIndex = phoneNumber.lastIndexOf("-");
        int firstHyphenIndex = phoneNumber.indexOf('-');

        String substringLastNumber = phoneNumber.substring(lastHyphenIndex + 1);
        String subStringMidNumber = phoneNumber.substring(firstHyphenIndex + 1, lastHyphenIndex);

        System.out.println(substringLastNumber);
        System.out.println(subStringMidNumber);

    }
}
