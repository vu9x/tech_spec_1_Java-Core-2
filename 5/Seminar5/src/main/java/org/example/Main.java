package org.example;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Stream.of("James", "Jana", "Johson",
                        "Janet", "Jack", "Jude", "Julian", "Joshua",
                        "Joel", "Jonah")
                .collect(Collectors.toList());


        List<String> specialities = Stream.of("Информатика", "Менеджмент",
                        "Экономика", "Аналитика", "Финансы", "Юриспруденция")
                .collect(Collectors.toList());




//        List<Student> itStudents = specialities.stream()
//                .filter(s -> s.equals("Информатика"))
//                .limit(5)
//                .map(s -> {
//                            return Student.builder()
//                                    .name(names.get(new Random().nextInt(names.size())))
//                                    .grades(
//                                            DoubleStream.generate(
//                                                    () -> {return (double) (new Random().nextInt(5));}
//                                            ).limit(5).boxed().collect(Collectors.toList())
//                                    )
//                                    .speciality(s)
//                                    .build();
//                        }
//                )
//                .toList();

        List<Student> itStudents = Stream.iterate(0, i -> i).limit(5)
                        .map(s -> {
                            return Student.builder()
                                    .name(names.get(new Random().nextInt(names.size())))
                                    .grades(
                                            DoubleStream.generate(
                                                    () -> {return (double) (new Random().nextInt(5));}
                                            ).limit(5).boxed().collect(Collectors.toList())
                                    )
                                    .speciality("Информатика")
                                    .build();
                        }
                )
                .toList();

        List<Student> sortedStudents = new ArrayList<>(itStudents);

//        Collections.sort(sortedStudents, new Comparator<Student>() {
//        });

        System.out.println(itStudents.size());
        System.out.println(itStudents);
    }

}
