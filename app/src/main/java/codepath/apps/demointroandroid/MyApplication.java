import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugsee.launch(this, "8c7e2f6a-c771-48ae-820e-9fbcf6f5f8cf");
    }
}
