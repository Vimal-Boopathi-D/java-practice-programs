package Association;


class Person1 {
    int id;
    String name;
    Address1 address;

    Person1(int id, String name, Address1 address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + address;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person1 object is being garbage collected");
    }
}

class Address1 {
    String street;
    String state;
    String country;
    long pincode;

    Address1(String street, String state, String country, long pincode) {       this.street = street;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return street + ", " + state + ", " + country + " - " + pincode;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Address object is being garbage collected");
    }
}

public class AggregationToString {
    public static void main(String args[]) {
        Address1 address = new Address1("Sathya Nagar", "Tamil Nadu", "India", 638701);
        Person1 obj = new Person1(1, "Vimal", address);

        // ✅ Now just printing the object prints all the details
        System.out.println(obj);
        obj=null;
        System.gc();

        // Uncommenting the below will cause NullPointerException (obj is null)
        // obj = null;
        // System.out.println(obj);
    }
}

