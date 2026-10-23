import java.util.Scanner;
public class siakadfor23 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        double nilai, tertinggi = -10, terendah = 100;

        for(int i = 1; i <= 11; i++){
            System.out.print("Masukkan nilai " + i +": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Masukkan nilai tertnggi : " +tertinggi);

        System.out.println("Masukkan nilai terendah : " +terendah);

    }
}
