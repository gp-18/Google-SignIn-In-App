package com.example.checkify

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    val allNote:LiveData<List<Note>>
    init {
        val dao=NoteDatabase.getDatabase(application).getNoteDao()
        val repository=NoteRepository(dao)
        allNote=repository.allNotes
    }
}