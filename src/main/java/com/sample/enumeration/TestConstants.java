package com.sample.enumeration;

public class TestConstants {

    public static void main(String args[]){
        String inputData[] = {"LOW", "HIGH", "MEDIUM", "LOW", "MEDIUM", "HIGH", "LOW"};
        int lowCount =0;
        int highCount =0;
        int mediumCount =0;

        for(String input: inputData) {
            if(Constants.LOW.equalsIgnoreCase(input)){
                lowCount++;
            }else if(Constants.HIGH.equalsIgnoreCase(input)){
                highCount++;
            }else if(Constants.MEDIUM.equalsIgnoreCase(input)){
                mediumCount++;
            }
        }


        for(String input: inputData){
            if(RANGE.LOW.name().equalsIgnoreCase(input)){
                lowCount++;
            }else if(RANGE.HIGH.name().equalsIgnoreCase(input)){
                highCount++;
            }else if(RANGE.MEDIUM.name().equalsIgnoreCase(input)){
                mediumCount++;
            }
        }

        System.out.println("High :"+highCount+", Medium :"+mediumCount +", Low :"+lowCount);
    }
}
