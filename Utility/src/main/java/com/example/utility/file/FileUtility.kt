package com.example.utility.file

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.jvm.Throws

object FileUtility {

    @Throws(IOException::class)
    fun readInputStream(inputStream: InputStream): String {
        val inputStreamReader = InputStreamReader(inputStream)
        val reader = BufferedReader(inputStreamReader)
        val text = StringBuilder()
        var line = reader.readLine()
        while (line != null) {
            text.append(line)
            line = reader.readLine()
        }
        reader.close()
        return text.toString()
    }

}