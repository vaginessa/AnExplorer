package dev.dworks.apps.anexplorer.cloud;

import com.cloudrail.si.interfaces.CloudStorage;

/**
 * Created by HaKr on 02/05/17.
 */

public class CloudStorageClient{

    private final CloudStorage mCloudStorage;

    public CloudStorageClient(CloudStorage cloudStorage){
        mCloudStorage = cloudStorage;
    }

    public CloudStorage getCloudStorage() {
        return mCloudStorage;
    }
}
