package section26;

import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        // 1: get the sum in integer list
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int max = nums.stream()
                        .mapToInt(n -> n)
                                .max()
                                        .orElse(0);

        int sum = nums.stream()
                .mapToInt(n -> n)
                .sum();

        int min = nums.stream()
                .mapToInt(n -> n)
                .min()
                .orElse(0);

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);

        // 2: get the sum of all the words length
        List<String> words = List.of("virat", "jordan", "lewis", "ronaldo");

        int totalLenSum = words.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(totalLenSum);

        // 3: get the total sum of the employees' salaries
        List<Employee> employees = List.of(
                new Employee(18, 100.5),
                new Employee(22, 200.1),
                new Employee(16, 510.9),
                new Employee(25, 150.1),
                new Employee(19, 110.3)
        );

        // double salarySum= employees.stream()
        //         .map((Employee e) -> e.getSalary())
        //         .reduce(0.0, (Double acc, Double curr) -> acc + curr);

        double salarySum= employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(salarySum);

        // 4: get the avg age of the employees
        double avgAge= employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);

        System.out.println(avgAge);
    }
}
