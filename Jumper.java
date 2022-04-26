
import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/comparator-interface-java/
//Website above might hold the answer, comparator interface looks like what is needed here. 

//Build the main class here, than use other classes to do necessary operations needed. 

public class Jumper{
    
    public String name;
    public int score; 
    private ArrayList<String> items; 
    
   
    
    public Jumper() {
        this.name = name;
        this.score = score; 
        this.items = new ArrayList();
    }
    
    public void addJumper(String name){
        items.add(name);
    }
    
    public void showJumpers(){
        for(String s: items){
            System.out.println(s);
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName; 
    }

   
    @Override
    public String toString() {
        return this.name + this.score; 
    }

    
}
