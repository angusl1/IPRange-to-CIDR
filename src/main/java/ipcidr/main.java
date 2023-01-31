package ipcidr;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class main {

    private static String fileLocation = "data/allLowerMainlandIPs.csv";
    public static void main (String[] args) {
        File ips = new File(fileLocation);
        try {
            Scanner sc = new Scanner(ips);
            while (sc.hasNext()) {
                convertAndPrint(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found, exiting.");
        }
    }

    public static void convertAndPrint(String ipRange) {
        String[] split = ipRange.split("-");
        String start = split[0];
        String end = split[1];
        try {
            for (String s : IP2CIDR.range2cidrlist(start, end)) {
                System.out.println(s);
            }
        } catch(NumberFormatException e) {
            System.out.println("NFE: " + e.getMessage());
        }
    }
}
