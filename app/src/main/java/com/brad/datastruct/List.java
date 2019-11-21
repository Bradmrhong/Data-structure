package com.brad.datastruct;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2019-11-20 17:57
 */
public interface List<E> {
    void add(E e);

    void insertBefore(int index, E e);

    void insertAfter(int index, E e);

    void remove(E e);

    int size();

    E get(int index);

    void reverse();

}
