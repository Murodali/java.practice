public class Person {
    private String  name;
    private String  lastName;
    private String email;
    private int age;

    Person(String name, String lastName, String email, int age){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return name + " " + lastName + " " + email + " " + age;
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Wick", "johnwick@gmail.com", 55);
        System.out.print(person);
    }
}