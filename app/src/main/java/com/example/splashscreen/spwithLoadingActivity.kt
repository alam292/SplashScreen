package com.example.splashscreen

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class spwithLoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spwith_loading)

        StartHeavyTask();
    }

    private fun StartHeavyTask() {
        LongOperation().execute()
    }

    private open inner class LongOperation() : AsyncTask<String?, Void?, String?>() {

        override fun doInBackground(vararg params: String?): String? {

            for (i in 0..6) {
                try {
                    Thread.sleep(1000)
                } catch (e: Exception) {
                    Thread.interrupted()
                }
            }
            return "result"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            val intent = Intent(this@spwithLoadingActivity, MainActivity::class.java)

            startActivity(intent)

        }
    }
}