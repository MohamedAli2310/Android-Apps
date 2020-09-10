package com.TheGreatFantasy.androidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    protected fun buclick(view: View) {
        val buSelected= view as Button
        var cellId=0
        when(buSelected.id){
            R.id.bu1 -> cellId=1
            R.id.bu2 -> cellId=2
            R.id.bu3 -> cellId=3
            R.id.bu4 -> cellId=4
            R.id.bu5 -> cellId=5
            R.id.bu6 -> cellId=6
            R.id.bu7 -> cellId=7
            R.id.bu8 -> cellId=8
            R.id.bu9 -> cellId=9

            PlayGame(cellID,buSelected)
        }

        var player1=ArrayList<Int>()
        var player2=ArrayList<Int>()
        var ActivePlayer=1

        fun PlayGame(cellID:Int,buSelected:Button){

            if(ActivePlayer==1){
                buSelected.text="X"
                buSelected.setBackgroundResource(R.color.blue)
                player1.add(cellID)
                ActivePlayer=2

            }else{
                buSelected.text="O"
                buSelected.setBackgroundResource(R.color.darkgreen)
                player2.add(cellID)
                ActivePlayer=1
            }


            buSelected.isEnabled=false
            CheckWiner ()
        }



        fun  CheckWiner(){
            var winer=-1

            // row 1
            if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
                winer=1
            }
            if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
                winer=2
            }


            // row 2
            if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
                winer=1
            }
            if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
                winer=2
            }




            // row 3
            if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
                winer=1
            }
            if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
                winer=2
            }
            if(player1.contains(7) && player1.contains(5) && player1.contains(3)){
                winer=1
            }
            if(player2.contains(7) && player2.contains(5) && player2.contains(3)){
                winer=2
            }
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winer=1
            }
            if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
                winer=2
            }


            // col 1
            if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
                winer=1
            }
            if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
                winer=2
            }



            // col 2
            if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
                winer=1
            }
            if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
                winer=2
            }


            // col 3
            if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
                winer=1
            }
            if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
                winer=2
            }


            if( winer != -1){

                if (winer==1){
                    Toast.makeText(this," Player 1 is the winner", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this," Player 2  is the winner", Toast.LENGTH_LONG).show()

                }

            }

        }

    }}
