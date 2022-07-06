package com.wonmirzo.view

import com.wonmirzo.model.Post

interface MainView {

    fun onPostListSuccess(posts: ArrayList<Post>?)
    fun onPostListFailure(error: String)

    fun onPostDeleteSuccess(post: Post?)
    fun onPostDeleteFailure(error: String)
}