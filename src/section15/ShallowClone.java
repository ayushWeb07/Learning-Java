package section15;

import org.w3c.dom.ls.LSOutput;

class Exercise {
    private String name;

    public Exercise(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Athlete implements Cloneable {
    private String name;
    private int pr;
    private Exercise favEx;

    public Athlete(String name, int pr, Exercise favEx) {
        this.name= name;
        this.pr= pr;
        this.favEx= favEx;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public Exercise getFavEx() {
        return favEx;
    }

    public void setFavEx(Exercise favEx) {
        this.favEx = favEx;
    }
}

public class ShallowClone {
    public static void main(String[] args) {
        Exercise ex= new Exercise("Deadlifts");

        Athlete r= new Athlete("Rajat", 300, ex);

        try {
            Athlete v= (Athlete) r.clone();
            System.out.println(r == v);
            System.out.println(r.getFavEx() == v.getFavEx());


        } catch (CloneNotSupportedException e) {
            System.out.println("Error: something went wrong while cloning objects");
        }
    }

}
