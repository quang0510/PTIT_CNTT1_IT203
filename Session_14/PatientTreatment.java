package Session_14;

public class PatientTreatment {
    String name;
    int age;
    String major;

    public PatientTreatment(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return name + " - " + age + " tuổi";
    }
}
