package ua.hillel.tatiana.lesson4;

public class Money {
    public static void main(String[] args) {


        int a, b, c;
        double al, bl, cl, aln, bln, cln, bn, sr;

        a = 16376;
        b = 12095;
        c = 59237;
        bn = 0.95;
        al = a * 12 * 10;
        aln = al * bn;
        bl = b * 12 * 10;
        bln = bl * bn;
        cl = c * 12 * 10;
        cln = cl * bn;
        sr = (aln + bln + cln)/(12*10);
        System.out.println(aln);
        System.out.println(bln);
        System.out.println(cln);
        System.out.println(sr);


    }



}
