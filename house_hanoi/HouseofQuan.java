package learnoop2.bai2.manager_hour.house_hanoi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import learnoop2.bai2.manager_hour.house.Househ;

public class HouseofQuan extends Househ {
    private String nameQuan;
    private static ArrayList<HouseofQuan> house = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    /**
     * @param soNha
     * @param diaChi
     * @param loaiNha
     * @param nameQuan
     */
    public HouseofQuan(String soNha, String diaChi, String loaiNha, String nameQuan) {
        super(soNha, diaChi, loaiNha);
        this.nameQuan = nameQuan;
        HouseofQuan c = new HouseofQuan();
        house.add(c);
    }

    /**
     * @param nameQuan
     */
    public HouseofQuan() {
        super();
    }

    public static void getInfoHouse() {
        for (int i = 0; i < house.size(); i++) {
            System.out.println("so nha : " + house.get(i).getSoNha() + "| dia chi : " + house.get(i).getDiaChi()
                    + "| loai nha :" + house.get(i).getLoaiNha() + "| ten quan: " + house.get(i).getNameQuan());
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" ten quan : " + this.nameQuan);
    }

    @Override
    public void input(Scanner scan) {
        super.input(scan);
        System.out.println("ten quan  : ");
        this.nameQuan = scanner.nextLine();

    }
    public static void findDiaChi(String dia)
    {
        String str=dia.toLowerCase();
        for(int i=0 ; i< house.size() ;i++)
        {
            HouseofQuan st=house.get(i);
            String str2=st.getDiaChi();
            if(str2.compareTo(str)==0)
            {
               house.get(i).display();
               break;
            }
        }
    }
    public static void sortListHouse() {
                for(int i=0 ; i<house.size() ;i++)
                {
                    for(int j=house.size()-1 ; j>i ; j--)
                    {
                        HouseofQuan ac=house.get(j);
                        HouseofQuan ab=house.get(j-1);
                        String[] diachi1=ac.getDiaChi().split("\\s");
                        String[] diachi2=ab.getDiaChi().split("\\s");
                        if(diachi1[diachi1.length-1].compareTo(diachi2[diachi2.length-1])<0)
                        {
                            house.set(j , ab);
                            house.set(j-1 ,ac);
                        }
                    }
                }
    }

    /**
     * @return the nameQuan
     */
    public String getNameQuan() {
        return nameQuan;
    }

    /**
     * @param nameQuan the nameQuan to set
     */
    public void setNameQuan(String nameQuan) {
        this.nameQuan = nameQuan;
    }

    /**
     * @param e
     * @return
     * @see java.util.ArrayList#add(java.lang.Object)
     */

    public static void add(HouseofQuan e) {
        house.add(e);
    }

  

}