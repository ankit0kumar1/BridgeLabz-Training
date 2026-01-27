package com.junitpractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import static org.junit.jupiter.api.Assertions.*;

class TaskRunnerTest {

    @Test
    @Timeout(2) // test fails if it runs more than 2 seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        TaskRunner runner = new TaskRunner();
        String result = runner.longRunningTask();
        assertEquals("Done", result);
    }
}
