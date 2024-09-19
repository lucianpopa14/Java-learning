package src.main.mooc.part6.todolist;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }
    public void print(){
        for(String str:list){
            int index = list.indexOf(str);
            System.out.println(index+1+": "+str);
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }

}
