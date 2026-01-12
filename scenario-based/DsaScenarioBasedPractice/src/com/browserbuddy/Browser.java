package com.browserbuddy;

import java.util.Stack;
import java.util.ArrayList;

class Browser {
    private ArrayList<Tab> openTabs;
    private Stack<Tab> closedTabsStack;

    public Browser() {
        openTabs = new ArrayList<>();
        closedTabsStack = new Stack<>();
    }

    public Tab openTab() {
        Tab tab = new Tab();
        openTabs.add(tab);
        System.out.println("Opened Tab " + tab.getTabId());
        return tab;
    }

    public void closeTab(Tab tab) {
        if (openTabs.remove(tab)) {
            closedTabsStack.push(tab);
            System.out.println("Closed Tab " + tab.getTabId());
        }
    }

    public void restoreTab() {
        if (!closedTabsStack.isEmpty()) {
            Tab tab = closedTabsStack.pop();
            openTabs.add(tab);
            System.out.println("Restored Tab " + tab.getTabId());
        } else {
            System.out.println("No closed tabs to restore");
        }
    }
}

