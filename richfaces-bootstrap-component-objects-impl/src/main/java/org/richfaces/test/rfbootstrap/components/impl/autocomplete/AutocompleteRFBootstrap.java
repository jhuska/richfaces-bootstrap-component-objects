package org.richfaces.test.rfbootstrap.components.impl.autocomplete;

import java.util.List;

import org.jboss.arquillian.graphene.component.object.api.autocomplete.AutocompleteComponent;
import org.jboss.arquillian.graphene.component.object.api.autocomplete.ClearType;
import org.jboss.arquillian.graphene.component.object.api.autocomplete.Suggestion;
import org.jboss.arquillian.graphene.component.object.api.autocomplete.SuggestionParser;
import org.jboss.arquillian.graphene.component.object.api.scrolling.ScrollingType;
import org.jboss.arquillian.graphene.spi.annotations.Root;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompleteRFBootstrap<T> implements AutocompleteComponent<T> {

    @Root
    private WebElement root;
    
    public boolean areSuggestionsAvailable() {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear(ClearType... clearType) {
        // TODO Auto-generated method stub
        
    }

    public void finish() {
        // TODO Auto-generated method stub
        
    }

    public List<Suggestion<T>> getAllSuggestions() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Suggestion<T>> getSelectedSuggestions() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getInputValues() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getInputValue() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getFirstInputValue() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setSeparator(String regex) {
        // TODO Auto-generated method stub
        
    }

    public void setSuggestionParser(SuggestionParser<T> parser) {
        // TODO Auto-generated method stub
        
    }

    public List<Suggestion<T>> getFirstNSuggestions(int n) {
        // TODO Auto-generated method stub
        return null;
    }

    public Suggestion<T> getFirstSuggestion() {
        // TODO Auto-generated method stub
        return null;
    }

    public Suggestion<T> getNthSuggestion(int order) {
        // TODO Auto-generated method stub
        return null;
    }

    public void type(String value) {
        // TODO Auto-generated method stub
        
    }

    public List<Suggestion<T>> typeAndReturn(String value) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean autocompleteWithSuggestion(Suggestion<T> sugg) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean autocompleteWithSuggestion(Suggestion<T> sugg, ScrollingType scrollingType) {
        // TODO Auto-generated method stub
        return false;
    }

    public WebElement getRoot() {
        return root;
    }

    public void setRoot(WebElement root) {
        this.root = root;
    }

}
