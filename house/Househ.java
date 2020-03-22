package learnoop2.bai2.manager_hour.house;

import java.util.Scanner;

public abstract class   Househ{
    private String soNha;

    private String diaChi;
    
    private String loaiNha;


    public void input(Scanner scan) {
        System.out.println("so nha : ");
        this.soNha=scan.nextLine();
        System.out.println("dia chi :");
        this.diaChi=scan.nextLine();
        System.out.println("loai nha : ");
        this.loaiNha=scan.nextLine();

    }
    
    public void display(){
        System.out.print("so nha :"+this.soNha+"| dia chi :"+this.diaChi+"| loai nha: "+ this.loaiNha+"|");
        
    }

    /**
     * @param soNha
     * @param diaChi
     * @param loaiNha
     */
    public Househ(String soNha, String diaChi, String loaiNha) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    /**
     * 
     */
    public Househ() {
    }

    /**
     * @return the soNha
     */
    public String getSoNha() {
        return soNha;
    }

    /**
     * @param soNha the soNha to set
     */
    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * @return the loaiNha
     */
    public String getLoaiNha() {
        return loaiNha;
    }

    /**
     * @param loaiNha the loaiNha to set
     */
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

}


