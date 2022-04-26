package Services.impl;

import Services.IFacilityServices;
import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import utils.ReadAndWriteHouse;
import utils.ReadAndWriteMaintain;
import utils.ReadAndWriteRoom;
import utils.ReadAndWriteVilla;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements IFacilityServices {
    Scanner scanner = new Scanner(System.in);
    public static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    static ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
    static ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
    static ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
    static ReadAndWriteMaintain readAndWriteMaintain = new ReadAndWriteMaintain();

    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    static List<Villa> villaList = new ArrayList<>();
    static List<Facility> maintain = new ArrayList<>();

    public static final String HOUSE_PATH = "src\\data\\house.csv";
    public static final String ROOM_PATH = "src\\data\\room.csv";
    public static final String VILLA_PATH = "src\\data\\villa.csv";
    public static final String MAINTAIN = "src\\data\\maintain.csv";

    static {

        House house1 = new House("house1", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-9234");
        houseList.add(house1);
        facilityMap.put(house1, 1);

        House house2 = new House("house1", 112.5, 150.6, 5, "Theo Ngày", "Ngàn Sao", 1, "SVHO-9234");
        houseList.add(house2);
        facilityMap.put(house2, 2);

        Room room1 = new Room("name01", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1274");
        roomList.add(room1);
        facilityMap.put(room1, 4);

        Room room2 = new Room("name01", 150.5, 110.6, 5, "Theo Ngày", "Cartoon_Network", "SVRO-1274");
        roomList.add(room2);
        facilityMap.put(room2, 6);

        Villa villa1 = new Villa("name001", 150.5, 17.6, 5, "Theo Ngày", "Không Sao", 30, 2, "SVVL-1284");
        villaList.add(villa1);
        facilityMap.put(villa1, 4);

        Villa villa2 = new Villa("name001", 150.5, 17.6, 5, "Theo Ngày", "Không Sao", 30, 2, "SVVL-1284");
        villaList.add(villa2);
        facilityMap.put(villa2, 7);

        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getValue() >= 5) {
                maintain.add(entry.getKey());
            }
        }
        try {
            new FileWriter(MAINTAIN, false).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Facility i : maintain) {
            try {
                readAndWriteMaintain.writeToFile(MAINTAIN, maintain);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void displayFacility() {
        System.out.println("HOUSE SERVICES");
        houseList = readAndWriteHouse.readFromFile(HOUSE_PATH, houseList);
        for (House house : houseList) {
            System.out.println(house);
        }

        System.out.println("\nROOM SERVICES");
        roomList = readAndWriteRoom.readFromFile(ROOM_PATH, roomList);
        for (Room room : roomList) {
            System.out.println(room);
        }
        System.out.println("\nVILLA SERVICES");
        villaList = readAndWriteVilla.readFromFile(VILLA_PATH, villaList);
        for (Villa villa : villaList) {
            System.out.println(villa);
        }
    }

    @Override
    public void addHouse() throws IOException {
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter usable area: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter floor number: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter service code: ");
        String serviceCode = scanner.nextLine();
        House house = new House(serviceName, usableArea, rentalCost, maximumPeople, rentalType, standardRoom, floorNumber, serviceCode);
        houseList.add(house);
        readAndWriteHouse.writeToFile(HOUSE_PATH, houseList);
        facilityMap.put(house, 0);
        System.out.println("Add complete");
    }


    @Override
    public void addRoom() throws IOException {
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter usable area: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter free service attach: ");
        String serviceAttach = scanner.nextLine();
        System.out.println("Enter service code: ");
        String serviceCode = scanner.nextLine();
        Room room = new Room(serviceName, usableArea, rentalCost, maximumPeople, rentalType, serviceAttach, serviceCode);
        roomList.add(room);
        readAndWriteRoom.writeToFile(ROOM_PATH, roomList);
        facilityMap.put(room, 0);
        System.out.println("Add complete");
    }


    @Override
    public void addVilla() throws IOException {
        System.out.println("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.println("Enter usable area: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental cost");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maximum people: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental type: ");
        String rentalType = scanner.nextLine();
        System.out.println("Enter standard Villa: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Enter pool area: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter floor number: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter service code: ");
        String serviceCode = scanner.nextLine();
        Villa villa = new Villa(serviceName, usableArea, rentalCost, maximumPeople, rentalType, standardVilla, poolArea, floorNumber, serviceCode);
        villaList.add(villa);
        readAndWriteVilla.writeToFile(VILLA_PATH, villaList);
        facilityMap.put(villa, 0);
        System.out.println("Add complete");

    }

    @Override
    public void displayMaintain() {
        for (Facility i : maintain
        ) {
            System.out.println(i.toString());
        }
    }
}



