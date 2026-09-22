package org.example.core.string;

import java.lang.reflect.Array;
import java.util.*;

public class FotaParser {
    public static void main(String[] args) {

//        String data = "^TMFOTA|357897106509142|I.07|9594|START CFGOTA 0.24|113350|171220|BMS Config CRC OK|#";
        String data = "$TMRESP|352835102429811|I.49|15|SHOW CONFIG|113131|080221|\rDevID: 352835102429811 Server: Bn.bt.exicom.in IP: 35.244.167.76 Port: 1883 APN: m2misafe UpdateRate: 30 \rSoftwareVer: I.49 \rHardwareVer: 1.10 OK*";

        String[] splitArr = data.split("\\|");
        //  System.out.println(splitArr);
//        FotaParser parser = new FotaParser();
        System.out.println(Long.parseLong(splitArr[1]));
//        parser.setImei(Long.parseLong(splitArr[1]));
        System.out.println(splitArr[2]);
//        parser.setTcuSv(splitArr[2]);
        System.out.println(splitArr[3]);
//        parser.setPacketSequenceNumber(splitArr[3]);
        System.out.println(splitArr[4]);
//        parser.setResponseMessage(splitArr[4]);
        System.out.println(splitArr[5]);
//        parser.setTime(splitArr[5]);
        System.out.println(splitArr[6]);
//        parser.setDate(splitArr[6]);
        System.out.println(splitArr[7]);
//        parser.setResponse(splitArr[7]);





    }
}
