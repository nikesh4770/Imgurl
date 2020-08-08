package com.axxess.assignmentnikesh.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.axxess.assignmentnikesh.network.model.Comment

@Dao
interface CommentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCommentList(comments: ArrayList<Comment>)

    @Query("SELECT * FROM Comment WHERE id = :id_")
    fun getComment(id_: Int): Comment

    @Query("SELECT * FROM Comment WHERE id=:id")
    fun findById(id: Int): LiveData<Comment?>?

    @Query("SELECT * FROM Comment WHERE imageId=:imageId")
    fun findAll(imageId: String): LiveData<List<Comment?>?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(comment: Comment?)

    @Delete
    fun delete(comment: Comment?)
}
