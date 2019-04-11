public final class User {

    private final String name;
    private final String emailAddress;
    private final int age;
    private final String address;
    private final String city;
    private final String zipCode;

    private User(Builder builder) {
        this.name = builder.name;
        this.emailAddress = builder.emailAddress;
        this.age = builder.age;
        this.address = builder.address;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

}