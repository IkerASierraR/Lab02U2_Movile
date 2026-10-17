package com.example.deviceretrofitsierra.service

import com.example.deviceretrofitsierra.data.Constants
import com.example.deviceretrofitsierra.data.DeleteResponse
import com.example.deviceretrofitsierra.data.Device
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DeviceService {

    @GET(Constants.OBJECTS_PATH)
    suspend fun getAllDevices() : List<Device>

    @POST(Constants.OBJECTS_PATH)
    suspend fun postDevice(@Body device: Device): Device

    @DELETE(Constants.OBJECTS_ID_PATH)
    suspend fun deleteDevice(@Path("id") id: String): DeleteResponse

}