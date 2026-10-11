import java.util.ArrayList;
public class Todo{
    public static void main(String[] args){
        ArrayList<String> todoList=new ArrayList<String>();
        todoList.add("BUY MILK");
        todoList.add("Buy Eggs");
        todoList.add("Buy Bread");
        for(String item:todoList){
            System.out.println(item);
        }
    }
}