package catalyst.catalyst.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import catalyst.catalyst.R;
import catalyst.catalyst.models.Application;
import catalyst.catalyst.presenter.LogInViewPresenter;
import catalyst.catalyst.presenter.TypeSelectionViewPresenter;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.TypeSelectionView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class TypeSelectionActivity extends Activity implements TypeSelectionView, View.OnClickListener {

    private ClickListener listener;
    private ToggleButton toggleButton;
    private Button nextButton;
    TypeSelectionViewPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_selection);
        toggleButton = (ToggleButton) findViewById(R.id.preferenceButton);
        //toggleButton.setOnClickListener(this);
        nextButton = (Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);
        Application app = Application.INSTANCE;
        presenter = new TypeSelectionViewPresenter(this, app.getModel());
    }

    @Override
    public void onClick(View v) {
        presenter.onClick(v);
    }

    @Override
    public void addSearchRequestNotifyCallback(final ClickListener lsnr) {
        listener = lsnr;
    }

    @Override
    public String getPreference() {
        return toggleButton.getText().toString();
    }

    @Override
    public void createEmployer() {
        Intent i = new Intent(this, EmployerAttributesActivity.class);
        startActivity(i);
    }
}
