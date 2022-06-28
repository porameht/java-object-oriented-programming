abstract class SuperHero implements SkillHero,Nation{
    private String name;
    private String age;
    private String job;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public abstract void skill(String skill);


    public void dispalyHero(){
        System.out.println("Name = "+this.name+"\nAge = "+this.age);
    }
}
