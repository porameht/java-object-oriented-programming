package Abstract;
abstract class Student {
    private String id;
    private String name;

    public abstract void register();
    public abstract void preTest();
    public abstract void postTest();
    
    public void setID(String id)
    {
        this.id = id;
    }


    
}
