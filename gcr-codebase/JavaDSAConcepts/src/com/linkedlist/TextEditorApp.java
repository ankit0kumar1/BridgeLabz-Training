package com.linkedlist;

public class TextEditorApp {
    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Welcome");

        editor.displayCurrentState();

        System.out.println("\nUndo:");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nUndo:");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nRedo:");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("\nNew Edit (Redo history cleared):");
        editor.addState("Hello World!!");
        editor.displayCurrentState();

        System.out.println("\nHistory Snapshot:");
        editor.displayHistoryForward();
    }
}

