// Take a matrix as input from the user. Search for a given number x and print the indices at wich it occurs.

import java.util.*;

class Logic{

    int row ;
    int col ;
    Scanner sc = new Scanner(System.in);
    Logic(int r , int c){
        row = r;
        col = c;
    }

    // insert elements
    int[][] insertElement(){

        int[][] arr = new int[row][col];
        // Scanner sc = new Scanner(System.in);

        System.out.println("Insert Elements : ");
        // outer loop to access rows
        for(int i=0; i<row; i++){

            // inner loop to access columns
            for(int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }

            // adding new line for next row
            System.out.println("");     
        }
        return arr;
    }

    // when you found the searched key
    void printElement(int[][] arr){

        // out loop for access rows
        System.out.println("2D ARRAY : ");
        for(int i=0; i<row; i++){

            // inner loop for access columns
            for(int j=0; j<col; j++){
                System.out.print("["+i+" "+j+"] "+arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
 
    // for search a particular element
    void searchElement(int[][] arr){

        System.out.println("Enter the element to search : ");
        int key = sc.nextInt();
        boolean found = false;
        // outer loop for access row
        for(int i=0; i<row; i++){

            // inner loop to access columns
            for(int j=0; j<col; j++){

                if(arr[i][j] == key){
                    System.out.println("Found !");
                    System.out.println(key+" At index "+ "["+i+","+j+"]");
                    found = true;
                    return;
                }
            }

        }
        if (!found){
            System.out.println("Not Found !");
        }
    }
}


public class MatrixSearch {
    public static void main(String[] args){

    // user input of row and col size 
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter row size : ");
    int row = sc.nextInt();
    System.out.println("Enter col size : ");
    int col = sc.nextInt();

    // object creation
    Logic obj = new Logic(row , col);
    int[][] arr = obj.insertElement();
    obj.printElement(arr);
    obj.searchElement(arr);
    }
}
