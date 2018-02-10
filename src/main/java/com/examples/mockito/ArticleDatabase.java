package com.examples.mockito;

public class ArticleDatabase {

    private ArticleListener articleListener;

    public ArticleListener getListener() {
        return articleListener;
    }

    public void addListener(ArticleListener articleListener) {
        this.articleListener = articleListener;
    }

    public int find(int i) { return 123; }
}
