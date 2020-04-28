package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileHouseCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameHouse = "src/P7_CaseStudy/data/House.csv";
    //HEADER FILE House CSV
    private static final String FILE_HEADER_HOUSE = "id,usedArea,rentCost,maxPeople,soTang,tieuChuanPhong,tienNghi";

    public static void writeHousetoCSV(ArrayList<House> listHouse) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : listHouse) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getServicesNames());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getSoTang()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTieuChuanPhong());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTienNghi());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("error in csvFileWriter");
        } finally {
            try {
                fileWriter.flush(); // xoa bo nho dem
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("error when flush or close");
            }
        }
    }

    public static ArrayList<House> getfileCSVtoListHouse() {
        BufferedReader bufferedReader = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path = Paths.get(fileNameHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameHouse);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameHouse));

            while ((line = bufferedReader.readLine()) != null) {
                String[] spliData = line.split(",");
                if (spliData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(spliData[0]);
                house.setServicesNames(spliData[1]);
                house.setUsedArea(Integer.parseInt(spliData[2]));
                house.setRentCost(Integer.parseInt(spliData[3]));
                house.setMaxPeople(Integer.parseInt(spliData[4]));
                house.setSoTang(Integer.parseInt(spliData[5]));
                house.setTieuChuanPhong((spliData[6]));
                house.setTienNghi((spliData[7]));
                listHouse.add(house);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listHouse;
    }
}
