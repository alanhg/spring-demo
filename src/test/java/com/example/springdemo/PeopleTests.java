package com.example.springdemo;

import com.example.springdemo.util.People;
import com.example.springdemo.util.TechPeople;
import com.example.springdemo.util.ToolUtil;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleTests {
    @Test
    public void mapTest() {
        List<People> peopleList = new ArrayList<People>();
        peopleList.add(new People("1", "2"));
        peopleList.add(new People("3", "4"));
        List<java.lang.String> list2 = peopleList.stream().map(people -> {
            return people.getName();
        }).collect(Collectors.toList());
        System.out.println(list2);
    }

    @Test
    public void flatMapTest() {
        List<People> peopleList = new ArrayList<People>();
        peopleList.add(new People("1", "2"));
        peopleList.add(new People("3", "4"));
        List<java.lang.String> list2 = peopleList.stream().flatMap(people -> {
            List<java.lang.String> list1 = new ArrayList<java.lang.String>();
            list1.add(people.getName());
            list1.add(people.getAddress());
            return list1.stream();
        }).collect(Collectors.toList());
        System.out.println(list2);
    }

    @Test
    public void reflectTest() {
        List<Field> fields = ToolUtil.getAllFields(new LinkedList<Field>(), TechPeople.class);
        for (Field field : fields) {
            System.out.printf(field.getName() + "\n");
        }
        Field[] filedArr = fields.toArray(new Field[fields.size()]);
        System.out.printf("------------------\n");
        for(Field field:filedArr){
            System.out.printf(field.getName() + "\n");
        }

    }

}
