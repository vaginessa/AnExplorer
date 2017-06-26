package dev.dworks.apps.anexplorer.misc;

import android.content.Context;

import com.cloudrail.si.CloudRail;
import com.cloudrail.si.interfaces.CloudStorage;
import com.cloudrail.si.services.GoogleDrive;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by HaKr on 02/05/17.
 */

public class CloudStorageUtils {

    private final static String CLOUDRAIL_LICENSE_KEY = "5906d306ff21b5017c81f957";
    private static Context sAppContext;
    private static final AtomicReference<CloudStorage> googledrive = new AtomicReference<>();

    public static synchronized void intialize(Context context) {
        sAppContext = context;
        CloudRail.setAppKey(CLOUDRAIL_LICENSE_KEY);

        googledrive.set(new GoogleDrive(context,
                "638240013795-966s147hdhg5o4j2mugs67k64pbitrdt.apps.googleusercontent.com",
                "",
                "com.cloudrail.fileviewer:/oauth2redirect",
                ""));
        ((GoogleDrive) googledrive.get()).useAdvancedAuthentication();
    }

    public static CloudStorage getService(){
        return googledrive.get();
    }
}
