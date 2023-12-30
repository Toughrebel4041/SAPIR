import java.util.*;
public class Main {
    public static TreeMap<Integer, DataPasien> Data = new TreeMap<>();
    public static List<DataPasien> Repository = new ArrayList<>();
    Scanner inputData = new Scanner(System.in);
    DataPasien dp = new DataPasien();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean mainMenu = true;
        System.out.println("\nWelcome to SAPIR");

        do{
            System.out.println("1. Cari Data Pasien dengan ID");
            System.out.println("2. Cari Data Pasien dengan Nama");
            System.out.println("3. Tambah Data Pasien Baru");
            System.out.println("4. Hapus Data Pasien");
            System.out.println("5. Keluar");
            System.out.println("\nPilihan Anda: ");
            int menuSelect = input.nextInt();
            switch (menuSelect) {
                case 1:
                    System.out.println("Masukkan nama Pasien: ");
                    String nama = input.next("");
                    
                    break;
            
                case 2:
                    System.out.println("Masukkan ID Pasien: ");
                    int ID = input.nextInt();
                break;

                case 3:
                    System.out.println("Tambah data Pasien baru");

                break;

                case 4:
                    System.out.println("Hapus data pasien");

                case 5:
                    mainMenu = false;                    
                default:
                    break;
            }
        } while (mainMenu != false);
    }

    @Override
    public void addNewPatient(){
        System.out.println("Masukkan nama Pasien: ");
        String nama = inputData.next("");
        System.out.println("Masukkan ID Pasien: ");
        int ID = inputData.nextInt();
        System.out.println("Masukkan diagnosa: ");
        String diagnosa = inputData.next("");
        System.out.println("Masukkan lokasi kasur: ");
        String lokasiKasur = inputData.next("");
        Data.put(ID, new DataPasien(ID, nama, diagnosa, lokasiKasur));
    }

    public void searchName(){
    
    }
}
