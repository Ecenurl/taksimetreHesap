import java.util.Scanner;

public class taksiHesap {
    public static void main(String[] args) {

        double km,minimumTutar,AcilisUcreti,hesap;
        AcilisUcreti=10;
        minimumTutar=20;

        Scanner sc=new Scanner(System.in);
        System.out.print("Kac Kilometre Gidildi? ");
        km=sc.nextDouble();

        hesap=(km*2.20)+AcilisUcreti;
        if(hesap<20)
            hesap=20;
        System.out.print("Hesap: " +hesap);
    }
}
