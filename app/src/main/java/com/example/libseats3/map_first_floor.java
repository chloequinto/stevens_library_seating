package com.example.libseats3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class map_first_floor extends AppCompatActivity {

    Button mButton_f1_r2_c1, mButton_f1_r2_c2, mButton_f1_r2_c3, mButton_f1_r2_c4, mButton_f1_r2_c5, mButton_f1_r2_c6, mButton_f1_r2_c7, mButton_f1_r2_c8,
            mButton_f1_r2_c9, mButton_f1_r2_c10; // Row 2
    Button mButton_f1_r3_c1, mButton_f1_r3_c4, mButton_f1_r3_c6;

    Button  mButton_f1_r4_c9 , mButton_f1_r4_c10, mButton_f1_r4_c14
            ,mButton_f1_r4_c16
            ,mButton_f1_r4_c12
            ,mButton_f1_r4_c13;

    Button mButton_f1_r6_c1, mButton_f1_r6_c2, mButton_f1_r6_c8,mButton_f1_r6_c11;

    Button
            mButton_f1_r7_c8,
            mButton_f1_r7_c11,
            mButton_f1_r12_c11,
            mButton_f1_r12_c8,
            mButton_f1_r12_c9 ,
            mButton_f1_r12_c10,
            mButton_f1_r14_c1,
            mButton_f1_r14_c2,
            mButton_f1_r8_c8 ,
            mButton_f1_r8_c11,

            mButton_f1_r8_c2,

            mButton_f1_r8_c1,
            mButton_f1_r9_c2,
            mButton_f1_r9_c1,
            mButton_f1_r9_c9 ,
            mButton_f1_r9_c10,

            mButton_f1_r10_c8 ,
            mButton_f1_r10_c11,
            mButton_f1_r10_c1 ,
            mButton_f1_r10_c2 ,
            mButton_f1_r11_c8 ,
            mButton_f1_r11_c11 ,
            mButton_f1_r13_c9,
            mButton_f1_r13_c10,
            mButton_f1_r13_c2 ,
            mButton_f1_r13_c1,
            mButton_f1a_r13_c2,
            mButton_f1_r15_c1,
            mButton_f1_r15_c2 ,
            mButton_f1_r17_c18 ,
            mButton_f1_r17_c20,
            mButton_f1_r17_c1,
            mButton_f1_r17_c2 ,
            mButton_f1_r19_c2,
            mButton_f1_r19_c4 ,
            mButton_f1_r18_c11,
            mButton_f1_r18_c13 ,
            mButton_f1_r18_c15 ,
            mButton_f1_r20_c2,
            mButton_f1_r20_c5,
            mButton_f1_r20_c12,
            mButton_f1_r20_c8 ,
            mButton_f1_r20_c11 ;






    boolean isPressed = true;
    long startTime;
    long endTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_first_floor);

        mButton_f1_r2_c1 = (Button) findViewById(R.id.b_f1_r2_c1);
        mButton_f1_r2_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c2 = (Button) findViewById(R.id.b_f1_r2_c2);
        mButton_f1_r2_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c3 = (Button) findViewById(R.id.b_f1_r2_c3);
        mButton_f1_r2_c3.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c4 = (Button) findViewById(R.id.b_f1_r2_c4);
        mButton_f1_r2_c4.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c5 = (Button) findViewById(R.id.b_f1_r2_c5);
        mButton_f1_r2_c5.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c6 = (Button) findViewById(R.id.b_f1_r2_c6);
        mButton_f1_r2_c6.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c7 = (Button) findViewById(R.id.b_f1_r2_c7);
        mButton_f1_r2_c7.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c8 = (Button) findViewById(R.id.b_f1_r2_c8);
        mButton_f1_r2_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c9 = (Button) findViewById(R.id.b_f1_r2_c9);
        mButton_f1_r2_c9.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r2_c10 = (Button) findViewById(R.id.b_f1_r2_c10);
        mButton_f1_r2_c10.setBackgroundResource(R.drawable.grey);
        mButton_f1_r2_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

