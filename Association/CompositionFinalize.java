package Association;

class Personc {
    String name;
    int age;
    Birthdayb birthday;

    Personc(String name, int age, int date, int day, int year) {
        this.name = name;
        this.age = age;
        this.birthday = new Birthdayb(date, day, year);
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
        birthday.birthdayDisplay();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person2 object is being garbage collected");
    }
}

class Birthdayb {
    int date;
    int day;
    int year;

    Birthdayb(int date, int day, int year) {
        this.date = date;
        this.day = day;
        this.year = year;
    }

    void birthdayDisplay() {
        System.out.println("Date: " + date + "\nDay: " + day + "\nYear: " + year);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Birthday object is being garbage collected");
    }
}

public class CompositionFinalize {
    public static void main(String args[]) {
        Personc obj = new Personc("Vimal", 23, 19, 6, 2002);
        obj.display();

        obj = null; // Remove reference to trigger GC

        System.gc(); // Suggest garbage collection (finalize may run now or later)

        System.out.println("End of main method");
    }
}

