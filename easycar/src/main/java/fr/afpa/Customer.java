package fr.afpa;

public class Customer {

    //Attributs
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    //Constructors
    public Customer(String firstName, String lastName, String address, String city, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }
    //Getters & Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    //Méthodes
    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + "]";
    }



    
}
