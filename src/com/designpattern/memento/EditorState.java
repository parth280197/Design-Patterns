package com.designpattern.memento;

public class EditorState {
    private final String Content;
    private final String FontName;
    private final int FontSize;

    public EditorState(String content, String fontName, int fontSize) {
        Content = content;
        FontName = fontName;
        FontSize = fontSize;
    }

    public String getContent() {
        return Content;
    }

    public String getFontName() {
        return FontName;
    }

    public int getFontSize() {
        return FontSize;
    }
}
