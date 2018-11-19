package random_character;

import java.time.Clock;
import java.util.Scanner;

public class Random_Character {
    static int in;
    
    public static int InputLength(){
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan length: ");
        in = inputan.nextInt();
        return in;
    }
    public static void main(String[] args) {
        int a = 67, b = 90, m = 122;
        int[] Y_ = new int[1000];
        char[] temp = new char[1000];
        Y_[0] = 65;
        int x = InputLength();
        if (x<=62){
            for (int i = 1; i < x +1; i++) {
            Y_[i] = (a * Y_[i - 1] + b) % m;
            if(Y_[i]>47 && Y_[i]<58 ||   // angka
               Y_[i]>64 && Y_[i]<91 ||  // huruf besar
               Y_[i]>96 && Y_[i]<123)   // huruf kecil
            {
                temp[i] = (char)Y_[i];
                System.out.print(temp[i]);
            }
            else {  
               x++;
            }
//            Y_[i-1]=Y_[i];
            }
        }else
        {
            System.err.println("inputan maximal 62");
        }
    }
    
}
