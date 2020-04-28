package P7_CaseStudy.Commons;


import P7_CaseStudy.Models.Villa;


import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncWriteAndReadFileCSV {
    public static TreeSet<String> getAllNameServiceFromCSV(String path) {
        BufferedReader br = null;
        TreeSet<String> result = new TreeSet();

        try {
            String line;
            br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                if (getNameServiceFromFile(line).equals("serviceName")) {
                    continue;
                }
                result.add(getNameServiceFromFile(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br != null){
                    br.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
//        result.descendingSet();
        return result;
    }
    private static String getNameServiceFromFile(String csvLine) {
        String name = "";
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }
}
