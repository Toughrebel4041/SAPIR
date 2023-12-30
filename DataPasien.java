import java.util.*;
public class DataPasien {
    public int NoPasien;
    public String NamaPasien;
    public String Diagnosa;
    public String LokasiKasur;

    public int getNoPasien() {
        return NoPasien;
    }

    public void setNoPasien(int NoPasien) {
        NoPasien = NoPasien;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public void setNamaPasien(String NamaPasien) {
        NamaPasien = NamaPasien;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public void setDiagnosa(String Diagnosa) {
        Diagnosa = Diagnosa;
    }

    public String getLokasiKasur() {
        return LokasiKasur;
    }

    public void setLokasiKasur(String LokasiKasur) {
        LokasiKasur = LokasiKasur;
    }

    public DataPasien(int NoPasien, String NamaPasien, String Diagnosa, String LokasiKasur){
        this.NoPasien = NoPasien;
        this.NamaPasien = NamaPasien;
        this.Diagnosa = Diagnosa;
        this.LokasiKasur = LokasiKasur;
    }

    
}
