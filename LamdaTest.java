package LeetCode.LeetCode;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Data
public class LamdaTest  {
    public static void main(String[] args){
//                new HelloLamda().r1.run();
//                new HelloLamda().r2.run();
//        List languages = Arrays.asList("Java","C++","Python");
//        Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
//        Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
//        Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
//        Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
//        Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
//        Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
//        Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
//        Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
//        Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
//        Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");
//
//        List<Employee> employees = new ArrayList<Employee>();
//        employees.addAll(Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));
//        employees.stream().filter(p -> p.getAge() > 21).forEach(System.out::println);

        List<Character> chr = new ArrayList<>();
        String s = "hello world!";
        for( char a : s.toCharArray()) chr.add(a);
//        chr.stream().filter(e -> e >'a' && e <'h').findFirst((e) -> System.out::println(e));
    }
    public static class Employee {
        public Integer getId() {
            return id;
        }

        public Integer getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        private Integer id;
        private Integer age;
        private String gender;
        private String firstName;
        private String lastName;

        public Employee(Integer id, Integer age, String gender, String fName, String lName) {
            this.id = id;
            this.age = age;
            this.gender = gender;
            this.firstName = fName;
            this.lastName = lName;
        }

        @Override
        public String toString() {
            return this.id.toString() + " - " + this.age.toString()+"\n";
        }

        //get,set省略...
    }

//
//    public static class HelloLamda {
//        Runnable r1 = () -> System.out.println(this);
//        Runnable r2 = () -> System.out.println("test r2");
//
//
//        @Override
//        public String toString() {
//            return "test r1";
//        }
//    }
//
//    public static void filter(List listname, Predicate condition) {
//
//    }


}
