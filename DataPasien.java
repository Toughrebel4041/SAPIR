import java.util.*;
public class DataPasien {
    private int NoPasien;
    private String NamaPasien;
    private String Diagnosa;
    private String LokasiKasur;

    public int getNoPasien() {
        return NoPasien;
    }

    public void setNoPasien(int noPasien) {
        NoPasien = noPasien;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        NamaPasien = namaPasien;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        Diagnosa = diagnosa;
    }

    public String getLokasiKasur() {
        return LokasiKasur;
    }

    public void setLokasiKasur(String lokasiKasur) {
        LokasiKasur = lokasiKasur;
    }

    public DataPasien(int NoPasien, String NamaPasien, String Diagnosa, String LokasiKasur){
        this.NoPasien = NoPasien;
        this.NamaPasien = NamaPasien;
        this.Diagnosa = Diagnosa;
        this.LokasiKasur = LokasiKasur;
    }

    
}
