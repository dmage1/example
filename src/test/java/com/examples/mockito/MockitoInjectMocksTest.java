package com.examples.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MockitoInjectMocksTest {

    @Mock User user;
    @Mock ArticleDatabase database;

    @Spy
    private ArticleListener ArticleListener = new ArticleListener();

    @InjectMocks
    private ArticleManager manager;

    @Test
    public void shouldDoSomething() {
        // calls addListener with an instance of ArticleListener
        manager.initialize();

        // validate that addListener was called
        verify(database).addListener(any(ArticleListener.class));
    }

}
