package ru.DinY.springCourse.DAO;

import org.springframework.stereotype.Component;
import ru.DinY.springCourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class personDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT;
    public List<Person> index(){
        return  people;
    }
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Tom"));
        people.add(new Person(++PEOPLE_COUNT,"John"));
        people.add(new Person(++PEOPLE_COUNT,"Mike"));
    }
    public Person show(int id){
        return people.stream().filter(x->x.getId()==id).findAny().orElse(null);
    }
}
