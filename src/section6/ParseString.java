package section6;

public class ParseString {
    public static void main(String[] args) {
        String age= "19";
        String pi= "3.14";
        String isRealMan= "true";
        String sal= "19998249912";

        int a= Integer.parseInt(age);
        float p= Float.parseFloat(pi);
        boolean i= Boolean.parseBoolean(isRealMan);
        long s= Long.parseLong(sal);

        System.out.println(a);
        System.out.println(p);
        System.out.println(i);
        System.out.println(s);
    }
}
