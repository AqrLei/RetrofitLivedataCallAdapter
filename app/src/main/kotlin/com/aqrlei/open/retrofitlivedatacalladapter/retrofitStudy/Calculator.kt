package com.aqrlei.open.retrofitlivedatacalladapter.retrofitStudy

import android.util.Log
import java.lang.reflect.Proxy

/**
 * @author aqrlei on 2019/1/10
 */
object Calculator {

    fun <T> create(service: Class<T>): T {
        return Proxy.newProxyInstance(
            service.classLoader, arrayOf<Class<*>>(service)
        ) { proxy, method, args ->
            Log.d("Retrofit", "Proxy Test")
        } as T
    }
}