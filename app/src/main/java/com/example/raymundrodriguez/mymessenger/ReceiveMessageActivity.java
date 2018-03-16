package com.example.raymundrodriguez.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent(); // Receives intent send from the first activity
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        // Refers to a TextView with the ID message
        TextView messageView = (TextView) findViewById(R.id.message);
        // The TextView then takes in that message and presents it
        messageView.setText(messageText);
    }
}
