package ICPCArchive12Subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Authors: Kali, Andres, Collin, Daniel, Nick
 *  October 29, 2020 (10/29/2020)
 */

public class Subsets
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer[]>> lines = new ArrayList<>(500);

        //  <@  Line index
        int i = 0;
        while(input.hasNext())
        {
            String line = input.nextLine();
            String[] arr = line.split(" ");
            switch(arr[0])
            {
                case "Make":
                    lines.add(new ArrayList<Integer[]>());
                    make(lines.get(i), arr);
                    break;
                case "Union":
                    union(lines, arr);
                    break;
                case "Intersect":
                    break;
                case "Diff":
                    break;
                case "Put":
                    break;
                case "Rem":
                    ArrayList<Integer[]> position = lines.get((Integer.parseInt(String.valueOf(arr[1].charAt(1)))) - 1);
                    remove(position, Integer.parseInt(String.valueOf(arr[2])));
                    break;
                case "Card":
                    System.out.println(lines.get((Integer.parseInt(String.valueOf(arr[1].charAt(1)))) - 1).size());
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    break;
            }
            i++;
        }

    }
    public static void make(ArrayList<Integer[]> arr, String[] strArray)
    {
        Integer[] intArr = new Integer[strArray.length - 1];
        for(int i = 1; i < strArray.length; i++)
        {
            intArr[i - 1] = Integer.parseInt(strArray[i]);
        }
        arr.add(intArr);
    }
    public static void union(ArrayList<ArrayList<Integer[]>> lines, String[] strArray)
    {
        ArrayList<Integer[]> newArray = new ArrayList<>();
        for(int i = 1; i < strArray.length; i++)
        {
            Integer temp = Integer.parseInt(String.valueOf(strArray[i].charAt(1))) - 1;
            for(int j = 0; j < lines.get(temp).size(); j++)
            {
                newArray.add(lines.get(temp).get(j));
            }
        }
        lines.add(newArray);
        System.out.println(newArray.get(0).toString() + newArray.get(1).toString());

    }
    public static void remove(ArrayList<Integer[]> arr, int remove)
    {
        ArrayList<Integer[]> newArr = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++)
        {
            Integer[] temp = new Integer[arr.get(i).length];
            for(int j = 0; j < arr.get(i).length; j++)
            {
                if(arr.get(i)[j] != remove)
                {
                    temp[j] = arr.get(i)[j];
                }
            }
            newArr.add(temp);
        }
    }
}
