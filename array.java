import java.util.Scanner;

class array{
    public static void main(String[] args){
        int[] arr= new int[5];
        for(int i=0; i<5 ; i++){
            System.out.println(arr[i]);
        }
    }
}


class array2{
    public static void main(String[] args){
        int[] arr2={ 2, -1,10,1000 ,56 };
        for(int i=0; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
}

class array3{
    public static void main(String[] args){
        int [] arr = new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0; i<arr.length ; i++){
            System.out.println("Enter element:"+(i+1));
            arr[i]=scan.nextInt();
        }
        System.out.println("Entered"+arr.length+" elements");

        for (int element:arr){
            System.out.println(element);
        }
    }
}

class array4{
    public static void main(String[] args){
        int[][] arr={{10,20,-2,7},{-70,23,98,23},{101,123,160,0}};
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
