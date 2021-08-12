public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign()
    {
        int a=1,b=2;
        int c= a + b;
        if (c>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();
    }

    public static void printColor()
    {
        int value=5;
        if (value <=0) System.out.println("Красный");
        else if (value >0 && value<=100) System.out.println("Желтый");
        else System.out.println("Зеленый");
        System.out.println();
    }

    public static void  compareNumbers()
    {
        int a=7,b=11;
        if (a>=b)  System.out.println("a >= b");
        else System.out.println("a < b");
        System.out.println();
    }
}
