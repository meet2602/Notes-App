package com.materialsouk.notesapp.listeners;

import com.materialsouk.notesapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
