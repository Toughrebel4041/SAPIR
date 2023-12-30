/* Raihan Sultan Pasha Basuki
 * SAPIR Project (Sistem Administrasi Pasien Rawat Inap)
 * ESQ Business School | Computer Science 2022
 * 2210130006
 * Mata Kuliah: Algoritma dan Struktur Data
 * Final Project
 */
import java.util.*;

class DataPasien {
    private String NamaPasien;
    private int NoPasien;
    private String Diagnosa;
    private String LokasiKasur;

    public DataPasien(String namaPasien, int noPasien, String diagnosa, String lokasiKasur) {
        this.NamaPasien = namaPasien;
        this.NoPasien = noPasien;
        this.Diagnosa = diagnosa;
        this.LokasiKasur = lokasiKasur;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public int getNoPasien() {
        return NoPasien;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public String getLokasiKasur() {
        return LokasiKasur;
    }
}