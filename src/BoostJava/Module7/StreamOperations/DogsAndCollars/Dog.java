package BoostJava.Module7.StreamOperations.DogsAndCollars;

public class Dog {
    private String nickname;
    private String breed;
    private Collar collar;

    public Dog() {
    }

    public Dog(String nickname, String breed, Collar collar) {
        this.nickname = nickname;
        this.breed = breed;
        this.collar = collar;
    }

    public Dog(String nickname, String breed) {
        this.nickname = nickname;
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return nickname + ";" + breed + ";" + collar;
    }
}
