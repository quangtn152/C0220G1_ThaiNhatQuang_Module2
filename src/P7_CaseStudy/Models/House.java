package P7_CaseStudy.Models;

public class House extends Services {
    private String tieuChuanPhong;
    private String tienNghi;
    private int soTang;

    public House(String servicesNames,
                 String id,
                 String tieuChuanPhong,
                 String tienNghi,
                 int usedArea,
                 int rentCost,
                 int maxPeople,
                 int soTang) {
        super(servicesNames, id, usedArea, rentCost, maxPeople);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghi = tienNghi;
        this.soTang = soTang;
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
                "\nGia Phong: " + getRentCost() + " $"+
                "\nSo Nguoi Toi Da: " + getMaxPeople() +
                "\nSo Tang: " + this.soTang);
    }
}
