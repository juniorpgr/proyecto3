package com.junior.EXC2.data.retrofit.repository
import com.junior.EXC2.data.retrofit.RetrofitHelp
import com.junior.EXC2.data.retrofit.response.ListCinenoteResponse
import com.junior.EXC2.model.Cinenote


class CinenoteRepository {

    suspend fun getNotes(): CineNoteServiceResult<ListCinenoteResponse>{
        return try {
            val response = RetrofitHelp.cinenoteService.getAllNotes()
            CineNoteServiceResult.Success(response)
        }catch (e: Exception){
            CineNoteServiceResult.Error(e)
        }
    }
}