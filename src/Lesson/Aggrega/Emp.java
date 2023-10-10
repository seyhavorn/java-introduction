package Lesson.Aggrega;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Phnom Penh", "St312", "Cambodia");
        Address address2 = new Address("Phnom Penh", "St122", "Cambodia");

        Emp e = new Emp(122, "Seyha Vorn", address1);
        Emp e2 = new Emp(123, "Chan Sommanf", address2);

        e.display();
        e2.display();
    }
}
