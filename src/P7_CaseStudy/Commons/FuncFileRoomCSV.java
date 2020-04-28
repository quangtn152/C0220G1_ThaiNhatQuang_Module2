package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileRoomCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameRoom = "src/P7_CaseStudy/data/Room.csv";
    //HEADER FILE ROOM CSV
    private static final String FILE_HEADER_ROOM = "id,serviceName,usedArea,rentCost,maxPeople,freeService";

    public static void writeRoomtoCSV(ArrayList<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room Room : listRoom) {
                fileWriter.append(Room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Room.getServicesNames());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(Room.getUsedArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(Room.getRentCost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(Room.getMaxPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(Room.getFreeService());
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

    public static ArrayList<Room> getfileCSVtoListRoom() {
        BufferedReader bufferedReader = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Path path = Paths.get(fileNameRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameRoom);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameRoom));

            while ((line = bufferedReader.readLine()) != null) {
                String[] spliData = line.split(",");
                if (spliData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(spliData[0]);
                room.setServicesNames(spliData[1]);
                room.setUsedArea(Integer.parseInt(spliData[2]));
                room.setRentCost(Integer.parseInt(spliData[3]));
                room.setMaxPeople(Integer.parseInt(spliData[4]));
                room.setFreeService(spliData[5]);
                listRoom.add(room);
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
        return listRoom;
    }
}
