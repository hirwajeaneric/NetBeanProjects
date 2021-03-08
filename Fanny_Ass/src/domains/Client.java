package domains;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Client implements Serializable {
    @Id
    private String regId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String photo;
    private ClientCategory category;

  public Client() {
  }

  public Client(String regId, String firstName, String lastName, String phoneNumber, String email, String photo, ClientCategory category) {
    this.regId = regId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.photo = photo;
    this.category = category;
  }

  public String getRegId() {
    return regId;
  }

  public void setRegId(String regId) {
    this.regId = regId;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public ClientCategory getCategory() {
    return category;
  }

  public void setCategory(ClientCategory category) {
    this.category = category;
  }
    
    
}
