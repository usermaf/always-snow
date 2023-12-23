package de.miraculixx.alwayssnow.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "alwayssnow")
public class AlwaysSnowAutoConfig implements ConfigData {
    public boolean alwaysSnow = true;
    public boolean weatherChange = false;
}
