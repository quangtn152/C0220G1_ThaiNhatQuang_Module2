package P7_CaseStudy.Models;

import P7_CaseStudy.Task1.OtherServices;

public class Villa extends Services implements OtherServices {
    private String tieuChuanPhong;
    private String tienNghi;
    private int poolArea;
    private int soTang;

    public Villa(String servicesNames,
                 String id,
                 String tieuChuanPhong,
                 String tienNghi,
                 int usedArea,
                 int rentCost,
                 int maxPeople,
                 int poolArea,
                 int soTang) {
        super(servicesNames, id, usedArea, rentCost, maxPeople);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
        this.poolArea = poolArea;
        this.tienNghi=tienNghi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTienNghi() {
        return tienNghi;
    }

    public void setTienNghi(String tienNghi) {
        this.tienNghi = tienNghi;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public void showInfo() {
        System.out.println("Services Names: " + getServicesNames() +
                "\nID Phong: " + getId() +
                "\nTieu Chuan Phong: " + this.tieuChuanPhong +
                "\nDien Tich Su Dung: " + getUsedArea() + " m2"+
                "\nTien Nghi : " + this.tienNghi +
                "\nDien Tich Ho Boi: " + this.poolArea + " m2"+
                "\nGia Phong: " + getRentCost() + " $"+
                "\nSo Nguoi Toi Da: " + getMaxPeople() +
                "\nSo Tang: " + this.soTang);
    }

    @Override
    public void OtherServices(String nameOtherServices, String donVi, int prices) {
        System.out.println("Ten dich vu di kem: "+ nameOtherServices +
                            "\nGia: "+ prices + " "+donVi);
    }
}
