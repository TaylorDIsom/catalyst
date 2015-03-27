package catalyst.catalyst.presenter;

import android.view.View;

import catalyst.catalyst.models.Model;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.EmployerAttributesView;
import catalyst.catalyst.views.JobSeekerAttributesView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class JobSeekerAttributesPresenter implements ClickListener {
    private JobSeekerAttributesView view;
    private final Model model;

    public JobSeekerAttributesPresenter(JobSeekerAttributesView v, Model m) {
        this.view = v;
        this.model = m;
        view.addSearchRequestNotifyCallback(this);
    }


    public void onClick(View v) {

    }
}
