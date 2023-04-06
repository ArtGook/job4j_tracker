package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int counter = 0;
        Item[] rsl = new Item[items.length];
        if (key != null) {
            for (int i = 0; i < size; i++) {
                if (items[i].getName().equals(key)) {
                    rsl[counter] = items[i];
                    counter++;
                }
            }
        } else {
            System.out.println("Error");
        }
        return Arrays.copyOf(rsl, counter);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        if (id >= 0) {
            for (int index = 0; index < size; index++) {
                if (items[index].getId() == id) {
                    rsl = index;
                    break;
                }
            }
        } else {
            System.out.println("Error");
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if (id >= 0) {
            int index = indexOf(id);
            if (index != -1) {
                item.setId(id);
                items[index] = item;
                rsl = true;
            }
        } else {
            System.out.println("Error");
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        if (id >= 0) {
            int index = indexOf(id);
            int start = index + 1;
            int distPos = index;
            int length = size - index - 1;
            if (index != -1) {
                System.arraycopy(items, start, items, distPos, length);
                items[size - 1] = null;
                size--;
                rsl = true;
            } else {
                System.out.println("Error");
            }
        }
        return rsl;
    }
}