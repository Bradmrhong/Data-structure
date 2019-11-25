package com.brad.datastruct.queue;

/**
 * Description: 数组队列，队列假满的时候自动偏移
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 18:31
 */
public class ArrayQueue {

    private int[] items;
    private int capacity;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int size) {
        items = new int[size];
        capacity = size;
    }


    public void enqueue(int item) {
        if (tail == capacity) {
            // 队列满
            if (head == 0) {
                dequeue();
                items[tail] = item;
            } else {    // 数据迁移
                for (int i = 0; i < head; i++) {
                    items[i] = items[head+i];
                }
                tail -= head;
                head = 0;
                items[tail++] = item;
            }
        } else {
            items[tail++] = item;
        }
    }

    public int dequeue() {
        // 队列空
        if (tail == capacity) {
            return -1;
        }
        return items[head++];
    }



}
