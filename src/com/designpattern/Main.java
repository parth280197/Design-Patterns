package com.designpattern;

import com.designpattern.memento.Editor;
import com.designpattern.memento.History;

public class Main {

    public static void main(String[] args) {
        memento();
    }

    public static void memento() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("firstContent");
        editor.setFontName("Arial");
        editor.setFontSize(12);

        history.push(editor.GetEditorState());

        editor.setContent("secondContent");
        editor.setFontName("Arial");
        editor.setFontSize(12);

        history.push(editor.GetEditorState());

        editor.setContent("thirdContent");
        editor.setFontName("Arial");
        editor.setFontSize(12);

        history.push(editor.GetEditorState());

        editor.Restore(history.pop());
        editor.Restore(history.pop());
        editor.Restore(history.pop());

        System.out.println(editor.getContent());
        System.out.println(editor.getFontName());
        System.out.println(editor.getFontSize());
    }
}
