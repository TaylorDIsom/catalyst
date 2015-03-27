package catalyst.catalyst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import catalyst.catalyst.presenter.LogInViewPresenter;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.TypeSelectionView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class TypeSelectionActivity extends Activity implements TypeSelectionView, View.OnClickListener {

    private ClickListener listener;
    LogInViewPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        presenter.onClick(v);
    }
}
