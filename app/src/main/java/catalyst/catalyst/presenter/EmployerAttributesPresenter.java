package catalyst.catalyst.presenter;

import android.view.View;

import catalyst.catalyst.models.Model;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.EmployerAttributesView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class EmployerAttributesPresenter implements ClickListener{
    private EmployerAttributesView view;
    private final Model model;

    public EmployerAttributesPresenter(EmployerAttributesView v, Model m) {
        this.view = v;
        this.model = m;
        view.addSearchRequestNotifyCallback(this);
    }


    public void onClick(View v) {

    }
}
