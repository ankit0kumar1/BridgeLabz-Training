package com.browserbuddy;

public class BrowserBuddyApp {
    public static void main(String[] args) {
        Browser browser = new Browser();

        Tab tab1 = browser.openTab();
        tab1.visitPage("google.com");
        tab1.visitPage("github.com");
        tab1.visitPage("stackoverflow.com");

        tab1.back();
        tab1.back();
        tab1.forward();
        tab1.showCurrentPage();

        browser.closeTab(tab1);
        browser.restoreTab();
    }
}
