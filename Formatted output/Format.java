import java.util.*;
public class Format {
    public static void main(String[] args) {
        String[] names = {"Nandini","Naina","Ishu","Neeraj","Yogita"};
        int[] ages = {24,28,26,24,24};
        double[] percentages = {89.5,78.69,99.56,88.96,97.54};
        char[] grades = {'B','C','A','B','C'}; 

        System.out.printf("%-10s %-5s %-10s %-4s\n","Name","Age","Percentage","Grade");
        for(int i =0; i<5 ; i++){
            System.out.printf("%-10s %-5d %-10.3f %-4c\n",names[i],ages[i],percentages[i],grades[i]);
        }
    }
}
