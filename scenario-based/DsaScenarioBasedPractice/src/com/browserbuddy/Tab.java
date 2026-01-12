package com.browserbuddy;

class Tab {
    private static int counter = 1;
    private int tabId;
    private BrowserHistory history;

    public Tab() {
        this.tabId = counter++;
        this.history = new BrowserHistory();
    }

    public int getTabId() {
        return tabId;
    }

    public void visitPage(String url) {
        history.addPage(url);
        System.out.println("Tab " + tabId + " visiting: " + url);
    }

    public void back() {
        System.out.println("Tab " + tabId + " back to: " + history.goBack());
    }

    public void forward() {
        System.out.println("Tab " + tabId + " forward to: " + history.goForward());
    }

    public void showCurrentPage() {
        System.out.println("Tab " + tabId + " current page: " + history.getCurrentPage());
    }
}
