package nick.pack;


public class Note {
    private String name;
    private int index;

    public Note(String name, int index){
        this.name = name;
        this.index = index;
    }
    public String getName(){
        return name;
    }
    public int getIndex(){
        return index;
    }
}
