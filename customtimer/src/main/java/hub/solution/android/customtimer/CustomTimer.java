package hub.solution.android.customtimer;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CustomTimer {

    static Dialog timePickerDialog = null;

    public static void CustomTimerTextView (Activity context, final TextView timeTextView, String color) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        String time = sdf.format(calendar.getTime());
        String inputTime = time, inputHours, inputMinutes;
        final String[] timeFormat1 = new String[1];

        inputHours = inputTime.substring(0, 2);
        inputMinutes = inputTime.substring(3, 5);

        String[] s = inputTime.split(" ");
        timeFormat1[0] = s[1];

        if (Integer.parseInt(inputHours) < 10) {
            inputHours = "0" + inputHours;
        }


        if (Integer.parseInt(inputHours) < 12 && s[1].equalsIgnoreCase("PM")) {
            if (Integer.parseInt(inputHours) == 1) {
                inputHours = "13";
            } else if (Integer.parseInt(inputHours) == 2) {
                inputHours = "14";
            } else if (Integer.parseInt(inputHours) == 3) {
                inputHours = "15";
            } else if (Integer.parseInt(inputHours) == 4) {
                inputHours = "16";
            } else if (Integer.parseInt(inputHours) == 5) {
                inputHours = "17";
            } else if (Integer.parseInt(inputHours) == 6) {
                inputHours = "18";
            } else if (Integer.parseInt(inputHours) == 7) {
                inputHours = "19";
            } else if (Integer.parseInt(inputHours) == 8) {
                inputHours = "20";
            } else if (Integer.parseInt(inputHours) == 9) {
                inputHours = "21";
            } else if (Integer.parseInt(inputHours) == 10) {
                inputHours = "22";
            } else if (Integer.parseInt(inputHours) == 11) {
                inputHours = "23";
            } else if (Integer.parseInt(inputHours) == 12) {
                inputHours = "24";
            }
        }


        if (timePickerDialog == null) {
            timePickerDialog = new Dialog(context);
            timePickerDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            timePickerDialog.setContentView(R.layout.time_picker_view);
            final TextView hr1TextView = timePickerDialog.findViewById(R.id.hr1TextView);
            final TextView min1TextView = timePickerDialog.findViewById(R.id.min1TextView);
            final TextView amPm1TextView = timePickerDialog.findViewById(R.id.amPm1TextView);
            RelativeLayout hrIncreaseBtn = timePickerDialog.findViewById(R.id.hrIncreaseBtn);
            RelativeLayout minIncreaseBtn = timePickerDialog.findViewById(R.id.minIncreaseBtn);
            final RelativeLayout amPmIncreaseBtn = timePickerDialog.findViewById(R.id.amPmIncreaseBtn);
            final TextView hr2TextView = timePickerDialog.findViewById(R.id.hr2TextView);
            final TextView min2TextView = timePickerDialog.findViewById(R.id.min2TextView);
            final TextView amPm2textView = timePickerDialog.findViewById(R.id.amPm2textView);
            RelativeLayout hrDecreaseBtn = timePickerDialog.findViewById(R.id.hrDecreaseBtn);
            RelativeLayout minDecreaseBtn = timePickerDialog.findViewById(R.id.minDecreaseBtn);
            final RelativeLayout amPmDecreaseBtn = timePickerDialog.findViewById(R.id.amPmDecreaseBtn);
            RelativeLayout setBtn = timePickerDialog.findViewById(R.id.setBtn);
            RelativeLayout closeBtn = timePickerDialog.findViewById(R.id.closeBtn);
            LinearLayout bottomView = timePickerDialog.findViewById(R.id.bottomView);
            RelativeLayout topView = timePickerDialog.findViewById(R.id.topView);

            topView.setBackgroundColor(Color.parseColor(color));
            bottomView.setBackgroundColor(Color.parseColor(color));

            hr1TextView.setText(inputHours);
            hr2TextView.setText(inputHours);

            min1TextView.setText(inputMinutes);
            min2TextView.setText(inputMinutes);


            if (s[1].equalsIgnoreCase("PM")) {
                amPm1TextView.setText("PM");
                amPm2textView.setText("PM");
            } else {
                amPm1TextView.setText("AM");
                amPm2textView.setText("AM");
            }

            amPmDecreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputHours = hr1TextView.getText().toString();
                    if (Integer.valueOf(hr1TextView.getText().toString()) <= 12) {
                        amPm1TextView.setText("PM");
                        amPm2textView.setText("PM");
                        if (Integer.parseInt(inputHours) == 00) {
                            inputHours = "12";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 1) {
                            inputHours = "13";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 2) {
                            inputHours = "14";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 3) {
                            inputHours = "15";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 4) {
                            inputHours = "16";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 5) {
                            inputHours = "17";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 6) {
                            inputHours = "18";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 7) {
                            inputHours = "19";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 8) {
                            inputHours = "20";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 9) {
                            inputHours = "21";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 10) {
                            inputHours = "22";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 11) {
                            inputHours = "23";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 12) {
                            inputHours = "12";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        }
                    } else {
                        amPm1TextView.setText("PM");
                        amPm2textView.setText("PM");
                    }
                }
            });

            amPmIncreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputHours = hr1TextView.getText().toString();
                    if (Integer.valueOf(hr1TextView.getText().toString()) >= 12) {
                        amPm1TextView.setText("AM");
                        amPm2textView.setText("Am");
                        if (Integer.parseInt(inputHours) == 00) {
                            inputHours = "12";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 13) {
                            inputHours = "01";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 14) {
                            inputHours = "02";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 15) {
                            inputHours = "03";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 16) {
                            inputHours = "04";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 17) {
                            inputHours = "05";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 18) {
                            inputHours = "06";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 19) {
                            inputHours = "07";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 20) {
                            inputHours = "08";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 21) {
                            inputHours = "09";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 22) {
                            inputHours = "10";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        } else if (Integer.parseInt(inputHours) == 23) {
                            inputHours = "11";
                            hr1TextView.setText(inputHours);
                            hr2TextView.setText(inputHours);
                        }
                    } else {
                        amPm1TextView.setText("AM");
                        amPm2textView.setText("AM");
                    }

                }
            });

            minIncreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer integer = Integer.valueOf(min1TextView.getText().toString());
                    if (integer >= 59) {
                        integer = 0;
                        min1TextView.setText("00");
                        min2TextView.setText("00");
                    } else {
                        integer = integer + 1;
                        if (integer < 10) {
                            min1TextView.setText("0" + String.valueOf(integer));
                            min2TextView.setText("0" + String.valueOf(integer));
                        } else {
                            min1TextView.setText(String.valueOf(integer));
                            min2TextView.setText(String.valueOf(integer));
                        }
                    }
                }
            });


            minDecreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer integer = Integer.valueOf(min1TextView.getText().toString());
                    if (integer <= 0) {
                        integer = 59;
                        min1TextView.setText(String.valueOf(integer));
                        min2TextView.setText(String.valueOf(integer));
                    } else {
                        integer = integer - 1;
                        if (integer < 10) {
                            min1TextView.setText("0" + String.valueOf(integer));
                            min2TextView.setText("0" + String.valueOf(integer));
                        } else {
                            min1TextView.setText(String.valueOf(integer));
                            min2TextView.setText(String.valueOf(integer));
                        }
                    }
                }
            });

            hrIncreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer integer = Integer.valueOf(hr2TextView.getText().toString());
                    if (integer == 23) {
                        integer = 00;
                        hr2TextView.setText("0" + String.valueOf(integer));
                        hr1TextView.setText("0" + String.valueOf(integer));
                        if (amPm1TextView.getText().toString().equalsIgnoreCase("AM") && integer == 12) {

                        } else {
                            if (integer > 12) {
                                amPm1TextView.setText("PM");
                                amPm2textView.setText("PM");
                            } else {
                                amPm1TextView.setText("AM");
                                amPm2textView.setText("AM");
                            }
                        }
                    } else {
                        integer = integer + 1;
                        if (integer < 10) {
                            hr1TextView.setText("0" + String.valueOf(integer));
                            hr2TextView.setText("0" + String.valueOf(integer));
                        } else {
                            hr1TextView.setText(String.valueOf(integer));
                            hr2TextView.setText(String.valueOf(integer));
                        }

                        if (amPm1TextView.getText().toString().equalsIgnoreCase("AM") && integer == 12) {

                        } else {
                            if (integer > 12) {
                                amPm1TextView.setText("PM");
                                amPm2textView.setText("PM");
                            } else {
                                amPm1TextView.setText("AM");
                                amPm2textView.setText("AM");
                            }
                        }
                    }

                }
            });

            hrDecreaseBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer integer = Integer.valueOf(hr2TextView.getText().toString());
                    if (integer == 00) {
                        integer = 23;
                        hr1TextView.setText(String.valueOf(integer));
                        hr2TextView.setText(String.valueOf(integer));
                        if (amPm1TextView.getText().toString().equalsIgnoreCase("AM") && integer == 12) {

                        } else {
                            if (integer > 12) {
                                amPm1TextView.setText("PM");
                                amPm2textView.setText("PM");
                            } else {
                                amPm1TextView.setText("AM");
                                amPm2textView.setText("AM");
                            }
                        }
                    } else {
                        integer = integer - 1;
                        if (integer < 10) {
                            hr1TextView.setText("0" + String.valueOf(integer));
                            hr2TextView.setText("0" + String.valueOf(integer));
                        } else {
                            hr1TextView.setText(String.valueOf(integer));
                            hr2TextView.setText(String.valueOf(integer));
                        }

                        if (amPm1TextView.getText().toString().equalsIgnoreCase("AM") && integer == 12) {

                        } else {
                            if (integer > 12) {
                                amPm1TextView.setText("PM");
                                amPm2textView.setText("PM");
                            } else {
                                amPm1TextView.setText("AM");
                                amPm2textView.setText("AM");
                            }
                        }
                    }
                }
            });


            setBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String inputHours = "";
                    Integer integer = Integer.valueOf(hr1TextView.getText().toString());
                    if (amPm1TextView.getText().toString().equalsIgnoreCase("PM") && integer > 12) {
                        if (integer == 13) {
                            inputHours = "01";
                        } else if (integer == 14) {
                            inputHours = "02";
                        } else if (integer == 15) {
                            inputHours = "03";
                        } else if (integer == 16) {
                            inputHours = "04";
                        } else if (integer == 17) {
                            inputHours = "05";
                        } else if (integer == 18) {
                            inputHours = "06";
                        } else if (integer == 19) {
                            inputHours = "07";
                        } else if (integer == 20) {
                            inputHours = "08";
                        } else if (integer == 21) {
                            inputHours = "09";
                        } else if (integer == 22) {
                            inputHours = "10";
                        } else if (integer == 23) {
                            inputHours = "11";
                        } else if (integer == 00) {
                            inputHours = "12";
                        }

                        timeTextView.setText(inputHours + ":" + min1TextView.getText().toString() + " " + amPm1TextView.getText().toString());
                    } else {
                        timeTextView.setText(hr1TextView.getText() + ":" + min1TextView.getText().toString() + " " + amPm1TextView.getText().toString());
                    }
                    timePickerDialog.dismiss();
                    timePickerDialog = null;
                }
            });

            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timePickerDialog.dismiss();
                    timePickerDialog = null;
                }
            });

            timePickerDialog.setCancelable(false);
            timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            timePickerDialog.show();

        }
    }
}
