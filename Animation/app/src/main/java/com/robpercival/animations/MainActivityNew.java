package com.robpercival.animations;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public interface MainActivityNew {
    void fade(View view);

    void onCreate(Bundle savedInstanceState);

    boolean onCreateOptionsMenu(Menu menu);

    boolean onOptionsItemSelected(MenuItem item);
}
