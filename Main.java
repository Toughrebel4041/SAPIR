
/* Raihan Sultan Pasha Basuki
 * SAPIR Project (Sistem Administrasi Pasien Rawat Inap)
 * ESQ Business School | Computer Science 2022
 * 2210130006
 * Mata Kuliah: Algoritma dan Struktur Data
 * Final Project
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, DataPasien> dataPasienMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Selamat datang di SAPIR! Asisten praktis untuk Administrasi Rumah Sakit.");
            System.out.println("Menu:");
            System.out.println("1. Cari data pasien dengan NoPasien");
            System.out.println("2. Cari data pasien dengan NamaPasien");
            System.out.println("3. Tambah Data Pasien Baru");
            System.out.println("4. Hapus Data Pasien Baru");
            System.out.println("5. Print Seluruh Data Pasien");
            System.out.println("6. Print Data Pasien dengan NoPasien ke atas");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            choice = scanner.nextInt();
            System.out.println("\n");

            switch (choice) {
                case 1:
                    // Cari data pasien dengan NoPasien
                    System.out.print("Masukkan NoPasien: ");
                    int searchNoPasien = scanner.nextInt();
                    DataPasien foundPasien = dataPasienMap.get(searchNoPasien);
                    if (foundPasien != null) {
                        System.out.println("Data Pasien Ditemukan:");
                        printDataPasien(foundPasien);
                    } else {
                        System.out.println("Data Pasien tidak ditemukan.");
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    // Cari data pasien dengan NamaPasien
                    System.out.print("Masukkan NamaPasien: ");
                    scanner.nextLine(); // Consume newline character
                    String searchNamaPasien = scanner.nextLine();
                    boolean dataFound = false;
                    for (DataPasien pasien : dataPasienMap.values()) {
                        if (pasien.getNamaPasien().equalsIgnoreCase(searchNamaPasien)) {
                            printDataPasien(pasien);
                            dataFound = true;
                        }
                    }
                    System.out.println("\n");
                    if (!dataFound) {
                        System.out.println("Data Pasien tidak ditemukan.");
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    // Tambah Data Pasien Baru
                    System.out.println("Masukkan data pasien baru:");
                    System.out.print("Nama Pasien: ");
                    scanner.nextLine(); // Consume newline character
                    String newNamaPasien = scanner.nextLine();
                    System.out.print("No Pasien: ");
                    int newNoPasien = scanner.nextInt();
                    System.out.print("Diagnosa: ");
                    scanner.nextLine(); // Consume newline character
                    String newDiagnosa = scanner.nextLine();
                    System.out.print("Lokasi Kasur: ");
                    String newLokasiKasur = scanner.nextLine();

                    DataPasien newPasien = new DataPasien(newNamaPasien, newNoPasien, newDiagnosa, newLokasiKasur);
                    dataPasienMap.put(newNoPasien, newPasien);
                    System.out.println("Data Pasien berhasil ditambahkan.");
                    System.out.println("\n");
                    break;

                case 4:
                    // Hapus Data Pasien Baru
                    System.out.print("Masukkan NoPasien untuk menghapus: ");
                    int deleteNoPasien = scanner.nextInt();
                    DataPasien deletedPasien = dataPasienMap.remove(deleteNoPasien);
                    if (deletedPasien != null) {
                        System.out.println("Data Pasien berhasil dihapus:");
                        printDataPasien(deletedPasien);
                    } else {
                        System.out.println("Data Pasien tidak ditemukan.");
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    // Print Seluruh Data Pasien
                    System.out.println("Seluruh Data Pasien:");
                    for (DataPasien pasien : dataPasienMap.values()) {
                        printDataPasien(pasien);
                    }
                    System.out.println("\n");
                    break;

                case 6:
                    // Print Data Pasien dengan NoPasien ke atas
                    System.out.print("Masukkan NoPasien untuk print ke atas: ");
                    int printNoPasien = scanner.nextInt();
                    printDataPasienAbove(dataPasienMap, printNoPasien);
                    break;

                case 7:
                    System.out.println("Terima kasih!");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Pilih 1-7.");
                    System.out.println("\n");
                    break;
            }
        } while (choice != 7);
    }

    private static void printDataPasien(DataPasien pasien) {
        System.out.println("Nama Pasien: " + pasien.getNamaPasien());
        System.out.println("No Pasien: " + pasien.getNoPasien());
        System.out.println("Diagnosa: " + pasien.getDiagnosa());
        System.out.println("Lokasi Kasur: " + pasien.getLokasiKasur());
        System.out.println("-----------------------");
    }

    private static void printDataPasienAbove(TreeMap<Integer, DataPasien> dataPasienMap, int noPasien) {
        boolean dataFound = false;
        for (Map.Entry<Integer, DataPasien> entry : dataPasienMap.entrySet()) {
            if (entry.getKey() >= noPasien) {
                printDataPasien(entry.getValue());
                dataFound = true;
            }
        }
        if (!dataFound) {
            System.out.println("Tidak ada Data Pasien dengan NoPasien " + noPasien + " ke atas.");
            System.out.println("\n");
        }
    }
}