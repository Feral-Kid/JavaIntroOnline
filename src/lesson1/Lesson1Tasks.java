package lesson1;

import java.util.Scanner;

public class Lesson1Tasks {

    // Первая часть урока - линейные программы
    public static class Part1 {
        // Найдите значение функции z = ((a - 3) * b / 2 + c
        public static void task1() {
            float a, b, c;
            System.out.println("Enter a, b, c");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            float z = ((a - 3) * b / 2) + c;
            System.out.println(z);
        }

        // Вычислите значение выражения по формуле (b + sqrt(b^2 + 4ac)) / 2a - (a^3)*c + (b^-2)
        public static void task2() {
            float a, b, c;
            System.out.println("Enter a, b, c");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            double z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(z);
        }

        //  Вычислите значение выражения по формуле (sinX + cosY) / (cosX + sinY) * tg(XY)
        public static void task3() {
            float x, y;
            System.out.println("Enter x, y");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextFloat();
            y = scanner.nextFloat();
            double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);
            System.out.println(z);
        }

        // Дано действительное число R вида nnn.ddd (три разряда в дробной и целой частях).
        // Поменять местами дробную и целую части числа и вывести полученное значение
        public static void task4() {
            float R;
            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            R = scanner.nextFloat();
            int integerPart = (int) R;
            float fractionalPart = R - integerPart;
            float result = Math.round(fractionalPart * 1000) + integerPart / 1000.F;
            System.out.println(result);
        }

        // Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
        // Вывести данное значение длительности в часах, минутах и секундах в форме HHч MMмин SSc
        public static void task5() {
            int number;
            System.out.println("Enter number");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            int hours = number / 3600;
            int minutes = number / 60 - hours * 60;
            int seconds = number - hours * 3600 - minutes * 60;
            System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
        }

        // Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
        // принадлежит закрашенной области, и false в противном случае
        public static void task6() {
            int x, y;
            System.out.println("Enter x, y");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            y = scanner.nextInt();
            boolean result = true;
            if (y < 0) {
                if (x > 4 || x < -4) {
                    result = false;
                } else {
                    if (y < -3) {
                        result = false;
                    }
                }
            }
            else {
                if (x > 2 || x < -2) {
                    result = false;
                }
                else {
                    if (y > 4) {
                        result = false;
                    }
                }
            }
            System.out.println(result);
        }

    }

    // Вторая часть урока - ветвления
    public static class Part2 {

        // Даны два угла в треугольника в градусах. Определить, существует ли такой треугольник, и если да,
        // то будет ли он прямоугольным.
        public static void task1() {
            int a, b;
            System.out.println("enter the angles of the triangle in degrees");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a + b < 180) {
                System.out.println("Triangle exists");
                if (a == 90 || b == 90 || (180 - a - b) == 90) {
                    System.out.println("Triangle is right-angled");
                }
                else {
                    System.out.println("Triangle is not right-angled");
                }
            }
            else {
                System.out.println("Triangle does not exist");
            }
        }

        // Найти max{min(a,b), min(b,c)}
        public static void task2() {
            int a, b, c, d;
            System.out.println("Enter a, b, c, d");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            int minAB;
            if (a <= b) {
                minAB = a;
            }
            else {
                minAB = b;
            }
            int minCD;
            if (c <= d) {
                minCD = c;
            }
            else {
                minCD = d;
            }
            if (minAB >= minCD) {
                System.out.println(minAB);
            }
            else {
                System.out.println(minCD);
            }
        }

        // Даны три точки A(x1,y1), B(x2,y2), C(x3,y3).
        // Определить, будут ли они расположены на одной прямой.
        public static void task3() {
            int x1, x2, x3, y1, y2, y3;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A");
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            System.out.println("Enter B");
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            System.out.println("Enter C");
            x3 = scanner.nextInt();
            y3 = scanner.nextInt();
            // Площадь
            float square = (float) (0.5 * ((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3)));

            if (square == 0) { // Если площадь = 0, значит точки лежат на одной прямой
                System.out.println("The points lie on a straight line");
            } else {
                System.out.println("The points do not lie on a straight line");
            }
        }

        // Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.
        public static void task4() {
            int a, b, x, y, z;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A, B");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Enter x, y, z");
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();

            if (x <= a && y <= b || y <= a && x <= b ||
                    x <= a && z <= b || z <= a && x <= b ||
                    z <= a && y <= b || y <= a && z <= b) {
                System.out.println("Will pass");
            } else {
                System.out.println("Will not pass");
            }
        }

        // Вычислить значение функции F(x) = x^2 - 3x + 9, при x <= 3; F(x) = 1 / (x^3 + 6), при x > 3
        public static void task5() {
            double x, y;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x");
            x = scanner.nextFloat();
            if (x <= 3) {
                y = Math.pow(x, 2) - 3 * x + 9;
            } else {
                y = 1 / (Math.pow(x, 3) + 6);
            }
            System.out.println(y);
        }
    }

    // Третья часть урока - циклы
    public static class Part3 {

        // Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа
        public static void task1() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scanner.nextInt();
            int result = 0;
            for (int i = 1; i <= number; i++) {
                result += i;
            }
            System.out.println(result);
        }

        // Вычислить значение функции на отрезке [a,b] с шагом h
        public static void task2() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a, b, h");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float h = scanner.nextFloat();
            float x = a;
            while (x <= b) {
                if (x > 2) {
                    System.out.println(x);
                } else {
                    System.out.println(-x);
                }
                x += h;
            }
        }

        // Найти сумму квадратов первых ста чисел
        public static void task3() {
           int result = 0;
           for (int i = 1; i <= 100; i++) {
               result += Math.pow(i, 2);
           }
           System.out.println(result);
        }

        // Найти произведение квадратов первых двухсот чисел
        public static void task4() {
            long result = 1;
            for (int i = 1; i <= 200; i++) {
                result *= Math.pow(i, 2);
            }
            System.out.println(result);
        }

        // Даны числовой ряд и некоторое число e.
        // Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
        // Общий член ряда имеет вид: A(n) = 1 / (2^n) + 1 / (3^n)
        public static void task5() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter e");
            float e = scanner.nextFloat();
            float result = 0;
            for (int i = 1; Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i)) >= e; i++) {
                result += 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            }
            System.out.println(result);
        }

        // Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютер
        public static void task6() {
            for (int i = 0; i < 256; i++) {
                System.out.println(i + ": " + (char) i);
            }
        }

        // Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        // m и n вводятся с клавиатуры.
        public static void task7() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter m, n");
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for (int i = m; i <= n; i++) {
                System.out.print(i + ": ");
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        System.out.print(j + ",");
                        System.out.print(i / j + ",");
                    }
                }
                System.out.println();
            }
        }

        // Даны два числа.
        // Определить цифры, входящие в запись как первого, так и второго числа
        public static void task8() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a, b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = b;
            while (a != 0) {
                while (temp != 0) {
                    if (temp % 10 == a % 10) {
                        System.out.println(a % 10);
                    }
                    temp /= 10;
                }
                a /= 10;
                temp = b;
            }
        }
    }
}
