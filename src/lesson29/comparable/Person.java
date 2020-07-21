package lesson29.comparable;

public class Person implements Comparable<Person> {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    //    @Override
//    public int compareTo(Person person) {
//        return this.name.compareTo(person.getName());
//    }

//    @Override
//    public int compareTo(Person person) {
//        return this.name.length() -  (person.getName().length());
//    }
//    @Override
//    public int compareTo(Person person) {
//        // reverse order
//        return person.getName().compareTo(this.name);
//    }

    @Override
    public int compareTo(Person person){
        int lastNameComparationResult = this.lastName.compareTo(person.getLastName());

        if (lastNameComparationResult != 0){
            return lastNameComparationResult;
        }
        int nameComparationResult = this.name.compareTo(person.getName());

        return nameComparationResult == 0
        ? this.age - person.getAge()
                : nameComparationResult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
