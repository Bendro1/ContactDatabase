package sk.jozef.io.kontaktDatabaza;

public class Contact {
    private String name;
    private String phone;
    private String mobile;
    private String email;

    public Contact(String name, String phone, String mobile, String email) {
        this.name = name;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
