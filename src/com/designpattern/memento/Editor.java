package com.designpattern.memento;

public class Editor {
    private String Content;
    private String FontName;
    private int FontSize;

    public EditorState GetEditorState() {
        return new EditorState(this.Content, this.FontName, this.FontSize);
    }

    public void Restore(EditorState editorState) {
        this.Content = editorState.getContent();
        this.FontName = editorState.getFontName();
        this.FontSize = editorState.getFontSize();
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getFontName() {
        return FontName;
    }

    public void setFontName(String fontName) {
        FontName = fontName;
    }

    public int getFontSize() {
        return FontSize;
    }

    public void setFontSize(int fontSize) {
        FontSize = fontSize;
    }
}
