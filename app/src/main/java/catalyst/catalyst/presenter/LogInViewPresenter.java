package catalyst.catalyst.presenter;

import android.view.View;

import catalyst.catalyst.models.Model;
import catalyst.catalyst.views.LogInView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class LogInViewPresenter {

    private LogInView view;
    private final Model model;

    public LogInViewPresenter(LogInView v, Model m) {
        this.view = v;
        this.model = m;
        //view.addSearchRequestNotifyCallback(this);
    }


    public void onClick(View v) {

    }
}
