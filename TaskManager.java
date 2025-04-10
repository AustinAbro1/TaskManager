/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskmanager;
import java.util.ArrayList;

/**
 *
 * @author austo
 */
public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();
    
    public void addTask(String name){
        tasks.add(new Task(name));
        System.out.println("Task added!");
    }
    
    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks found");
            return;
        }
        for(int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    
    public void markDone(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).markDone();
            System.out.println("Marked as done!");
        }
        else{
            System.out.println("Inavlid task number.");
        }
    }
    
    public boolean isTaskImportant(String response){
        if(response == "Y"){
            return true;
        }
        else{
            return false;
        }
    }
}
