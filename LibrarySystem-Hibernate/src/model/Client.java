package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hirwa
 */
@Entity
public class Client {
    @Id
    private String regNo;
    private String firstName;
    private String lastName;
    private String phoneNUmber;
    private String emailAddress;
    private String photo;
    private String clientCategory;

    public Client() {
    }

    public Client(String regNo, String firstName, String lastName, String phoneNUmber, String emailAddress, String photo, String clientCategory) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNUmber = phoneNUmber;
        this.emailAddress = emailAddress;
        this.photo = photo;
        this.clientCategory = clientCategory;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

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

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }  
}
