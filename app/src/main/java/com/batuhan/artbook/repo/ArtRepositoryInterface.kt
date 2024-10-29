package com.batuhan.artbook.repo

import androidx.lifecycle.LiveData
import com.batuhan.artbook.model.ImageResponse
import com.batuhan.artbook.roomdb.Art
import com.batuhan.artbook.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art : Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>

}