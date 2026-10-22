package section6;

public class StringMethods {
    public static void main(String[] args) {
        String a= "Im";
        String b= "The";
        String c= "Fucking best";
        String d= "That you never had";
        String e= "";

        String full= a + " " + b + " " + c + " " + d;
        int len= full.length();

        System.out.println(full);
        System.out.println(len);

        // access the characters
        System.out.println(full.charAt(10));
        System.out.println(full.charAt(11));
        System.out.println(full.charAt(12));

        // check if empty
        System.out.println("".equals(a));
        System.out.println("".equals(e));

        // upper and lowercase
        System.out.println(full.toUpperCase());
        System.out.println(full.toLowerCase());

        // searching
        System.out.println(c.indexOf("best"));
        System.out.println(c.contains("be"));
        System.out.println(c.startsWith("be"));
        System.out.println(c.endsWith("best"));

        // substrings
        String h1= c.substring(8);
        String h2= c.substring(0, 7);
        System.out.println(h1);
        System.out.println(h2);

        // replacing characters
        System.out.println(c);
        System.out.println(c.replace('F', 'l').replace('b', 's'));
        System.out.println(c.replace("Fucking", "Fuckinnggggg"));

        // string splitting
        String st= "M5, Ruvelto, Hurrican, Veyron, Chiron, SF9";
        String[] stArr= st.split(", ");

        System.out.println();

        for (int i=0; i<stArr.length; i++) {
            System.out.println(stArr[i]);
        }

        String ref= String.join(", ", stArr);
        System.out.println(ref);
    }
}
