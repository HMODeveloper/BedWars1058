package com.andrei1058.bedwars.configuration;

/** Refresh ordinary listener fields without registering another listener. */
public interface ReloadableConfiguration {
    void refreshConfiguration();
}
