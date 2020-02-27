package io.vividcode.happyride.dispatcherservice;

import io.eventuate.tram.events.publisher.TramEventsPublisherConfiguration;
import io.eventuate.tram.jdbckafka.TramJdbcKafkaConfiguration;
import io.vividcode.happyride.dispatcherservice.messagehandlers.DispatcherServiceMessageHandlersConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Import({DispatcherServiceMessageHandlersConfiguration.class,
    TramEventsPublisherConfiguration.class,
    TramJdbcKafkaConfiguration.class})
@EnableScheduling
public class DispatcherServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DispatcherServiceApplication.class, args);
  }
}
