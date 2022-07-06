package com.wonmirzo.presenter

import com.wonmirzo.model.Post

interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}