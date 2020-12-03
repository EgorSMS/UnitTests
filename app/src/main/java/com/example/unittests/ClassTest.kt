package com.example.unittests

import android.util.Log
import okhttp3.*
import org.json.JSONObject
import retrofit2.Call;
import retrofit2.http.GET;
import java.io.IOException


class ClassTest {
    fun sum(x: Int, y: Int) : Int {
        return x+y
    }

    fun getResponce(URL: String) : String? {
        val request = Request.Builder().url(URL).build()
        var _response: String? = null
        _response = OkHttpClient().newCall(request).execute().body()!!.string()
        return if (_response.trim() == "")
            null
        else
            _response
    }
}