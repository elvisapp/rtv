package com.rtv.providers;

import com.rtv.models.FCMBody;
import com.rtv.models.FCMResponse;
import com.rtv.retrofit.IFCMApi;
import com.rtv.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
