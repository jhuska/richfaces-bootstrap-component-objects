package org.richfaces.test.rfbootstrap.components.impl.panel;

import java.util.List;

import org.richfaces.test.rfbootstrap.components.api.panel.Tabbable;
import org.jboss.arquillian.graphene.component.object.api.common.ComponentsContainer;
import org.jboss.arquillian.graphene.spi.annotations.Root;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabbableRFBootstrap implements Tabbable {

    @Root
    private WebElement root;
    
    @FindBy
    private List<WebElement> tabs;

    public List<ComponentsContainer> getAllTabs() {
        // TODO Auto-generated method stub
        return null;
    }

    public ComponentsContainer getTab(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public void gotoTab(ComponentsContainer tab) {
        // TODO Auto-generated method stub
        
    }

    public void gotoTab(int tabIndex) {
        // TODO Auto-generated method stub
        
    }

    public ComponentsContainer getActiveTab() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public WebElement getRoot() {
        return root;
    }

    public void setRoot(WebElement root) {
        this.root = root;
    }
    
    public List<WebElement> getTabs() {
        return tabs;
    }

    public void setTabs(List<WebElement> tabs) {
        this.tabs = tabs;
    }
}
