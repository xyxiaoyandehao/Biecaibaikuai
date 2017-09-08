package com.example.biecaibaikuai;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Wanjia wanjia=new Wanjia(this);
    Kuai kuai[]={
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
            new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),new Kuai(wanjia),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager wm = this.getWindowManager();
        final int width = wm.getDefaultDisplay().getWidth();
        final int height = wm.getDefaultDisplay().getHeight();
        Log.wtf("提示", "屏幕尺寸2：宽度 = " + width+ "高度 = " + height);

        // button1.setBackgroundColor(Color.BLACK);
        // ViewGroup.LayoutParams params = button1.getLayoutParams();
        // params.height=height/5;
        //  params.width=width/4;
        // button1.setX(0);
        // button1.setY(0);
        double shijian=100;

        kuai[0].button=(Button) findViewById(R.id.button0);
        kuai[1].button=(Button) findViewById(R.id.button1);
        kuai[2].button=(Button) findViewById(R.id.button2);
        kuai[3].button=(Button) findViewById(R.id.button3);
        kuai[4].button=(Button) findViewById(R.id.button4);
        kuai[5].button=(Button) findViewById(R.id.button5);
        kuai[6].button=(Button) findViewById(R.id.button6);
        kuai[7].button=(Button) findViewById(R.id.button7);
        kuai[8].button=(Button) findViewById(R.id.button8);
        kuai[9].button=(Button) findViewById(R.id.button9);
        kuai[10].button=(Button) findViewById(R.id.button10);
        kuai[11].button=(Button) findViewById(R.id.button11);
        kuai[12].button=(Button) findViewById(R.id.button12);
        kuai[13].button=(Button) findViewById(R.id.button13);
        kuai[14].button=(Button) findViewById(R.id.button14);
        kuai[15].button=(Button) findViewById(R.id.button15);
        kuai[16].button=(Button) findViewById(R.id.button16);
        kuai[17].button=(Button) findViewById(R.id.button17);
        kuai[18].button=(Button) findViewById(R.id.button18);
        kuai[19].button=(Button) findViewById(R.id.button19);
        kuai[20].button=(Button) findViewById(R.id.button20);
        kuai[21].button=(Button) findViewById(R.id.button21);
        kuai[22].button=(Button) findViewById(R.id.button22);
        kuai[23].button=(Button) findViewById(R.id.button23);
        kuai[24].button=(Button) findViewById(R.id.button24);
        kuai[25].button=(Button) findViewById(R.id.button25);
        kuai[26].button=(Button) findViewById(R.id.button26);
        kuai[27].button=(Button) findViewById(R.id.button27);
        final TextView text =(TextView) findViewById(R.id.fenshu);
        final Button kaishi = (Button) findViewById(R.id.kaishi);
        final Button jieshu = (Button) findViewById(R.id.jieshu);

        for(int i=0;i<24;i++) {                                     //界面初始化
            kuai[i].jianting();
            kuai[i].yanse=2;
            kuai[i].button.setBackgroundColor(Color.WHITE);

            ViewGroup.LayoutParams params = kuai[i].button.getLayoutParams();
            params.height = (height-20) / 5;
            params.width = (width-20) / 6;
            kuai[i].x = (width/6) * (i % 4);
            kuai[i].y = height / 5 * (i / 4)+height/10;
            kuai[i].button.setX(kuai[i].x);
            kuai[i].button.setY(kuai[i].y);

        }
        //kuai[0].button.setY(0);
        ViewGroup.LayoutParams params =text.getLayoutParams();
        params.height = (height-20)/5;
        params.width = (width-20)/3;
        text.setX((width/6)*4);
        text.setY(height/5);
        ViewGroup.LayoutParams params2 =kaishi.getLayoutParams();
        params2.height = (height-20)/5/2;
        params2.width = (width-20)/3;
        kaishi.setX(width/6*4);
        kaishi.setY(height/10*6);
        ViewGroup.LayoutParams params3 =jieshu.getLayoutParams();
        params3.height = (height-20)/5/2;
        params3.width = (width-20)/3;
        jieshu.setX(width/6*4);
        jieshu.setY(height/10*7);

        wanjia.zhuangtai = 1;
        kaishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(wanjia.zhuangtai == 0||wanjia.zhuangtai==3){
                    kaishi.setText("开始游戏");
                    wanjia.zhuangtai = 1;
                }
                else if (wanjia.zhuangtai == 1) {
                    kaishi.setText("重新开始");
                    wanjia.fenshu = 0;
                    wanjia.zhuangtai=0;
                    for (int i = 0; i < 24; i++) {
                        kuai[i].jianting();
                        kuai[i].yanse = 2;
                        kuai[i].button.setBackgroundColor(Color.WHITE);

                        ViewGroup.LayoutParams params = kuai[i].button.getLayoutParams();
                        params.height = (height - 20) / 5;
                        params.width = (width - 20) / 6;
                        kuai[i].x = (width / 6) * (i % 4);
                        kuai[i].y = height / 5 * (i / 4) + height / 10;
                        kuai[i].button.setX(kuai[i].x);
                        kuai[i].button.setY(kuai[i].y);

                    }
                    kuai[0].button.setY(0);
                    ViewGroup.LayoutParams params = text.getLayoutParams();
                    params.height = (height - 20) / 5;
                    params.width = (width - 20) / 3;
                    text.setX((width / 6) * 4);
                    text.setY(height / 5);
                    ViewGroup.LayoutParams params2 = kaishi.getLayoutParams();
                    params2.height = (height - 20) / 5;
                    params2.width = (width - 20) / 3;
                    kaishi.setX(width / 6 * 4);
                    kaishi.setY(height / 5 * 3);

                    Thread mRefreshThread = new Thread() {


                        @Override
                        public void run() {
                            // TODO Auto-generated method stub

                            super.run();
                            while (true) {

                                if(wanjia.zhuangtai==1){
                                    break;
                                }
                                if(wanjia.zhuangtai==3){
                                    if(wanjia.fenshu>wanjia.zuigao){
                                        wanjia.zuigao=wanjia.fenshu;
                                    }
                                    final TextView text2 = (TextView) findViewById(R.id.fenshu);
                                    text2.post(new Runnable() {               //实时更新分数
                                        @Override
                                        public void run() {
                                            text2.setText("游戏结束了"+"\n"+"本次得分:"+wanjia.fenshu+"\n"+"最高分数:"+wanjia.zuigao);
                                        }

                                    });
                                    break;
                                }
                                final TextView text2 = (TextView) findViewById(R.id.fenshu);
                                text2.post(new Runnable() {               //实时更新分数
                                    @Override
                                    public void run() {
                                        text2.setText("分数：" + wanjia.fenshu);


                                    }

                                });
                                long shijian;
                                double q;
                                try {
                                    q = 10;
                                    for(int i=0;i<wanjia.fenshu/50;i++){
                                        q=q*0.95;
                                    }
                                    shijian = (int) q;
                                    Thread.sleep(shijian);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                for (int i = 0; i < 24; i++) {
                                    kuai[i].y += height/300;

                                    kuai[i].button.setY(kuai[i].y);
                                    if (kuai[i].y > height/10*9) {
                                        //kuai[i].huan();
                                        kuai[i].y -= (height+height/5);
                                        kuai[i].button.setY(kuai[i].y);
                                        //Random rand = new Random();
                                        //int a = rand.nextInt(100);
                                        // Button button=null;
                                        if(kuai[i].yanse==1){
                                            wanjia.zhuangtai=3;
                                        }

                                        final Button button = kuai[i].button;

                                        Random rand = new Random(i);
                                        int a = rand.nextInt(100);
                                        if (a % 2 == 0) {
                                            kuai[i].yanse = 2;

                                            final int fenshu = wanjia.fenshu;
                                            button.post(new Runnable() {
                                                @Override
                                                public void run() {
                                                    button.setBackgroundColor(Color.WHITE);


                                                }

                                            });

                                        } else if (a % 2 == 1) {
                                            kuai[i].yanse = 1;
                                            button.post(new Runnable() {
                                                @Override
                                                public void run() {
                                                    button.setBackgroundColor(Color.BLACK);


                                                }

                                            });

                                        }

                                    }
                                }
                            }


                        }

                    };
                    mRefreshThread.start(); //启动线程
                }
            }
        });

        jieshu.setOnClickListener(new View.OnClickListener() {              //退出游戏
            @Override
            public void onClick(View v) {
                wanjia.zhuangtai=1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MainActivity.this.finish();
            }
        });



    }

    protected void onResume(Bundle savedInstanceState){

    }

    void jiafen(){

    }
}