//Row 3
        mButton_f1_r3_c1 = (Button) findViewById(R.id.b_f1_r3_c1);
        mButton_f1_r3_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r3_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r3_c4= (Button) findViewById(R.id.b_f1_r3_c4);
        mButton_f1_r3_c4.setBackgroundResource(R.drawable.grey);
        mButton_f1_r3_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r3_c6 = (Button) findViewById(R.id.b_f1_r3_c6);
        mButton_f1_r3_c6.setBackgroundResource(R.drawable.grey);
        mButton_f1_r3_c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        //Row 4

        mButton_f1_r4_c9 = (Button) findViewById(R.id.b_f1_r4_c9);
        mButton_f1_r4_c9.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c10 = (Button) findViewById(R.id.b_f1_r4_c10);
        mButton_f1_r4_c10.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c12 = (Button) findViewById(R.id.b_f1_r4_c12);
        mButton_f1_r4_c12.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c12 = (Button) findViewById(R.id.b_f3_r4_c12);
        mButton_f1_r4_c12.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c14 = (Button) findViewById(R.id.b_f3_r4_c14);
        mButton_f1_r4_c14.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c16 = (Button) findViewById(R.id.b_f3_r4_c16);
        mButton_f1_r4_c16.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c12 = (Button) findViewById(R.id.b_f1_r4_c12);
        mButton_f1_r4_c12.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c13 = (Button) findViewById(R.id.b_f1_r4_c13);
        mButton_f1_r4_c13.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r4_c14 = (Button) findViewById(R.id.b_f3_r4_c14);
        mButton_f1_r4_c14.setBackgroundResource(R.drawable.grey);
        mButton_f1_r4_c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        //Row 6

        mButton_f1_r6_c1 = (Button) findViewById(R.id.b_f3_r6_c1);
        mButton_f1_r6_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r6_c2 = (Button) findViewById(R.id.b_f3_r6_c2);
        mButton_f1_r6_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r6_c8 = (Button) findViewById(R.id.b_f1_r6_c8);
        mButton_f1_r6_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r6_c11 = (Button) findViewById(R.id.b_f1_r6_c11);
        mButton_f1_r6_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        //Row 7
        mButton_f1_r6_c1 = (Button) findViewById(R.id.b_f1_r6_c1);
        mButton_f1_r6_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r6_c2 = (Button) findViewById(R.id.b_f1_r6_c2);
        mButton_f1_r6_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r6_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r7_c8 = (Button) findViewById(R.id.b_f1_r7_c8);
        mButton_f1_r7_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r7_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r7_c11 = (Button) findViewById(R.id.b_f1_r7_c11);
        mButton_f1_r7_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r7_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        //Row 12

        mButton_f1_r12_c11 = (Button) findViewById(R.id.b_f1_r12_c11);
        mButton_f1_r12_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r12_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r12_c8 = (Button) findViewById(R.id.b_f1_r12_c8);
        mButton_f1_r12_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r12_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });




        //Row 14

        mButton_f1_r14_c1 = (Button) findViewById(R.id.b_f1_r14_c1);
        mButton_f1_r14_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r14_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r14_c2 = (Button) findViewById(R.id.b_f1_r14_c2);
        mButton_f1_r14_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r14_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        // Row 8
        mButton_f1_r8_c8 = (Button) findViewById(R.id.b_f1_r8_c8);
        mButton_f1_r8_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r8_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r8_c11 = (Button) findViewById(R.id.b_f1_r8_c11);
        mButton_f1_r8_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r8_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r8_c1 = (Button) findViewById(R.id.b_f3_r8_c1);
        mButton_f1_r8_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r8_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r8_c2 = (Button) findViewById(R.id.b_f3_r8_c2);
        mButton_f1_r8_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r8_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        // Row 9

        mButton_f1_r9_c9 = (Button) findViewById(R.id.t_f1_r9_c9);
        mButton_f1_r9_c9.setBackgroundResource(R.drawable.grey);
        mButton_f1_r9_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r9_c10 = (Button) findViewById(R.id.t_f1_r9_c10);
        mButton_f1_r9_c10.setBackgroundResource(R.drawable.grey);
        mButton_f1_r9_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r8_c1 = (Button) findViewById(R.id.t_f1_r9_c1);
        mButton_f1_r8_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r8_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r9_c2 = (Button) findViewById(R.id.b_f1_r9_c2);
        mButton_f1_r9_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r9_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        mButton_f1_r9_c9 = (Button) findViewById(R.id.b_f1_r9_c9);
        mButton_f1_r9_c9.setBackgroundResource(R.drawable.grey);
        mButton_f1_r9_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r9_c10 = (Button) findViewById(R.id.b_f1_r9_c10);
        mButton_f1_r9_c10.setBackgroundResource(R.drawable.grey);
        mButton_f1_r9_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        // Row 10


        mButton_f1_r10_c1 = (Button) findViewById(R.id.b_f3_r10_c1);
        mButton_f1_r10_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });



        mButton_f1_r10_c2 = (Button) findViewById(R.id.b_f3_r10_c2);
        mButton_f1_r10_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r10_c8 = (Button) findViewById(R.id.b_f1_r10_c8);
        mButton_f1_r10_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r10_c11 = (Button) findViewById(R.id.b_f1_r10_c11);
        mButton_f1_r10_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r10_c1 = (Button) findViewById(R.id.b_f1_r10_c1);
        mButton_f1_r10_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r10_c2 = (Button) findViewById(R.id.b_f1_r10_c2);
        mButton_f1_r10_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r10_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        //Row 11

        mButton_f1_r11_c8 = (Button) findViewById(R.id.b_f1_r11_c8);
        mButton_f1_r11_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r11_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r11_c11 = (Button) findViewById(R.id.b_f1_r11_c11);
        mButton_f1_r11_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r11_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

