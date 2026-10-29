package section16;

public class AutoBoxing {
    public static void main(String[] args) {
        int a= 19;
        char c= 'a';
        float p= 3.14f;
        boolean i= true;
        long l= 128881218L;

        // auto boxing
        Integer aB= a;
        Character cB= c;
        Float pB= p;
        Boolean iB= i;
        Long lB= l;

        System.out.println(aB);
        System.out.println(cB);
        System.out.println(pB);
        System.out.println(iB);
        System.out.println(lB);

        // auto unboxing
        int aU= aB;
        char cU= cB;
        float pU= pB;
        boolean iU= iB;
        long lU= lB;

        System.out.println(aU);
        System.out.println(cU);
        System.out.println(pU);
        System.out.println(iU);
        System.out.println(lU);
    }
}
