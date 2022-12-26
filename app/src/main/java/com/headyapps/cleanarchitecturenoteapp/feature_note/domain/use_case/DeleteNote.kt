package com.headyapps.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.headyapps.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.headyapps.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository


// use case for deleting a note
class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}