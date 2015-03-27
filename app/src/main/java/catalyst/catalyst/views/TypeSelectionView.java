package catalyst.catalyst.views;

import catalyst.catalyst.presenter.TypeSelectionViewPresenter;
import catalyst.catalyst.support.ClickListener;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public interface TypeSelectionView {
    void addSearchRequestNotifyCallback(ClickListener listener);

    String getPreference();

    void createEmployer();

    void createJobSeeker();
}
