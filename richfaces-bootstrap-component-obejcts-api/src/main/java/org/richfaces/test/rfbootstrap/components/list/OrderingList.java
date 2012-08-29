package org.richfaces.test.rfbootstrap.components.list;

import org.jboss.arquillian.graphene.spi.components.common.Component;

public interface OrderingList<T> extends Component {

    /**
     * 
     * @return Returns the select items list of this ordering list.
     */
    SelectItems<T> getSelectItems();

    /**
     * Goes up by one position with given item/s.
     * 
     * @param items select item/s to go up by one position with
     * @throws IllegalArgumentException when any of the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goUp(SelectableItem<T>... items);

    /**
     * Goes up by one position with item/s of given index/es.
     * 
     * @param indexesOfSelectItems index/es of select item/s to go up by one position with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goUp(int... indexesOfSelectItems);

    /**
     * Goes down by one position with given item/s.
     * 
     * @param items select item/s to go down by one position with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goDown(SelectableItem<T>... item);

    /**
     * Goes down by one position with item/s of given index/es.
     * 
     * @param indexOfSelectItems index/ex of select item/s to go up by one position with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goDown(int... indexOfSelectItems);

    /**
     * Goes to the bottom of the list with given item/s.
     * 
     * @param items select item/s to go to the bottom of the list with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goLast(SelectableItem<T>... items);

    /**
     * Goes to the bottom of the list with item/s of given index/es.
     * 
     * @param indexOfSelectItems index/es of select item/s to go to the bottom of the list with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goLast(int... indexOfSelectItems);

    /**
     * Goes to the top of the list with given item/s.
     * 
     * @param items select item/s to go to the top of the list with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goFirst(SelectableItem<T>... items);

    /**
     * Goes to the top of the list with item/s of given index/es.
     * 
     * @param indexOfSelectItems index/es of select item/es to go to the top of the list with
     * @throws IllegalArgumentException when the given item/s is not in the select items anymore
     * @throws IllegalStateException when invoking with no parameters and simultaneously no items are selected
     */
    void goFirst(int... indexOfSelectItems);
}
