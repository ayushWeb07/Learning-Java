package section15;

class InstaProfile implements Cloneable {
    private String id;

    public InstaProfile(String id) {
        this.id= id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Friend implements Cloneable {
    private String name;
    private InstaProfile profile;

    public Friend(String name, InstaProfile profile) {
        this.name= name;
        this.profile= profile;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstaProfile getProfile() {
        return this.profile;
    }

    public void setProfile(InstaProfile profile) {
        this.profile = profile;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Friend clonedFriend= (Friend) super.clone();
        InstaProfile clonedProfile= (InstaProfile) this.getProfile().clone();
        clonedFriend.setProfile(clonedProfile);
        return clonedFriend;
    }

}

public class DeepClone {
    public static void main(String[] args) {
        InstaProfile p= new InstaProfile("mini_dooky");

        Friend f= new Friend("Aditi", p);

        try {
            Friend cF= (Friend) f.clone();
            System.out.println(f == cF);
            System.out.println(f.getProfile() == cF.getProfile());

        } catch (CloneNotSupportedException e) {
            System.out.println("Error: something went wrong while cloning objects");
        }
    }
}
