package sg.edu.nus.iss.vttp5a_ssf_day02l.model;

public class Student {
  private int id;
  private String firstname;
  private String lastname;
  private long dob;
  private String email;
  private String Address;
  
  public Student(int id, String firstname, String lastname, long dob, String email, String address) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.dob = dob;
    this.email = email;
    Address = address;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public long getDob() {
    return dob;
  }
  public void setDob(long dob) {
    this.dob = dob;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getAddress() {
    return Address;
  }
  public void setAddress(String address) {
    Address = address;
  }

  
  
}
