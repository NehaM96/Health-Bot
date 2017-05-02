package com.docbot.seminar.newproj;


public abstract class Config {
    // copy this keys from your developer dashboard
    public static final String ACCESS_TOKEN = "d6529266b0c54fa39932acf58b4467fe";

    public static final LanguageConfig[] languages = new LanguageConfig[]{
            new LanguageConfig("en", "a11ea1d839e3446d84e402cb97cdadfb"),

    };

    public static final String[] events = new String[]{
            "hello_event",
            "goodbye_event",
            "how_are_you_event"
    };
}
