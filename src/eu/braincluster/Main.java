package eu.braincluster;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    private static void consumerTest01()
    {
        var c1 = new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        };

        c1.accept("Test 01");
    }

    private static void consumerTest02()
    {
        Consumer<String> c2 = s -> System.out.println(s);

        c2.accept("Test 02");
    }

    private static void consumerTest03()
    {
        Consumer<Integer> printSquare = x ->
        {
            int square = x * x;
            System.out.println(square);
        };

        printSquare.accept(5);
    }

    private static void consumerTest04()
    {
        IConsumer2<Integer, Integer> printSum = (a, b) -> System.out.println(a + b);

        printSum.accept(4, 5);
    }

    private static void functionTest01()
    {
        Function<Integer, Integer> square = a -> a * a;

        System.out.println(square.apply(5));
    }

    public static void main(String[] args)
    {
        // Consumer interface tests
        consumerTest01();
        consumerTest02();
        consumerTest03();
        consumerTest04();

        // Function interface tests
        functionTest01();
    }
}
