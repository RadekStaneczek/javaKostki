import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
class zad1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Kostki = new ArrayList<>();
        Random rand = new Random();
        int[] duplikaty;
        int a;
        int punkty = 0;
        do
        {
            System.out.println("Ile kostek chcesz rzucic (3-10): ");
            a = scanner.nextInt();
        }
        while(a < 3 || a > 10);
        scanner.close();

        for(int i = 0; i < a; i++)
        {
            Kostki.add( 1 + rand.nextInt(6));
            System.out.println("Kostka " + (i + 1) + ": " + Kostki.get(i));
        }
        duplikaty = duplicates(Kostki);
        for(int j = 0; j < 6; j++)
        {
            if(duplikaty[j] > 1)
            {
                punkty += duplikaty[j] * (j+1);
            }
        }
        System.out.println(punkty);
    }


    static int[] duplicates(ArrayList<Integer> table)
    {
        int[] duplicates = new int[Collections.max(table)-1];

        for(int i = 0; i < table.size(); i++)
        {
            duplicates[table.get(i)-1] += 1;
        }
        return duplicates;
    }
}