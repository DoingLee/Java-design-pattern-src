/* Generated by Together */

package com.javapatterns.command.drawapplet;

public interface Command {
    abstract public void        execute();
    abstract public void        unexecute();
    abstract public boolean canExecute();
    abstract public boolean canUnexecute();
}

