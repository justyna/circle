package com.circle;

import com.codahale.metrics.MetricRegistry;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ThinkPad on 28.05.2017.
 */
@Configuration
@EnableMetrics
public class MetricsConfiguration {
    @Autowired
    private MetricRegistry metricRegistry;


}
