package ir.co.sadad.eb.util.web.listener;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class LoggerStartupListener extends ContextAwareBase implements LoggerContextListener, LifeCycle {

    private static final String DEFAULT_LOG_DIRECTORY = "logs";

    private boolean started = false;

    @Override
    public void start() {
        if (started) return;


        Object logDir = null;
        try {
            logDir = new InitialContext().lookup("log.directory");
        } catch (NamingException e) {
            e.printStackTrace();
        }

        String logDirectory = (String) logDir;


        logDirectory = (logDirectory != null && logDirectory.length() > 0) ? logDirectory : DEFAULT_LOG_DIRECTORY;

        Context context = getContext();

        context.putProperty("LOG_DIR", logDirectory);

        started = true;
    }

    @Override
    public void stop() {
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public boolean isResetResistant() {
        return true;
    }

    @Override
    public void onStart(LoggerContext context) {
    }

    @Override
    public void onReset(LoggerContext context) {
    }

    @Override
    public void onStop(LoggerContext context) {
    }

    @Override
    public void onLevelChange(Logger logger, Level level) {
    }
}
