package catalyst.catalyst.presenter;

import android.view.View;

import catalyst.catalyst.R;
import catalyst.catalyst.models.Model;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.AddSkillsView;
import catalyst.catalyst.views.EmployerAttributesView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class AddSkillsPresenter implements ClickListener {
    private AddSkillsView view;
    private final Model model;

    public AddSkillsPresenter(AddSkillsView v, Model m) {
        this.view = v;
        this.model = m;
        view.addSearchRequestNotifyCallback(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.doneButton:
                break;
        }
    }
}
