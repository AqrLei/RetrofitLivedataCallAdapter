package com.aqrlei.open.retrofitlivedatacalladapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aqrlei.open.retrofitlivedatacalladapter.retrofitStudy.Calculate
import com.aqrlei.open.retrofitlivedatacalladapter.retrofitStudy.Calculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val proxyTest = Calculator.create(Calculate::class.java)
        contentTv.setOnClickListener {
            ArticleRepository().fetchPhoneInfo("405", "1").observe { data ->
                contentTv.append("\nOBSERVER")
                contentTv.append("\nisSuccess: ${data?.isSuccess}")
                contentTv.append("\ncurPage: ${data?.response?.data?.curPage}")
                contentTv.append("\noffset: ${data?.response?.data?.offset}")
                contentTv.append("\nover: ${data?.response?.data?.over}")
                contentTv.append("\npageCount: ${data?.response?.data?.pageCount}")
                contentTv.append("\nsize: ${data?.response?.data?.size}")
                contentTv.append("\ntotal: ${data?.response?.data?.total}")
                contentTv.append("\nerrorCode: ${data?.response?.errorCode}")
                contentTv.append("\nerrorMsg: ${data?.response?.errorMsg}")
                contentTv.append("\n${data?.error?.message}")
                proxyTest.add(0, 0)
            }
        }
    }
}
