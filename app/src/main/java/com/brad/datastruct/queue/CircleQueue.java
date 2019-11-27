package com.brad.datastruct.queue;

/**
 * Description: 循环队列
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-25 19:37
 */
public class CircleQueue {
    private String[] items;
    private int capacity;
    private int head;
    private int tail;

    public CircleQueue(int capacity) {
        if (capacity <= 0) {
            capacity = 10;
        }
        this.capacity = capacity;
        items = new String[capacity];
    }

    public boolean enqueue(String item) {
        // 队列满，删除队头
        if ((tail + 1) % capacity == head) {
            dequeue();
        }
        items[tail] = item;
        tail = (tail + 1) % capacity;
        return true;
    }


    public String dequeue() {
        if (isQueueEmpty()) {
            return null;
        }
        String value = items[head];
        head = (head + 1) % capacity;
        return value;
    }

    private boolean isQueueFull() {
        return (tail + 1) % capacity == head;
    }

    private boolean isQueueEmpty() {
        return head == tail;
    }

}
