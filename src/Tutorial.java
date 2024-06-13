// Java code for hour glass
// pattern.

public class Tutorial
{
    public static void main (String[] args)
    {
        pattern();
    }

    static void pattern()
    {
        int i, j, k;
        for (i = 1; i <= 7; i++) {

            for (k = 1; k < i; k++)
                System.out.print(" ");

            for (j = i; j <=7; j++)
                System.out.print(j + " ");

            System.out.println();
        }

        for (i = 6; i >= 1; i--)
        {
            for (k = 1; k < i; k++)
                System.out.print(" ");

            for (j = i; j <= 7; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}

