package catalyst.catalyst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import catalyst.catalyst.R;
import catalyst.catalyst.presenter.AddSkillsPresenter;
import catalyst.catalyst.presenter.EmployerAttributesPresenter;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.AddSkillsView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class AddSkillsActivity extends Activity implements AddSkillsView, View.OnClickListener {


    private ClickListener listener;
    AddSkillsPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_skills);

    }

    @Override
    public void addSearchRequestNotifyCallback(final ClickListener lsnr) {
        listener = lsnr;
    }

    @Override
    public void onClick(View v) {

    }
}
