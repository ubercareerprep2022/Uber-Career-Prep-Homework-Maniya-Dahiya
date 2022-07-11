package Exercise5;

public class directory {
    String name;
    long phoneNumber;

    public directory(String name, long number) {
        this.name = name;
        this.phoneNumber = number;
    }
    public String getName(){
        return this.name;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
}
