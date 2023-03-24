package com.sample.fileoperation;

import java.io.*;
import java.util.*;

public class KeyFileParser {


    public static void main(String[] args) throws IOException {
        File certExpFile = new File("src/main/resources/CertExpiration.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(certExpFile)));
        Set<FIELD> orderedSet = new TreeSet<FIELD>(new Comparator<FIELD>() {
            @Override
            public int compare(FIELD first, FIELD other) {
                return other.order - first.order;
            }
        });

        EnumSet<FIELD> enumSet = EnumSet.allOf(FIELD.class);
        enumSet.forEach(field -> {orderedSet.add(field);});

//        orderedSet.stream().forEach(field -> {
//            System.out.println(field.key);
//        });
        while(reader.ready()){
            String line = reader.readLine();
            if(line.indexOf(FIELD.KEY_ID.key) > -1) {
                printKey(orderedSet, line);
            }
        }
    }

    private static void printKey(Set<FIELD> orderedSet, String line) {

        List<FieldData> fieldList = new ArrayList<>();
        Iterator<FIELD> fieldIterator = orderedSet.iterator();
        String remaining = line;
        while(fieldIterator.hasNext()){
            FIELD field = fieldIterator.next();
            int position = remaining.indexOf(field.key);
            //System.out.println(position);
            String currentToken = remaining.substring(position + field.key.length());
            //System.out.println("currentToken : " +currentToken);
            remaining = remaining.substring(0, position);
            //System.out.println("remaining : "+ remaining);
            fieldList.add(new FieldData(field, currentToken));
        }

        //Reverse such that the data is reversed.
        Collections.reverse(fieldList);
        fieldList.forEach( entry -> {
            System.out.println(entry.field.key + ": "+entry.value);
        });
        //Key ID : 0x2158ABE4A6290FC1		User : HW_KeyPair_PROD <IntegrationNotification@wd-wpp.com>		Description : Key Pair		Key Type : RSA		Key Size : 2048		Expiration Date : Sun Jul 12 23:59:59 PDT 2026
        //0x2158ABE4A6290FC1		User : HW_KeyPair_PROD <IntegrationNotification@wd-wpp.com>		Description : Key Pair		Key Type : RSA		Key Size : 2048		Expiration Date : Sun Jul 12 23:59:59 PDT 2026
        //0x2158ABE4A6290FC1		User : HW_KeyPair_PROD <IntegrationNotification@wd-wpp.com>		Description : Key Pair		Key Type : RSA		Key Size : 2048		Expiration Date : Sun Jul 12 23:59:59 PDT 2026
    }
}
