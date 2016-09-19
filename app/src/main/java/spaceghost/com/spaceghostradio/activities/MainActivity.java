package spaceghost.com.spaceghostradio.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spaceghost.com.spaceghostradio.R;
import spaceghost.com.spaceghostradio.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setFragment();
  }

  private void setFragment() {
    FragmentManager fragmentManager = getSupportFragmentManager();
    MainFragment mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.container_main);
    if (mainFragment == null) {
      mainFragment = MainFragment.newInstance("bla", "black");
      fragmentManager.beginTransaction()
          .add(R.id.container_main, mainFragment)
          .commit();
    }

  }

}
