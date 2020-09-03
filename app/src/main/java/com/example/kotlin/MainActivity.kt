package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonnumbersList.setOnClickListener { textView.text = filterNumberList(numbersList).toString() }

        buttonnumbersMap.setOnClickListener { textView.text = filterNumberMap(numbersMaps).toString()}

        //buttoninstanceList.setOnClickListener { textView.text = filterInstanceList(instanceList as List<String?>).toString() }

        buttonunsortedList.setOnClickListener { textView.text = filterUnsortedList(unsortedList).toString() }


    }

    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)


    fun filterNumberList(numberList : List<String>): List<String>{
        return numberList.filter { it.startsWith("t") }
    }
    private val numbersMaps: kotlin.collections.Map<String, Int> = numbersMap

    fun  filterNumberMap(keyId: kotlin.collections.Map<String, Int>){

        if (numbersMaps.containsKey("Key1")){
            false
        }
    }

    fun  filterUnsortedList(unsortedList: List<Int>): List<Int> {
        return unsortedList.sorted()
    }

//    fun filterInstanceList(instanceList: List<String?>): List<String?> {
//            return listOf(instanceList.find { it.contains("o")})
//
//    }


}