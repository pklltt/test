package codepath.apps.demointroandroid;
import com.bugsnag.android.Bugsnag;
import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugsnag.init(this);
    }
}
