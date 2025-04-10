/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.taskmanager;

/**
 *
 * @author austo
 */
public class Task {
    private String name;
    private boolean done;
    
    public Task(String name){
        this.name = name;
        this.done = false;
    }
    
    public void markDone(){
        this.done = true;
    }
    
    public String toString(){
        return (done ? "[X] " : "[ ] ") + name;
    }
    
}
