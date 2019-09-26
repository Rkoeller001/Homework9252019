package ClassLecture1;

public class Person {
    private String name;
    protected char sex;
    private String pronoun;

    public Person(String name){
        this.name = name;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

