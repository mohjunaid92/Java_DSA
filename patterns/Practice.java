package patterns;
import java.util.*;
public class Practice {
    public static void Butterfly(int n){
         for(int i = 1; i<= n; i++){
            // start
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //start
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
       for(int i = n; i>=1; i--){
            // start
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            //start
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Full_peramid(int n ){
        int ch = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print(ch+ " ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void fullNum(int n){
        
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<= n-i; j++){
                System.out.print(" "+ " ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j+ " ");
            }
            for(int j = 2; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void ractangle(int n ){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=6; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void revers_half_peramid(int n){
        for(int i  = n ; i>= 1; i--){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void kpattern(int n){
        for(int i = n ; i>=1; i--){
            for(int j=  1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i<= n-1; i++){
            for(int j = 1; j<= i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leapyear(){
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        
        
    //    if(year % 4== 0){
    //         if(year % 100 == 0){
    //             if(year% 400 == 0){
    //                 System.out.println("leap year");
    //             } else {
    //                 System.out.println(" not leap year");
    //             }
    //         } else {
    //             System.out.println("leap year");
    //         }
    //     } else {
    //         System.out.println("not leap year");
    //     }


    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0) ) ){
        System.out.println("leap year");
    } else {
        System.out.println("Not leap year");
    }
       
        
    }

    public static void greater(int a, int b, int c){
        if((a>b)&& (a>c)){
            System.out.println("a is greater");
        } 
        else if( b>c){
            System.out.println(" b is greter");
        } else {
            System.out.println("c is greater");
        }
    }

    public static void ButterPattren(int n){
        for(int i = 1; i<= n; i++){
            // stars
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<= 2 * (n-i); j++){
                System.out.print(" ");
            }
            // starts
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // second half
        for(int i = n-1; i>= 1; i--){
            // stars
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j<= 2 * (n-i); j++){
                System.out.print(" ");
            }
            // starts
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void kPattern(int n){
        for(int i = n; i>=1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PascalFunction(int n){
        //first half
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i = n-1; i>= 1; i--){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void Triangle(int n){
        int val = 1;
       for(int i = n; i>= 1; i--){
           
        // spaces

        for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
        }
        // print no.
        int neww = val;
        for(int j = 1; j<= i;j++){
            System.out.print(neww+ " ");
            neww++;

            
        }
        System.out.println();
        val++;
        
       
       }
       //second half
       val =  val-2;
       for(int i = 1+1; i<= n; i++){
           
        // spaces

        for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
        }
        // print no.
        int neww = val;
        for(int j = 1; j<= i;j++){
            System.out.print(neww+ " ");
            neww++;

            
        }
        System.out.println();
        val--;
        
       
       }
    }

    public static void Trianglep(int n){
        // upper part
        for(int i = 1; i<=n ; i++){
            //spaces
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            //no.
            for(int j = i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();


        }
        //lower part

        for(int i = n-1; i>=1 ; i--){
            //spaces

            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }

            //no.
            for(int j = i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();


        }
    }
    public static void main(String args[]){
        Trianglep(5);
        //Triangle(6);
        //PascalFunction(4);
        //kPattern(4);
        //ButterPattren(3);
        //Butterfly(8);
        //Full_peramid(5);

        //fullNum(5);
        //fullNum(5);
        //ractangle(5);

       // revers_half_peramid(5);
       //kpattern(5);
       
       

      // leapyear();
      //greater(3, 5, 6);

   


       
    }

}