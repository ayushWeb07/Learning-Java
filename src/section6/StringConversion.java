package section6;

public class StringConversion {
    public static void main(String[] args) {
        int n= 10;
        float pi= 3.14f;
        double sal= 100.100;
        char ch= 'f';
        boolean b= true;

        String nS= String.valueOf(n);
        String piS= String.valueOf(pi);
        String salS= String.valueOf(sal);
        String chS= String.valueOf(ch);
        String bS= String.valueOf(b);

        System.out.println(nS);
        System.out.println(piS);
        System.out.println(salS);
        System.out.println(chS);
        System.out.println(bS);
    }
}
