package com.github.leonardra;

import com.github.leonardra.JhipsterMonolithDemoApp;
import com.github.leonardra.config.AsyncSyncConfiguration;
import com.github.leonardra.config.EmbeddedMongo;
import com.github.leonardra.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterMonolithDemoApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
