package com.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> history = new ArrayList<EditorState>();

    public EditorState pop() {
        var lastIndex = history.size() - 1;
        var lastState = history.get(lastIndex);

        if(lastIndex > 0) {
            history.remove(lastState);
        }

        return lastState;
    }

    public void push(EditorState editorState) {
        history.add(editorState);
    }
}
