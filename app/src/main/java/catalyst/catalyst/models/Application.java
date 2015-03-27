package catalyst.catalyst.models;

import android.content.Context;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public class Application {
    public static Application INSTANCE = new Application();
    private CatalystModel model;

    public Application() {

    }

    /**
     * Takes database information and makes it the model
     *
     * @param context Database information
     */

    public void setModel(Context context) {
        this.model = new CatalystModel();

    }

    /**
     * Gets user model
     *
     * @return Model
     */
    public CatalystModel getModel() {
        return model;
    }
}
