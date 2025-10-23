import java.util.*;
public class Test {
    public static void main(String[] args) {
        String[] lang = {"java","C++","Python"};
        int[] code = {100,65,50};
        for(int i=0; i<3;i++){
            System.out.printf("%-15s %03d\n",lang[i],code[i]);
        }
    }
}
