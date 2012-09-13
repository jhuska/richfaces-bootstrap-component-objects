package org.richfaces.test.rfbootstrap.components.ftest.panel;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.testng.Arquillian;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.richfaces.test.rfbootstrap.components.impl.panel.TabbableRFBootstrap;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTabbable extends Arquillian {

    @FindBy(css = "div[@class='tabbable']:nth-of-type(2)")
    private TabbableRFBootstrap tabbable;

    @FindBy(css = "div[@class='tabbable']:nth-of-type(2) ul li")
    private List<WebElement> tabs;

    private final String TAB_0_CONTENT = "I'm in Section 1";
    private final String TAB_1_CONTENT = "Howdy, I'm in Section 2.";
    private final String TAB_2_CONTENT = "Howdy, I'm in Section 3.";
    private final String TAB_3_CONTENT = "Howdy, I'm in Section 4.";

    @Drone
    protected WebDriver driver;

    @BeforeMethod
    public void loadPage() {
        driver.get("http://bootstrap-richfaces.rhcloud.com/component/tabbable/index.jsf");
    }

    @Test
    public void testTabbableGottoTab() {
        int tab = 1;
        
        tabbable.gotoTab(tab);
        assertEquals(tabs.get(tab).getText(), TAB_1_CONTENT, "The tab panel was not toggled to " + tab + 1 + " tab correctly!");
        
        tab++;
        tabbable.gotoTab(tab);
        assertEquals(tabs.get(tab).getText(), TAB_2_CONTENT, "The tab panel was not toggled to " + tab + 1 + " tab correctly!");
        
        tab++;
        tabbable.gotoTab(tab);
        assertEquals(tabs.get(tab).getText(), TAB_3_CONTENT, "The tab panel was not toggled to " + tab + 1 + " tab correctly!");
        
        tab = 0;
        tabbable.gotoTab(tab);
        assertEquals(tabs.get(tab).getText(), TAB_0_CONTENT, "The tab panel was not toggled to " + tab + 1 + " tab correctly!");
    }
}
