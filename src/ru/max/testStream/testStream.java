package ru.max.testStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Serov Maxim
 */
public class testStream {
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        long count = collection.stream().filter("a1"::equals).count();
        System.out.println(count);
        List<String> eq = collection.stream().filter((d) -> d.contains("2") || d.contains("1")).collect(Collectors.toList());
        System.out.println(eq);

        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );
        List<People> young = peoples.stream().filter((p) -> p.age < 50 && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println(young);
        double manAverageAge = peoples.stream().mapToInt(People::getAge).average().getAsDouble();
        double manMaxAge = peoples.stream().mapToInt(People::getAge).max().getAsInt();
        System.out.println(manAverageAge);
        System.out.println(manMaxAge);
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {
        private String name;
        private int age;
        private Sex sex;

        People(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

    }


}
