import java.util.Scanner;
class Array{
    public static void main(String[] args){
    // one dimentional array
    int arr[] = {1,2,3,4,5};
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }

    // two dimentional array
    int r, c;  
    Scanner sc = new Scanner(System.in);
    System.out.println("enter how many rows:");
    r = sc.nextInt();
    System.out.println("enter how many columns:");
    c = sc.nextInt();
    int mat[][] = new int[r][c];

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            mat[i][j] = sc.nextInt();
        }
    }
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            System.out.print(mat[i][j]);
        }
        System.out.println();
    }
    }
}
