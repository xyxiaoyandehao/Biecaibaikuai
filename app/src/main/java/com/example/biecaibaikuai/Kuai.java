package com.example.biecaibaikuai;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 2017/7/16.
 */

public class Kuai {
    Wanjia wan;
    Kuai(Wanjia wanjia){
       wan=wanjia;
    }
    float x;
    float y;
    Button button;
    int yanse=1;  //1为黑，2为白

   void jianting(){
       button.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
               if(event.getAction() == MotionEvent.ACTION_DOWN) {
                   if (yanse == 1) {
                       yanse = 2;
                       button.setBackgroundColor(Color.WHITE);
                       wan.fenshu += 10;
                       return false;
                       ///踩到黑块，分数加10
                   } else if (yanse == 2) {
                       yanse = 1;
                       button.setBackgroundColor(Color.BLACK);
                       wan.jieshu();
                       return false;
                   }
               }
                return false;
           }
       });
       /*button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
                if(yanse==1){
                    yanse=2;
                    button.setBackgroundColor(Color.WHITE);
                    wan.fenshu+=10;

                    ///踩到黑块，分数加10
                }else if(yanse==2){
                    yanse=1;
                    button.setBackgroundColor(Color.BLACK);
                    wan.jieshu();

                    //踩到白块，游戏结束
                }
           }
       });*/
   }
   final void huan(){
           button.setBackgroundColor(Color.WHITE);
   }


}
