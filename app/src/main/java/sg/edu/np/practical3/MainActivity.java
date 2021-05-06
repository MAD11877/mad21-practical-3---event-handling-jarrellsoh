package sg.edu.np.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user1 = new User();
        Button fButton = findViewById(R.id.Followbtn);
        fButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (user1.isFollowed()) {
                    fButton.setText("Unfollow");
                    user1.setFollowed(false);
                    Toast followed = Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT);
                    followed.show();
                }
                else {
                    fButton.setText("Follow");
                    user1.setFollowed(true);
                    Toast unfollowed = Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT);
                    unfollowed.show();
                }

            }

        });
        Intent in = getIntent();
        String id = in.getStringExtra("id");
        TextView name = findViewById(R.id.Name);
        name.setText("MAD " + id);
    }
}