package com.piatsevich.model;

public abstract class GeneralBall {

    private int size;

    private Color color;

    public GeneralBall(int size, Color color) {
        this.size = size;
        this.color = color;
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
        return "GeneralBall{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralBall that = (GeneralBall) o;

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
