package org.acme;

public class PersonDTO {
    private String nama;
    private String jk;
    private String alamat;
    private int umur;
    private String pekerjaan;
    private String hobi;
    private String status;

    public PersonDTO() {
    }


    public PersonDTO(String nama, String jk, String alamat, int umur, String pekerjaan, String hobi, String status) {
        this.nama = nama;
        this.jk = jk;
        this.alamat = alamat;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 

    
}
