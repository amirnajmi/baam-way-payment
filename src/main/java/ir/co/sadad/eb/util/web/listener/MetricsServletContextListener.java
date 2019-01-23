package ir.co.sadad.eb.util.web.listener;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;

import ir.co.sadad.eb.util.legacyutil.CsvReporter;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Created by kahmadi on 9/21/2016.
 */
public class MetricsServletContextListener extends MetricsServlet.ContextListener {

    public static final MetricRegistry METRIC_REGISTRY = new MetricRegistry();

    private static final String LOG_PATH = "logs/metrics/";

    private CsvReporter reporter;

    @Override
    protected MetricRegistry getMetricRegistry() {
        return METRIC_REGISTRY;
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);

        reporter = CsvReporter.forRegistry(METRIC_REGISTRY)
                .formatFor(Locale.getDefault())
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build(new File(LOG_PATH));

        reporter.start(1, TimeUnit.MINUTES);


        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        reporter.stop();
        super.contextDestroyed(event);
    }
}
