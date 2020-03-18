import java.util.ArrayList;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 13:58
 */
public class Person {
    private String givenName;
    private String surName;
    private int age;
    private String sex;
    private String eMail;
    private String phone;
    private String address;

    public static class Builder {

        private String givenName = "";
        private String surName = "";
        private int age = 0;
        private String sex;
        private String eMail = "";
        private String phone = "";
        private String address = "";

        public Person.Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Person.Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Person.Builder age(int val) {
            age = val;
            return this;
        }

        public Person.Builder sex(String val) {
            sex = val;
            return this;
        }

        public Person.Builder email(String val) {
            eMail = val;
            return this;
        }

        public Person.Builder phoneNumber(String val) {
            phone = val;
            return this;
        }

        public Person.Builder address(String val) {
            address = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person() {
        super();
    }

    private Person(Person.Builder builder) {
        givenName = builder.givenName;
        surName = builder.surName;
        age = builder.age;
        sex = builder.sex;
        eMail = builder.eMail;
        phone = builder.phone;
        address = builder.address;

    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void print() {
        System.out.println(
                "\nName: " + givenName + " " + surName + "\n" +
                        "Age: " + age + "\n" +
                        "String: " + sex + "\n" +
                        "eMail: " + eMail + "\n" +
                        "Phone: " + phone + "\n" +
                        "Address: " + address + "\n"
        );
    }

    public void printName() {
        System.out.println(
                "Name: " + givenName + " " + surName);
    }

    @Override
    public String toString() {
        return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + "  String: " + sex + "\n" + "eMail: " + eMail + "\n" + "Address: " + address + "\n";
    }


    public static List<Person> createShortList() {
        List<Person> people = new ArrayList<>();

        people.add(
                new Person.Builder()
                        .givenName("Bob")
                        .surName("Baker")
                        .age(21)
                        .sex("女")
                        .email("bob.baker@example.com")
                        .phoneNumber("201-121-4678")
                        .address("44 4th St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Jane")
                        .surName("Doe")
                        .age(25)
                        .sex("男")
                        .email("jane.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("John")
                        .surName("Doe")
                        .age(25)
                        .sex("女")
                        .email("john.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("James")
                        .surName("Johnson")
                        .age(45)
                        .sex("女")
                        .email("james.johnson@example.com")
                        .phoneNumber("333-456-1233")
                        .address("201 2nd St, New York, NY 12111")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Joe")
                        .surName("Bailey")
                        .age(17)
                        .sex("女")
                        .email("joebob.bailey@example.com")
                        .phoneNumber("112-111-1111")
                        .address("111 1st St, Town, CA 11111")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Phil")
                        .surName("Smith")
                        .age(11)
                        .sex("女")
                        .email("phil.smith@examp;e.com")
                        .phoneNumber("222-33-1234")
                        .address("22 2nd St, New Park, CO 222333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Betty")
                        .surName("Jones")
                        .age(85)
                        .sex("男")
                        .email("betty.jones@example.com")
                        .phoneNumber("211-33-1234")
                        .address("22 4th St, New Park, CO 222333")
                        .build()
        );


        return people;
    }

}

