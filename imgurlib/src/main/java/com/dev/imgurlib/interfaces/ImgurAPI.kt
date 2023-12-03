package com.dev.imgurlib.interfaces

import com.dev.imgurlib.models.GalleryResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ImgurAPI {

    @GET("gallery/{tag}/{sort}/{window}/{page}")
    suspend fun getGalleryByTopImages(
        @Path("tag") tag: String = "top",
        @Path("sort") sortBy: String = "time",
        @Path("window") duration: String = "week",
        @Path("page") pageNum: Int = 1
    ): GalleryResponse

//    @GET("album/{albumHash}")
//    suspend fun getAlbum(
//        @Path("albumHash") albumHash: String
//    ): AlbumResponse

//    @GET("album/{albumHash}/comments")
//    suspend fun getAlbumComments(
//        @Path("albumHash") albumHash: String
//    ): AlbumCommentsResponse
}