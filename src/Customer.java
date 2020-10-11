public class Customer{
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;


    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        this.setPassword(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(isValidPassword(password)){
            this.password = password;
        }else{
            this.password="DefautPassword";
        }
    }
    public String toString() {
        return String.format("Customer [firstName='%s', lastName='%s', cardNumber='%s', pin='%s', username='%s', password='%s', address='%s']\n",
                firstName, lastName, cardNumber, pin, username, password, address);
    }
    private boolean isValidPassword(String password){
        if(password.length()< 8 || password.length()>20) return false;
        boolean digit = false, lowerCase= false,upperCase = false, symbol = false;

        char c;
        for(int i = 0;i < password.length();i++){
            c = password.charAt(i);
            if(Character.isUpperCase(c)){
                upperCase = true;
            }
            else if(Character.isLowerCase(c)){
                lowerCase = true;
            }
            else if(Character.isDigit(c)){
                digit = true;
            }
            else if(c=='#'|c=='@'|c=='$'|c=='%'){

                symbol = true;

            }
        }
        return upperCase && lowerCase && symbol && digit;
    }


    public static void main(String[] args) {
        Customer a = new Customer("Nurlan", "Shaidullaev", "310 Lenin st, Naryn", "13022020", 1234, "n.shaidullaev", "zF$");
        System.out.println(a);
    }

}