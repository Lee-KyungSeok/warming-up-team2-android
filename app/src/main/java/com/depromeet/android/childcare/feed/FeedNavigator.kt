package com.depromeet.android.childcare.feed

interface FeedNavigator {
    fun showOptionDialog(feedId: Int)
    fun goFeedPictureActivity(imgUrl: String)
}