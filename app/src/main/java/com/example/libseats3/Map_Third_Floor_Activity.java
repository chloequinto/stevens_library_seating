package com.example.libseats3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Map_Third_Floor_Activity extends AppCompatActivity {
    Button mButton_f3_r2_c1,  mButton_f3_r2_c2,  mButton_f3_r2_c3,  mButton_f3_r2_c4,  mButton_f3_r2_c5,  mButton_f3_r2_c6,  mButton_f3_r2_c7,  mButton_f3_r2_c8,
            mButton_f3_r2_c9,  mButton_f3_r2_c10; //Row 2

    Button mButton_f3_r4_c1, mButton_f3_r4_c3, mButton_f3_r4_c5, mButton_f3_r4_c7 , mButton_f3_r4_c9,
             mButton_f3_r4_c11, mButton_f3_r4_c12, mButton_f3_r4_c13; //Row 4

    Button mButton_f3_r6_c1, mButton_f3_r6_c2;//Row 6

    Button mButton_f3_r8_c1, mButton_f3_r8_c2; //Row 8

    Button mButton_f3_r10_c1, mButton_f3_r10_c2;//Row 10

    Button mButton_f3_r13_c1, mButton_f3_r13_c2; //Row 13

    Button mButton_f3_r15_c1, mButton_f3_r15_c2;//Row 15

    Button mButton_f3_r17_c1, mButton_f3_r17_c2; //Row 17

    Button mButton_f3_r18_c1, mButton_f3_r18_c3,mButton_f3_r18_c5; //Row 18

    Button mButton_f3_r20_c1,  mButton_f3_r20_c3,  mButton_f3_r20_c6,  mButton_f3_r20_c8,
          mButton_f3_r20_c11; //Row 2




    boolean isPressed = true;
    long startTime;
    long endTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map__third__floor_);

        mButton_f3_r2_c1 = (Button) findViewById(R.id.b_f3_r2_c1);
        mButton_f3_r2_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c1.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c2 = (Button) findViewById(R.id.b_f3_r2_c2);
        mButton_f3_r2_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c2.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c3 = (Button) findViewById(R.id.b_f3_r2_c3);
        mButton_f3_r2_c3.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c3.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c4 = (Button) findViewById(R.id.b_f3_r2_c4);
        mButton_f3_r2_c4.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c4.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r2_c5 = (Button) findViewById(R.id.b_f3_r2_c5);
        mButton_f3_r2_c5.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c5.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c6 = (Button) findViewById(R.id.b_f3_r2_c6);
        mButton_f3_r2_c6.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c6.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c7 = (Button) findViewById(R.id.b_f3_r2_c7);
        mButton_f3_r2_c7.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c7.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c8 = (Button) findViewById(R.id.b_f3_r2_c8);
        mButton_f3_r2_c8.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c8.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r2_c9 = (Button) findViewById(R.id.b_f3_r2_c9);
        mButton_f3_r2_c9.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c9.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r2_c10 = (Button) findViewById(R.id.b_f3_r2_c10);
        mButton_f3_r2_c10.setBackgroundResource(R.drawable.grey);
        mButton_f3_r2_c10.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r4_c1 = (Button) findViewById(R.id.b_f3_r4_c1);
        mButton_f3_r4_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c1.setOnClickListener(new View.OnClickListener() {
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



        mButton_f3_r4_c3 = (Button) findViewById(R.id.b_f3_r4_c3);
        mButton_f3_r4_c3.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c3.setOnClickListener(new View.OnClickListener() {
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



        mButton_f3_r4_c5 = (Button) findViewById(R.id.b_f3_r4_c5);
        mButton_f3_r4_c5.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c5.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r4_c7 = (Button) findViewById(R.id.b_f3_r4_c7);
        mButton_f3_r4_c7.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c7.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r4_c9 = (Button) findViewById(R.id.b_f3_r4_c9);
        mButton_f3_r4_c9.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c9.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r4_c11 = (Button) findViewById(R.id.b_f3_r4_c11);
        mButton_f3_r4_c11.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c11.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r4_c12 = (Button) findViewById(R.id.b_f3_r4_c12);
        mButton_f3_r4_c12.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c12.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r4_c13 = (Button) findViewById(R.id.b_f3_r4_c13);
        mButton_f3_r4_c13.setBackgroundResource(R.drawable.grey);
        mButton_f3_r4_c13.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r6_c1 = (Button) findViewById(R.id.b_f3_r6_c1);
        mButton_f3_r6_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r6_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r6_c2 = (Button) findViewById(R.id.b_f3_r6_c2);
        mButton_f3_r6_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r6_c2.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r8_c1 = (Button) findViewById(R.id.b_f3_r8_c1);
        mButton_f3_r8_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r8_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r8_c2 = (Button) findViewById(R.id.b_f3_r8_c2);
        mButton_f3_r8_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r8_c2.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r10_c1 = (Button) findViewById(R.id.b_f3_r10_c1);
        mButton_f3_r10_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r10_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r10_c2 = (Button) findViewById(R.id.b_f3_r10_c2);
        mButton_f3_r10_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r10_c2.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r13_c1 = (Button) findViewById(R.id.b_f3_r13_c1);
        mButton_f3_r13_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r13_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r13_c2 = (Button) findViewById(R.id.b_f3_r13_c2);
        mButton_f3_r13_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r13_c2.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r15_c1 = (Button) findViewById(R.id.b_f3_r15_c1);
        mButton_f3_r15_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r15_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r15_c2 = (Button) findViewById(R.id.b_f3_r15_c2);
        mButton_f3_r15_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r15_c2.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r17_c1 = (Button) findViewById(R.id.b_f3_r17_c1);
        mButton_f3_r17_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r17_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r17_c2 = (Button) findViewById(R.id.b_f3_r17_c2);
        mButton_f3_r17_c2.setBackgroundResource(R.drawable.grey);
        mButton_f3_r17_c2.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r18_c1 = (Button) findViewById(R.id.b_f3_r18_c1);
        mButton_f3_r18_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r18_c1.setOnClickListener(new View.OnClickListener() {
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


        mButton_f3_r18_c3 = (Button) findViewById(R.id.b_f3_r18_c3);
        mButton_f3_r18_c3.setBackgroundResource(R.drawable.grey);
        mButton_f3_r18_c3.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r18_c5 = (Button) findViewById(R.id.b_f3_r18_c5);
        mButton_f3_r18_c5.setBackgroundResource(R.drawable.grey);
        mButton_f3_r18_c5.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r20_c1 = (Button) findViewById(R.id.b_f3_r20_c1);
        mButton_f3_r20_c1.setBackgroundResource(R.drawable.grey);
        mButton_f3_r20_c1.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r20_c3 = (Button) findViewById(R.id.b_f3_r20_c3);
        mButton_f3_r20_c3.setBackgroundResource(R.drawable.grey);
        mButton_f3_r20_c3.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r20_c6 = (Button) findViewById(R.id.b_f3_r20_c6);
        mButton_f3_r20_c6.setBackgroundResource(R.drawable.grey);
        mButton_f3_r20_c6.setOnClickListener(new View.OnClickListener() {
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

        mButton_f3_r20_c8 = (Button) findViewById(R.id.b_f3_r20_c8);
        mButton_f3_r20_c8.setBackgroundResource(R.drawable.grey);
        mButton_f3_r20_c8.setOnClickListener(new View.OnClickListener() {
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



        mButton_f3_r20_c11 = (Button) findViewById(R.id.b_f3_r20_c11);
        mButton_f3_r20_c11.setBackgroundResource(R.drawable.grey);
        mButton_f3_r20_c11.setOnClickListener(new View.OnClickListener() {
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
