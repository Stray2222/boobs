import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    public Person() {
    }

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

/*
   Сравниваются поля объектов, FirstName, LastName и Age.

 */
    @Override
    public boolean equals(Object obj) {
        //  Если все поля равны. То объекты считаются равными и возращают true
        //   Если хотя бы одно из полей не равно, то пусть возвращает false
        if (this == obj)
            return true;
        if (!(obj instanceof  Person))
            return false;
        Person person = (Person) obj;
        return  Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(age, person.age);

    }
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

}
