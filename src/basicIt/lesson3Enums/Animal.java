package basicIt.lesson3Enums;

public enum Animal {
    DOG("sobaka"), CAT("koshka"), FROG("liagushka");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "perevod na russki yazik " + translation;
    }
}
