package com.axxess.assignmentnikesh.room

import androidx.lifecycle.LiveData
import com.axxess.assignmentnikesh.network.model.Comment

import javax.inject.Inject


class CommentDataSource @Inject constructor(private val commentDao: CommentDao?) :
    CommentRepository {

    override fun findById(id: Int): LiveData<Comment?>? {
        return commentDao?.findById(id)
    }

    override fun findAll(imageId: String): LiveData<List<Comment?>?>? {
        return commentDao?.findAll(imageId)
    }

    override fun insert(comment: Comment?) {
        commentDao?.insert(comment)!!
    }

}