//Row 13

        mButton_f1_r13_c1 = (Button) findViewById(R.id.b_f1_r13_c1);
        mButton_f1_r13_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r13_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r13_c9 = (Button) findViewById(R.id.t_f1_r13_c9);
        mButton_f1_r13_c9.setBackgroundResource(R.drawable.grey);
        mButton_f1_r13_c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r13_c10 = (Button) findViewById(R.id.t_f1_r13_c10);
        mButton_f1_r13_c10.setBackgroundResource(R.drawable.grey);
        mButton_f1_r13_c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r13_c2 = (Button) findViewById(R.id.b_f1_r13_c2);
        mButton_f1_r13_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r13_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r13_c1 = (Button) findViewById(R.id.b_f3_r13_c1);
        mButton_f1_r13_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r13_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1a_r13_c2 = (Button) findViewById(R.id.b_f3_r13_c2);
        mButton_f1a_r13_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1a_r13_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        //Row 15

        mButton_f1_r15_c1 = (Button) findViewById(R.id.b_f1_r15_c1);
        mButton_f1_r15_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r15_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r15_c2 = (Button) findViewById(R.id.b_f1_r15_c2);
        mButton_f1_r15_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r15_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r17_c18 = (Button) findViewById(R.id.b_f1_r17_c18);
        mButton_f1_r17_c18.setBackgroundResource(R.drawable.grey);
        mButton_f1_r17_c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r17_c20 = (Button) findViewById(R.id.b_f1_r17_c20);
        mButton_f1_r17_c20.setBackgroundResource(R.drawable.grey);
        mButton_f1_r17_c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        mButton_f1_r17_c1 = (Button) findViewById(R.id.b_f1_r17_c1);
        mButton_f1_r17_c1.setBackgroundResource(R.drawable.grey);
        mButton_f1_r17_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r17_c2 = (Button) findViewById(R.id.b_f1_r17_c2);
        mButton_f1_r17_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r17_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r19_c2 = (Button) findViewById(R.id.b_f1_r19_c2);
        mButton_f1_r19_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r19_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r19_c4 = (Button) findViewById(R.id.b_f1_r19_c4);
        mButton_f1_r19_c4.setBackgroundResource(R.drawable.grey);
        mButton_f1_r19_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });



        mButton_f1_r18_c11 = (Button) findViewById(R.id.b_f1_r18_c11);
        mButton_f1_r18_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r18_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        mButton_f1_r18_c13 = (Button) findViewById(R.id.b_f1_r18_c13);
        mButton_f1_r18_c13.setBackgroundResource(R.drawable.grey);
        mButton_f1_r18_c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r18_c15 = (Button) findViewById(R.id.b_f1_r18_c15);
        mButton_f1_r18_c15.setBackgroundResource(R.drawable.grey);
        mButton_f1_r18_c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });



        mButton_f1_r20_c2 = (Button) findViewById(R.id.b_f1_r20_c2);
        mButton_f1_r20_c2.setBackgroundResource(R.drawable.grey);
        mButton_f1_r20_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r20_c5 = (Button) findViewById(R.id.b_f1_r20_c5);
        mButton_f1_r20_c5.setBackgroundResource(R.drawable.grey);
        mButton_f1_r20_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r20_c12 = (Button) findViewById(R.id.b_f1_r20_c12);
        mButton_f1_r20_c12.setBackgroundResource(R.drawable.grey);
        mButton_f1_r20_c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });


        mButton_f1_r20_c8 = (Button) findViewById(R.id.b_f1_r20_c8);
        mButton_f1_r20_c8.setBackgroundResource(R.drawable.grey);
        mButton_f1_r20_c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });

        mButton_f1_r20_c11 = (Button) findViewById(R.id.b_f1_r20_c11);
        mButton_f1_r20_c11.setBackgroundResource(R.drawable.grey);
        mButton_f1_r20_c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPressed) {
                    view.setBackgroundResource(R.drawable.red22);
                    startTime = System.nanoTime() /1000000000;
                }

                else {
                    view.setBackgroundResource(R.drawable.green);
                    endTime = System.nanoTime() / 1000000000;
                }

                long difference = endTime - startTime;
                final TextView thirdfloor = (TextView) findViewById(R.id.textView_f3);

                if (difference > 0) {
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000); }

                else if (difference < 0) {
                    difference = difference * -1;
                    thirdfloor.setText("Seat has been occupied for " + difference + " seconds");
                    thirdfloor.setVisibility(View.VISIBLE);
                    thirdfloor.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            thirdfloor.setVisibility(View.INVISIBLE);
                        }
                    }, 2000);
                }
                isPressed = !isPressed;
            }
        });



    }
}
