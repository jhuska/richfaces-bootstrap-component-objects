package org.richfaces.test.rfbootstrap.components.list;

import java.util.List;

import org.jboss.arquillian.graphene.spi.components.common.Component;

public interface SelectList<T> extends Component {

    /**
     * 
     * @return Returns number of select items which this ordering list has.
     */
    int getNumberOfSelectItems();
    
    /**
     * @return Returns all select items, that is, items which can be selected and then ordered.
     */
    List<SelectableItem<T>> getAllSelectItems();

    /**
     * Returns select item according to the its given index. The items are indexed from 0, and from the top of the ordering
     * list.
     * 
     * @param index index of the select item to be returned
     * @return the select item with given index
     */
    SelectableItem<T> getSelectItem(int index);

    /**
     * @return Returns the first select item, that it is, the top most item in the list.
     */
    SelectableItem<T> getFirstSelectItem();

    /**
     * @return Returns the last select item, that it is, the bottom most item in the list.
     */
    SelectableItem<T> getLastSelectItem();

    /**
     * Selects the given item/s so that they can be ordered. If it is not possible to select more than one item (and more items
     * to select are passed as parameters), exception is thrown.
     * 
     * @param items item to be selected
     * @throws IllegalStateException when there is passed more than one item to select, and ordering list does support multiple
     *         items selecting
     */
    void selectItem(SelectableItem<T>... items);

    /**
     * Selects items according to the given index, so that they can be ordered. If it is not possible to select more than one
     * item (and more than one items to select are passed as parameters), exception is thrown.
     * 
     * @param index index of the item to be selected 
     * @throws IllegalStateException when there is passed more than one item to select,
     *        and ordering list does support multiple items selecting
     */
    void selectItem(int... indexes);

}
