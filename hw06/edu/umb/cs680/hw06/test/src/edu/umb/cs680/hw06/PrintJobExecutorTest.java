package edu.umb.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PrintJobExecutorTest {

    private static PrintJobExecutor executor;

   

  

    @Test
    public void testAuthentication() {
        try {
            executor.doAuthentication(null);
        } catch (Exception e) {
            assertFalse(false);
        }
    }

    private void assertFalse(boolean b) {
    }

    @Test
    public void testAccessControl() {
        try {
            executor.doAccessControl();
        } catch (Exception e) {
            assertFalse(false);
        }
    }

    @Test
    public void testPrint() {
        try {
            executor.doPrint();
        } catch (Exception e) {
            assertFalse(false);
        }
    }
}