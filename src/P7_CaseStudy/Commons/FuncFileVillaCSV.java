package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileVillaCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameVilla = "src/P7_CaseStudy/data/Villa.csv";
    //    //HEADER FILE VILLA CSV
    private static final String FILE_HEADER_VILLA = "id,serviceName,usedArea,rentCost,maxPeople,poolArea,soTang,tieuChuanPhong,tienNghi";

    public static void writeVillatoCSV(ArrayList<Villa> listVilla) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getServicesNames());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getSoTang()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTieuChuanPhong());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTienNghi());
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

    public static ArrayList<Villa> getfileCSVtoListVilla() {
        BufferedReader bufferedReader = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Path path = Paths.get(fileNameVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameVilla);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameVilla));

            while ((line = bufferedReader.readLine()) != null) {
                String[] spliData = line.split(",");
                if (spliData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(spliData[0]);
                villa.setServicesNames(spliData[1]);
                villa.setUsedArea(Integer.parseInt(spliData[2]));
                villa.setRentCost(Integer.parseInt(spliData[3]));
                villa.setMaxPeople(Integer.parseInt(spliData[4]));
                villa.setPoolArea(Integer.parseInt(spliData[5]));
                villa.setSoTang(Integer.parseInt(spliData[6]));
                villa.setTieuChuanPhong((spliData[7]));
                villa.setTienNghi((spliData[8]));
                listVilla.add(villa);
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
        return listVilla;
    }
}
