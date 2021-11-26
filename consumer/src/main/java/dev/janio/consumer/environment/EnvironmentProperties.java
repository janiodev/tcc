package dev.janio.consumer.environment;

import java.util.Optional;

public interface EnvironmentProperties {
    Optional<String> getEnvironmentProperties(String key);
}
