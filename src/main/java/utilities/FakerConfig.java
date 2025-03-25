package utilities;

import net.datafaker.Faker;

public class FakerConfig {

    private Faker faker = new Faker();

    public static FakerConfig getFaker(){
        return new FakerConfig();
    }

    public String getEmailAddress(){
        return faker.internet().emailAddress();
    }

    public String getPassword(){
        return faker.internet().password(10, 20);
    }

    public String getCompany(){
        return faker.company().name();
    }

    public String getCityName(){
        return faker.address().cityName();
    }

    public String getStreetAddress(){
        return faker.address().streetAddress();
    }

    public String getZipcode(){
        return faker.address().zipCode();
    }

    public String getPhoneNumber(){
        return faker.phoneNumber().phoneNumber();
    }
}
