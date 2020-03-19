package t_11_holdingYourObjects.ex07;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final static int SIZE = 5;

    public static void main(String[] args)
    {
        Simple[] simples = new Simple[SIZE];

        for (int i = 0; i < simples.length; i++)
        {
            simples[i] = new Simple();
        }
        List<Simple> simpleList = new ArrayList<>();

        for (Simple simple : simples)
        {
            simpleList.add(simple);
        }

        List<Simple> subList = simpleList.subList(0, 3);

        simpleList.removeIf(simpl -> subList.contains(simpl));

    }

}
