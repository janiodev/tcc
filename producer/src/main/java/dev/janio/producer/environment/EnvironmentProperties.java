package dev.janio.producer.environment;

import java.util.Optional;

public interface EnvironmentProperties {
    Optional<String> getEnvironmentProperties(String key);
}
