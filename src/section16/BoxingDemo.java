package section16;

public class BoxingDemo {
    public static void main(String[] args) {
        int a= 19;
        char c= 'a';
        float p= 3.14f;
        boolean i= true;
        long l= 128881218L;

        // boxing using the recommended approach
        Integer aB= Integer.valueOf(a);
        Character cB= Character.valueOf(c);
        Float pB= Float.valueOf(p);
        Boolean iB= Boolean.valueOf(i);
        Long lB= Long.valueOf(l);

        System.out.println(aB);
        System.out.println(cB);
        System.out.println(pB);
        System.out.println(iB);
        System.out.println(lB);

        // unboxing
        int aU= aB.intValue();
        char cU= cB.charValue();
        float pU= pB.floatValue();
        boolean iU= iB.booleanValue();
        long lU= lB.longValue();

        System.out.println(aU);
        System.out.println(cU);
        System.out.println(pU);
        System.out.println(iU);
        System.out.println(lU);
    }
}
