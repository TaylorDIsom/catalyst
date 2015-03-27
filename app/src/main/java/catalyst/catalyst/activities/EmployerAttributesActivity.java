package catalyst.catalyst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import catalyst.catalyst.R;
import catalyst.catalyst.presenter.EmployerAttributesPresenter;
import catalyst.catalyst.presenter.LogInViewPresenter;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.EmployerAttributesView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class EmployerAttributesActivity extends Activity implements EmployerAttributesView, View.OnClickListener {
    private ClickListener listener;
    private ToggleButton toggleButton;
    EmployerAttributesPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_attributes);
        toggleButton = (ToggleButton) findViewById(R.id.preferenceButton);
        //toggleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.onClick(v);
    }

    @Override
    public void addSearchRequestNotifyCallback(final ClickListener lsnr) {
        listener = lsnr;
    }

}
