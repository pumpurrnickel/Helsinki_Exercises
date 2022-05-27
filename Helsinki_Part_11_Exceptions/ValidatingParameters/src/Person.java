public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Must have a valid name no more than 40 characters.");

        } else if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age cannot exceed 120 or be below 0.");

        }

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}