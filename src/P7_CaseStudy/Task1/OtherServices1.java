package P7_CaseStudy.Task1;

public class OtherServices1  {
    private String servicesName;
    private String donVi;
    private int prices;

    public OtherServices1(String servicesName, String donVi, int prices) {
        this.servicesName = servicesName;
        this.donVi = donVi;
        this.prices = prices;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return getServicesName() + ", prices=" + getPrices()+ getDonVi();
    }
}
