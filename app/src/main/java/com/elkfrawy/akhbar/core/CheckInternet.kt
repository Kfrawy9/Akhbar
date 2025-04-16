package com.elkfrawy.akhbar.core

import java.io.IOException
import java.net.InetSocketAddress
import java.net.Socket

class CheckInternet {

    fun online():Boolean{

        return try {

            val socket = Socket()
            socket.connect(InetSocketAddress("8.8.8.8", 53), 1500)
            socket.close()

            true
        }catch (e: IOException){
            false
        }



    }


}