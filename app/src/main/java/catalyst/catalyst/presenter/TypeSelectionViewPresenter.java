package catalyst.catalyst.presenter;

import android.view.View;

import catalyst.catalyst.R;
import catalyst.catalyst.models.Model;
import catalyst.catalyst.support.ClickListener;
import catalyst.catalyst.views.LogInView;
import catalyst.catalyst.views.TypeSelectionView;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class TypeSelectionViewPresenter implements ClickListener {

    private TypeSelectionView view;
    private final Model model;

    public TypeSelectionViewPresenter(TypeSelectionView v, Model m) {
        this.view = v;
        this.model = m;
        view.addSearchRequestNotifyCallback(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nextButton:
                String preference = view.getPreference();
                if (preference.equals("Candidates")) {
                    view.createEmployer();
                } else {
                    view.createJobSeeker();
                }
                break;
        }
    }
}
