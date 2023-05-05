package com.onlineshop.app.app.app_webapi

import com.onlineshop.app.app.app_models.AppSignUpModel
import com.onlineshop.app.app.app_webapiresponse.AppSignUpResponse
import com.onlineshop.app.app.app_webapiresponse.AppSpecificItemResponse
import com.onlineshop.app.app.app_webapiresponse.AppUserSignUpResponse
import retrofit2.Call
import retrofit2.http.*

interface WebApiInterface {
    companion object {
        const val BASE_URL: String = "https://fakestoreapi.com"
    }

    @POST("/users")
    fun signUpUser(@Body signUpModel: AppSignUpModel):Call<AppUserSignUpResponse>
    @GET("/products/categories")
    fun getProductCategories():Call<MutableList<String>>
    @GET("/products/category/" +
            "{specific}")
    fun getProductCategoriesSpecific(@Path("specific")  specific:String):Call<MutableList<AppSpecificItemResponse>>
    @FormUrlEncoded
    @POST("/auth/login")
    fun loginUser(@Field("username") username:String,@Field("password") password:String):Call<AppSignUpResponse>
}