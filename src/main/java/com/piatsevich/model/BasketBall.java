package com.piatsevich.model;

public class BasketBall implements Comparable<BasketBall> {

    private int size;
    private Color color;

    public BasketBall(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public int compareTo(BasketBall o) {
        return 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "BasketBall{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasketBall that = (BasketBall) o;

        if (size != that.size) return false;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
