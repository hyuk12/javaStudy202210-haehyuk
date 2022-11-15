package j25_문자열;

import java.util.UUID;

import static java.util.Collections.replaceAll;

public class UUIDString {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        String replaceUuid = uuid.replaceAll("-", "");


        int uuidLength = replaceUuid.length();
        int uuidHalfIndex = uuidLength/2;

        String leftUuid = replaceUuid.substring(0, uuidHalfIndex);
        String rightUuid = replaceUuid.substring(uuidHalfIndex);


        System.out.println(leftUuid);
        System.out.println(rightUuid);

    }
}
