package com.example.baseconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate = (Button)findViewById(R.id.run);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputfield = (EditText) findViewById(R.id.userInput);
                TextView outputfield = (TextView) findViewById(R.id.output);
                EditText inputbasefield = (EditText) findViewById(R.id.inputBase);
                EditText outputbasefield = (EditText) findViewById(R.id.outputBase);
                TextView outputtext = (TextView) findViewById(R.id.outputText);
                String n1 = inputfield.getText().toString();
                int inputBase = Integer.parseInt(inputbasefield.getText().toString());
                int outputBase = Integer.parseInt(outputbasefield.getText().toString());


                int length = n1.length();
                int total = 0;
                for (int i = 0; i < length; i++) {
                    char  n2 = n1.charAt(i);
                    int num0 = 48;
                    int output = (n2-num0);


                    if (inputBase> 10) {
                        char a = (char) 'a';
                        if (n2 == a) {
                            output = (10);
                        }
                        char b = (char) 'b';
                        if (n2 == b) {
                            output = (11);
                        }
                        char c = (char) 'c';
                        if (n2 == c) {
                            output = (12);
                        }
                        char d = (char) 'd';
                        if (n2 == d) {
                            output = (13);
                        }
                        char e = (char) 'e';
                        if (n2 == e) {
                            output = (14);
                        }
                        char f = (char) 'f';
                        if (n2 == f) {
                            output = (15);
                        }
                        char A = (char) 'A';
                        if (n2 == A) {
                            output = (10);
                        }
                        char B = (char) 'B';
                        if (n2 == B) {
                            output = (11);
                        }
                        char C = (char) 'C';
                        if (n2 == C) {
                            output = (12);
                        }
                        char D = (char) 'D';
                        if (n2 == D) {
                            output = (13);
                        }
                        char E = (char) 'E';
                        if (n2 == E) {
                            output = (14);
                        }
                        char F = (char) 'F';
                        if (n2 == F) {
                            output = (15);
                        }
                    }else if(n2=='a'|| n2 =='b' || n2 == 'c' || n2 == 'd' || n2=='e' || n2=='f' || n2=='A' || n2 =='B' || n2 == 'C' || n2 == 'D' || n2=='E' || n2=='F'){
                        outputfield.setText("Invalid input or incorrect base");
                        break;
                    }

                    double power = Math.pow(inputBase, (double) length - i - 1);
                    total += (int) output*power;
                }

                String a = "";
                String beans = (total%outputBase) + a;


                if (total%outputBase == 10) {
                    beans = 'a'+a ;
                }
                if (total%outputBase == 11) {
                    beans = 'b'+a ;
                }
                if (total%outputBase == 12) {
                    beans = 'c'+a ;
                }
                if (total%outputBase == 13) {
                    beans = 'd'+a ;
                }
                if (total%outputBase == 14) {
                    beans = 'e'+a ;
                }
                if (total%outputBase == 15) {
                    beans = 'f'+a ;
                } else if (total%outputBase <10) {
                    beans = (total%outputBase) + a ;
                }

                while (total > 0) {

                    total = total/outputBase;
                    int remainder = total%outputBase;


                    if (total>0) {


                        if (remainder == 10) {
                            remainder = 'A';
                            beans = 'A'+beans;

                        }
                        if (remainder == 11) {
                            remainder = 'B';
                            beans = 'B'+beans;
                        }
                        if (remainder == 12) {
                            remainder = 'C';
                            beans = 'C'+beans;
                        }
                        if (remainder == 13) {
                            remainder = 'D';
                            beans = 'D'+beans;
                        }
                        if (remainder == 14) {
                            remainder = 'E';
                            beans = 'E'+beans;
                        }
                        if (remainder == 15) {
                            remainder = 'F';
                            beans = 'F'+beans;
                        } else if (remainder < 10) {
                            remainder = remainder;
                            beans = remainder + beans;

                        }

                    }

                }
                outputtext.setText("Your number in the desired base is:");
                outputfield.setText(beans);
            }
        });

       Button clearbtn = (Button) findViewById(R.id.clear);
       clearbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText inputfield = (EditText) findViewById(R.id.userInput);
               inputfield.setText("");
               EditText inputbasefield = (EditText)findViewById(R.id.inputBase);
               inputbasefield.setText("");
               EditText outputbasefield = (EditText) findViewById(R.id.outputBase);
               outputbasefield.setText("");
               TextView outputtext = (TextView) findViewById(R.id.outputText);
               outputtext.setText("");
               TextView outputfield = (TextView) findViewById(R.id.output);
               outputfield.setText("");
           }
       });
    }
}