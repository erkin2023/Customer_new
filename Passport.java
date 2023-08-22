public class Passport {
    private int dateOfBirth;
    private String country;
    private String gender;

    public Passport(int dateOfBirth, String country, String gender) {
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }





    @Override
    public String toString() {
        return "Passport{" +
                "dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}