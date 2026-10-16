package com.example.deviceretrofitsierra.service

import com.example.deviceretrofitsierra.data.Constants
import com.example.deviceretrofitsierra.data.Device
import retrofit2.http.GET

interface DeviceService {

    @GET(Constants.OBJECTS_PATH)
    suspend fun getAllDevices() : List<Device>


}