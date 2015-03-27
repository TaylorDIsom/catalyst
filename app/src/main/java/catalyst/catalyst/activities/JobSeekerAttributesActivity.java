package catalyst.catalyst.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import catalyst.catalyst.R;
import catalyst.catalyst.models.Application;
import catalyst.catalyst.presenter.JobSeekerAttributesPresenter;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.JobSeekerAttributesView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class JobSeekerAttributesActivity extends Activity implements JobSeekerAttributesView, View.OnClickListener{

    private Button addSkillsButton;
    private ClickListener listener;
    JobSeekerAttributesPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_seeker_attributes);
        addSkillsButton = (Button)findViewById(R.id.nextButton);
        addSkillsButton.setOnClickListener(this);
        Application app = Application.INSTANCE;
        presenter = new JobSeekerAttributesPresenter(this, app.getModel());
    }

    @Override
    public void addSearchRequestNotifyCallback(final ClickListener lsnr) {
        listener = lsnr;
    }

    @Override
    public void addSkills() {
        Intent i = new Intent(this, AddSkillsActivity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        presenter.onClick(v);
    }
}
