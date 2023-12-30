import java.util.*;
public class Main {
    public static TreeMap<Integer, DataPasien> Data = new TreeMap<>();
    public static List<DataPasien> Repository = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputData = new Scanner(System.in);
        boolean mainMenu = true;
        System.out.println("\nWelcome to SAPIR");

        do{
            System.out.println("1. Cari Data Pasien dengan ID");
            System.out.println("2. Cari Data Pasien dengan Nama");
            System.out.println("2. Tambah Data Pasien Baru");
            System.out.println("3. Hapus Data Pasien");
            System.out.println("4. Keluar");
            System.out.println("\nPilihan Anda: ");
            int menuSelect = input.nextInt();
            switch (menuSelect) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        } while (mainMenu != false);
    }
}
