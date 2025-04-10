package com.mycompany.taskmanager;

public class ImportantTask extends Task {
    private int priorityNumber;

    public ImportantTask(String name, int priorityNumber) {
        super(name); // call Task constructor
        this.priorityNumber = priorityNumber;
    }

    public void setPriority(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public int getPriority() {
        return priorityNumber;
    }

    @Override
    public String toString() {
        return "[IMPORTANT - Priority " + priorityNumber + "] " + super.toString();
    }
}
