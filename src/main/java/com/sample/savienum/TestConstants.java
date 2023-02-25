package com.sample.savienum;

public class TestConstants {

    public static void main(String args[])
    {
        String inputData[] = {"SMALL","BIG","MEDIUM","SMALL","MEDIUM","BIG","SMALL"};
        int smallCount=0;
        int bigCount=0;
        int mediumCount=0;

        for(String input: inputData){
            if(Constants.SMALL.equalsIgnoreCase(input)){
                smallCount++;
            } else if (Constants.BIG.equalsIgnoreCase(input)){
                 bigCount++;
            }else if(Constants.MEDIUM.equalsIgnoreCase(input)){
                 mediumCount++;
            }
            }

            for(String input: inputData) {
                if (SIZE.SMALL.name().equalsIgnoreCase(input)) {
                    smallCount++;
                } else if (SIZE.BIG.name().equalsIgnoreCase(input)) {
                    bigCount++;
                } else if (SIZE.MEDIUM.name().equalsIgnoreCase(input)) {
                    mediumCount++;
                }
            }
            System.out.println("Big:"+bigCount+",Medium :"+mediumCount +",small :"+smallCount);
        }
    }
