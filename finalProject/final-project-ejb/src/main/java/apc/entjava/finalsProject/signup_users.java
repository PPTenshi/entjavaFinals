package apc.entjava.finalsProject;

public class signup_users {
    private Long userId;
    private String firstname;
    private String lastname;
    private String mobile_number;
    private String password;
    private String email;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public signup_users() {

    }

    public signup_users(Long userId, String firstname, String lastname, String mobile_number,
                        String password, String email){
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile_number = mobile_number;
        this.password = password;
        this.mobile_number = mobile_number;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMobile_number() {
        return mobile_number;
    }
    public void setMobile_number(String mobile_number) {this.mobile_number = mobile_number;}

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
