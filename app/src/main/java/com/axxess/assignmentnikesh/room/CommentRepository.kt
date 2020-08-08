package com.axxess.assignmentnikesh.room

import androidx.lifecycle.LiveData
import com.axxess.assignmentnikesh.network.model.Comment


interface CommentRepository {
    fun findById(id: Int): LiveData<Comment?>?
    fun findAll(imageId: String): LiveData<List<Comment?>?>?
    fun insert(comment: Comment?)
//    fun delete(product: Comment?): Int

}
