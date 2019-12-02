package stepDefs.api;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String uname) {
        this.userName = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mailid) {
        this.email = mailid;
    }


}
