public abstract class Skills {
    protected String name;

    public Skills(String name) {
        this.name = name;
    }

    //Overriding spell names to make them more readable
    @Override
    public String toString() {
        return name;
    }

    //Allows spells to be used
    public abstract void use();

}
