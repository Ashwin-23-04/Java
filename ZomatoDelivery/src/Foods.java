public class Foods {
    private String name ;

    Foods(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void displayFood(){
        System.out.println(name);
    }
}
