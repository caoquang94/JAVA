package CleanCode.baitap;

public class Pokemon {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String name;
    public String color;
    public int age;
    public String element;
    public Pokemon(){
    }
    public Pokemon(String name, String color, int age, String element){
        this.name = name;
        this.color = color;
        this.age = age;
        this.element = element;
    }
    public String Skill(){
        return "fire";
    }

}
