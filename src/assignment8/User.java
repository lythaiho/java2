package assignment8;

public class User {
    public String fullName;
    public String email;
    public Integer age;
    public String address;

    public User(){

    }

    public User(String fullName, String email, Integer age, String address) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
