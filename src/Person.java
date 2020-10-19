public class Person {
    public String phone, email;
    Person(String phone, String email){
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return "phone: " + phone + ", email: " + email;
    }
}
