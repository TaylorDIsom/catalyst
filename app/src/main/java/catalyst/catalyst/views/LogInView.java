package catalyst.catalyst.views;

import catalyst.catalyst.support.ClickListener;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public interface LogInView {
    void acceptLogin();
    void addSearchRequestNotifyCallback(ClickListener listener);

}
