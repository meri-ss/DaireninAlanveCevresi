import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        int r;
        double pi=3.14;
        int a;

        Scanner inp=new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz:");
        r=inp.nextInt();

        System.out.println("Açıyı giriniz: ");
        a=inp.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;
        double alan2=(pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Dairenin A Alanı: "+cevre);





    }
}
