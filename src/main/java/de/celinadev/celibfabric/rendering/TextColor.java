package de.celinadev.celibfabric.rendering;

public class TextColor {

    private int value;

    public TextColor(int r, int g, int b) {
        this(r, g, b, 255);
    }

    public TextColor(int r, int g, int b, int a) {
        this.value = ((a & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8) | ((b & 0xFF));
    }

    public TextColor(int hex) {
        this.value = hex;
    }

    public int getValue() {
        return value;
    }
}