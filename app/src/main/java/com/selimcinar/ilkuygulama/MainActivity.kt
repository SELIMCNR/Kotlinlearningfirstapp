package com.selimcinar.ilkuygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Degistir(view: View){
        textView3.text = "        var değişken tanımlamada kullanılan tanım" +
                "        var a = 5" +
                "        val sabit tanımlamada kullanılan tanım" +
                "        val x = 10" +
                "        Kotlin Veri tipleri" +
                "        Numbers veri tipleri" +
                "            Byte  :  8 bit -128 , 127" +
                "           Short : 16 bit -32768 ,32767" +
                "           Int   : 32 bit -2,147,483,648  ve + 2,147,483,647" +
                "           Long  : 64 bit -9,223,372,036,854,775,808 ve + lısıs" +
                "         " +
                "        Hem tanım hem değer verme" +
                "        var yeniInteger : Int = 20" +
                "        Ondalıklı sayılar Double & float" +
                "        * Float : 32 bit  3.612345" +
                "        * Double : 64 bit 3.1546458761347541" +
                "        val pi2 = 3.14\n" +
                "        println(pi2 * 2)\n" +
                "        val floatPi : Float = 3.14f\n" +
                "        println(floatPi * 2 )\n" +
                "        val yeniDouble = 5.0\n" +
                "        println(yeniDouble / 2)\n" + "" +
                "String yazı metin veri tipi " +
                "" +
                "        println(\"-------String metin veri tipi ------\")\n" +
                "" +
                "        val benimString = \"Benim yeni metnim\"\n"

    }
    fun bilgi (view: View) {
        textView3.text = "Boolean doğrumu  yanlışmı True or false" +
                "        println(\"-------Boolean--------\")" +
                "        var benimBoolean = true" +
                "        benimBoolean = false" +
                "        * < -> Küçüktür" +
                "        * > -> Büyüktür" +
                "        * == -> eşittir" +
                "        * != -> eşit değildir" +
                "        * <= -> küçük eşittir" +
                "        * >= -> büyük eşittir" +
                "        * && -> ve" +
                "        * || -> veya"
                "        println(3 < 5)" +
                "        println(4!=4)" +
                        "        println(\"--------Dönüştürme------\")" +
                        "        var benimInt = 10\n" +
                        "        var benimLongaCevrilenInt =  benimInt.toLong() //Integer değeri londa çevirdi" +
                        "        println(benimLongaCevrilenInt)" +
                        "        var kullaniciGirdisi = \"50\"" +
                        "        var kullaniciInt = kullaniciGirdisi.toInt() // String değeri ıntegere dönüştürdü" +
                        "        println(kullaniciInt / 2 )"
    }
}