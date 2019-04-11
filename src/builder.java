public static class Builder {
    private final String name;
    private final String emailAddress;
    private int age;
    private String address;
    private String city;
    private String zipCode;


    public Builder(String name, String emailAddress) {
        if (name == null || emailAddress == null) {
            throw new IllegalArgumentException("name and email address can not be null");
        }
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Builder setCity(String city) {
        this.city = city;
        return this;
    }

    public Builder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }


}