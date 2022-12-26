package com.headyapps.cleanarchitecturenoteapp.feature_note.data.repository

import com.headyapps.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.headyapps.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.headyapps.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl (
    private val dao: NoteDao
) : NoteRepository{
    //get all notes
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }
    //get a note by id
    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }
    //insert a note
    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }
    //delete a note
    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}