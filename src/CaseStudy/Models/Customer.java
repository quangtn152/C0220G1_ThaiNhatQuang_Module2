package CaseStudy.Models;

public class Customer {
    private String fullName;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phone;
    private String email;
    private String customerType;
    private String address;
    private Services service;

    public Customer() {
    }

    public Customer(String fullName, String birthDay, String gender, String idCard, String phone, String email, String customerType, String address, Services service) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public void showInfo(){
        System.out.println("Full Name: " + fullName +
                "\nBirthday: " + birthDay +
                "\nGender: " + gender +
                "\nID Card: "+ idCard +
                "\nPhone: " + phone +
                "\nEmail: " + email +
                "\nCustomer Type: " + customerType +
                "\nAddress: " + address);
    }
}