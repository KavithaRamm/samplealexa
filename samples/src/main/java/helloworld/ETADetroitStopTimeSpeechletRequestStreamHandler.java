package helloworld;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class ETADetroitStopTimeSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds = new HashSet<String>();
    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds.add("amzn1.ask.skill.6fa34bf4-05db-4597-93f6-c109870c6204");
    }

    public ETADetroitStopTimeSpeechletRequestStreamHandler() {
        super(new ETADetroitStopTimeSpeechlet(), supportedApplicationIds);
    }

}
