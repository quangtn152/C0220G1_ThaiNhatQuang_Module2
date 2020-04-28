package P7_CaseStudy.Models;

public class Customer {
    private String fullName;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private String customerType;
    private Services services;

    public Customer() {
    }

    public Customer(String fullName, String birthDay, String gender, String idCard, String phone, String email,
                    String address, String customerType, Services services) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Services getServices() {
        return services;
    }

    public void setService(Services services) {
        this.services = services;
    }

    public void showInfo() {
        System.out.println("Full Name: " + getFullName() +
                "\n Birthday: " + getBirthDay() +
                "\n Gender: " + getGender() +
                "\n Id Card: " + getIdCard() +
                "\n Phone: " + getPhone() +
                "\n Email: " + getEmail() +
                "\n Customer Type: " + getCustomerType() +
                "\n Address: " + getAddress());
    }
}
