package com.example.andriodytplayer.data

import com.example.andriodytplayer.data.Item

data class PlayListItemsResponse(
    val etag: String,
    val items: List<Item>,
    val kind: String,
//    val pageInfo: PdfDocument.PageInfo
)