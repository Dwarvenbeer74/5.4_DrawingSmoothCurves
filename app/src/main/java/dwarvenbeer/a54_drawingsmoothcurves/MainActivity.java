package dwarvenbeer.a54_drawingsmoothcurves;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    DrawingView mDrawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawingView = new DrawingView(this, null);
        setContentView(mDrawingView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.clear:
                mDrawingView.clear();
                break;
            case R.id.pick_color:
                Paint paint = mDrawingView.getPaint();
                paint.setColor(Color.GREEN);
                mDrawingView.setPaint(paint);
                break;
        }
        return true;
    }
}
