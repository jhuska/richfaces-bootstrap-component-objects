package org.richfaces.test.rfbootstrap.components.api.panel;

import java.util.List;

import org.jboss.arquillian.graphene.component.object.api.common.ComponentsContainer;

public interface Tabbable {

    /**
     * Returns all tabs.
     * 
     * @return
     */
    List<ComponentsContainer> getAllTabs();

    /**
     * Returns the tab with given index.
     * 
     * @param index index of the tab to return, note that tabs are indexed from 0
     * @return
     */
    ComponentsContainer getTab(int index);

    /**
     * Goes to the given tab, that is, the given tab will be active after calling this method.
     * 
     * @param tab the tab to become active
     */
    void gotoTab(ComponentsContainer tab);

    /**
     * Goes to the tab of given index, that is the tab of given index will be active after calling this method.
     * 
     * @param tabIndex the index of the tab to become active, note that tabs are indexed from 0.
     */
    void gotoTab(int tabIndex);

    /**
     * Returns the active tab of the TabAble component. That is the tab which it is toggled on.
     * 
     * @return
     */
    ComponentsContainer getActiveTab();
}
