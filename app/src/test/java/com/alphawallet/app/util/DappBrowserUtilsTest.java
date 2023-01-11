package com.alphawallet.app.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DappBrowserUtilsTest
{
    @Test
    public void testDefaultDapp()
    {
        assertThat(DappBrowserUtils.defaultDapp(1L), equalTo("https://welcome.mimi.money/"));
        assertThat(DappBrowserUtils.defaultDapp(137L), equalTo("https://welcome.mimi.money/"));
        assertThat(DappBrowserUtils.defaultDapp(80001L), equalTo("https://welcome.mimi.money/"));
    }

    @Test
    public void testIsDefaultDapp()
    {
        assertTrue(DappBrowserUtils.isDefaultDapp("https://welcome.mimi.money/"));
        assertTrue(DappBrowserUtils.isDefaultDapp("https://welcome.mimi.money/"));
        assertFalse(DappBrowserUtils.isDefaultDapp("https://welcome.mimi.money/"));
    }

    @Test
    public void testIsWithinHomePage()
    {
        assertTrue(DappBrowserUtils.isWithinHomePage("https://welcome.mimi.money/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://welcome.mimi.money/"));
        assertTrue(DappBrowserUtils.isWithinHomePage("https://welcome.mimi.money/"));
        assertFalse(DappBrowserUtils.isWithinHomePage("https://welcome.mimi.money/"));
    }
}