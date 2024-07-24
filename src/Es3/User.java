package Es3;

import java.util.Date;

public class User {
    private String code;
    private String name;
    private String lastname;
    private String email;
    private Date registration;

    public User(String code, String name, String lastname, String email, Date registration) {
        this.code = code;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.registration = registration;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }
}
