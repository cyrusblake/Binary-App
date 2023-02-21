package com.example.binary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button / finding button
        val showButton = findViewById<Button>(R.id.showInput)

        // setting on Click Listener
        showButton.setOnClickListener { binary() }

    }

    fun binary() {

        // the edit text input
        val editText = findViewById<EditText>(R.id.editText)

        // the text
        val theTextView = findViewById<TextView>(R.id.textView)

        // enter a letter text
        val theTextView2 = findViewById<TextView>(R.id.textView2)

        // letter / image view
        val Aletter: ImageView = findViewById<ImageView>(R.id.imageView)


        //Toast.makeText(this, text, Toast.LENGTH_SHORT) //.show()

        var lCase =  arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        )

        var uCase = arrayOf(
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        )

        var ASC1 = arrayOf(
            "097", "098", "099", "100", "101", "102", "103", "104", "105",
            "106", "107", "108", "109", "110", "111", "112", "113", "114",
            "115", "116", "117", "118", "119", "120", "121", "122"
        )

        var ASC2 = arrayOf(
            "065", "066", "067", "068", "069", "070", "071", "072", "073",
            "074", "075", "076", "077", "078", "079", "080", "081", "082",
            "083", "084", "085", "086", "087", "088", "089", "090"
        )

        // getting the user input
        var text = editText.text
        var theString = editText.text.toString()
        //val text2 = editText.setText("")

        var letter = theString
        // showing the user input

        val letter2 = get_letter(letter)
        val getletter = letter2.tletter()




        if (letter !in lCase && letter !in uCase){
            theTextView2.text = ("Enter a proper letter")
            theTextView.text = ("")
        } else {
            theTextView2.text = ("Enter another letter ")

        }


        val drawableResource = when (getletter) {

            lCase[0] -> R.drawable.la
            uCase[0] -> R.drawable.a

            lCase[1] -> R.drawable.lb
            uCase[1] -> R.drawable.b

            lCase[2] -> R.drawable.lc
            uCase[2] -> R.drawable.c

            lCase[3] -> R.drawable.ld
            uCase[3] -> R.drawable.d

            lCase[4] -> R.drawable.le
            uCase[4] -> R.drawable.e

            lCase[5] -> R.drawable.lf
            uCase[5] -> R.drawable.f

            lCase[6] -> R.drawable.lg
            uCase[6] -> R.drawable.g

            lCase[7] -> R.drawable.lh
            uCase[7] -> R.drawable.h

            lCase[8] -> R.drawable.li
            uCase[8] -> R.drawable.i

            lCase[9] -> R.drawable.lj
            uCase[9] -> R.drawable.j

            lCase[10] -> R.drawable.lk
            uCase[10] -> R.drawable.k

            lCase[11] -> R.drawable.ll
            uCase[11] -> R.drawable.l

            lCase[12] -> R.drawable.lm
            uCase[12] -> R.drawable.m

            lCase[13] -> R.drawable.ln
            uCase[13] -> R.drawable.n

            lCase[14] -> R.drawable.lo
            uCase[14] -> R.drawable.o

            lCase[15] -> R.drawable.lp
            uCase[15] -> R.drawable.p

            lCase[16] -> R.drawable.lq
            uCase[16] -> R.drawable.q

            lCase[17] -> R.drawable.lr
            uCase[17] -> R.drawable.r

            lCase[18] -> R.drawable.ls
            uCase[18] -> R.drawable.s

            lCase[19] -> R.drawable.lt
            uCase[19] -> R.drawable.t

            lCase[20] -> R.drawable.lu
            uCase[20] -> R.drawable.u

            lCase[21] -> R.drawable.lv
            uCase[21] -> R.drawable.v

            lCase[22] -> R.drawable.lw
            uCase[22] -> R.drawable.w

            lCase[23] -> R.drawable.lx
            uCase[23] -> R.drawable.x

            lCase[24] -> R.drawable.ly
            uCase[24] -> R.drawable.y

            lCase[25] -> R.drawable.lz
            uCase[25] -> R.drawable.z

            else -> R.drawable.transparent_backfround
        }

        // Update the ImageView with the correct drawable resource ID
        Aletter.setImageResource(drawableResource)

        // Update the content description
        //Aletter.contentDescription = diceRoll.toString()

        when (getletter) {
            //a
            lCase[0] -> theTextView.text = (ASC1[0])
            uCase[0] -> theTextView.text = (ASC2[0])
            //b
            lCase[1] -> theTextView.text = (ASC1[1])
            uCase[1] -> theTextView.text = (ASC2[1])
            //c
            lCase[2] -> theTextView.text = (ASC1[2])
            uCase[2] -> theTextView.text = (ASC2[2])
            //d
            lCase[3] -> theTextView.text = (ASC1[3])
            uCase[3] -> theTextView.text = (ASC2[3])
            //e
            lCase[4] -> theTextView.text = (ASC1[4])
            uCase[4] -> theTextView.text = (ASC2[4])
            //f
            lCase[5] -> theTextView.text = (ASC1[5])
            uCase[5] -> theTextView.text = (ASC2[5])
            //g
            lCase[6] -> theTextView.text = (ASC1[6])
            uCase[6] -> theTextView.text = (ASC2[6])
            //h
            lCase[7] -> theTextView.text = (ASC1[7])
            uCase[7] -> theTextView.text = (ASC2[7])
            //i
            lCase[8] -> theTextView.text = (ASC1[8])
            uCase[8] -> theTextView.text = (ASC2[8])
            //j
            lCase[9] -> theTextView.text = (ASC1[9])
            uCase[9] -> theTextView.text = (ASC2[9])
            //k
            lCase[10] -> theTextView.text = (ASC1[10])
            uCase[10] -> theTextView.text = (ASC2[10])
            //l
            lCase[11] -> theTextView.text = (ASC1[11])
            uCase[11] -> theTextView.text = (ASC2[11])
            //m
            lCase[12] -> theTextView.text = (ASC1[12])
            uCase[12] -> theTextView.text = (ASC2[12])
            //n
            lCase[13] -> theTextView.text = (ASC1[13])
            uCase[13] -> theTextView.text = (ASC2[13])
            //o
            lCase[14] -> theTextView.text = (ASC1[14])
            uCase[14] -> theTextView.text = (ASC2[14])
            //p
            lCase[15] -> theTextView.text = (ASC1[15])
            uCase[15] -> theTextView.text = (ASC2[15])
            //q
            lCase[16] -> theTextView.text = (ASC1[16])
            uCase[16] -> theTextView.text = (ASC2[16])
            //r
            lCase[17] -> theTextView.text = (ASC1[17])
            uCase[17] -> theTextView.text = (ASC2[17])
            //s
            lCase[18] -> theTextView.text = (ASC1[18])
            uCase[18] -> theTextView.text = (ASC2[18])
            //t
            lCase[19] -> theTextView.text = (ASC1[19])
            uCase[19] -> theTextView.text = (ASC2[19])
            //u
            lCase[20] -> theTextView.text = (ASC1[20])
            uCase[20] -> theTextView.text = (ASC2[20])
            //v
            lCase[21] -> theTextView.text = (ASC1[21])
            uCase[21] -> theTextView.text = (ASC2[21])
            //w
            lCase[22] -> theTextView.text = (ASC1[22])
            uCase[22] -> theTextView.text = (ASC2[22])
            //x
            lCase[23] -> theTextView.text = (ASC1[23])
            uCase[23] -> theTextView.text = (ASC2[23])
            //y
            lCase[24] -> theTextView.text = (ASC1[24])
            uCase[24] -> theTextView.text = (ASC2[24])
            //z
            lCase[25] -> theTextView.text = (ASC1[25])
            uCase[25] -> theTextView.text = (ASC2[25])
        }

    }

}

class get_letter(private val letter: String){

    fun tletter(): String{

        return letter

    }

}



