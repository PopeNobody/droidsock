package net.idolon.crashcatch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import cell411.server.R;
import net.idolon.crashcatch.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction().replace(R.id.container, MainFragment.newInstance()).commitNow();
    }
  }
}