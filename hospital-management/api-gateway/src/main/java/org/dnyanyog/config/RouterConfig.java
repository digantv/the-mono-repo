package org.dnyanyog.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder
        .routes()
        .route(
            "directory_login_route",
            r -> r.path("/api/v1/directory/validate/**").uri("http://172.18.0.6:8081"))
        .route(
            "directory_add_route",
            r -> r.path("/api/v1/directory/**").uri("http://172.18.0.6:8081"))
        .route("patient_add_route", r -> r.path("/api/v1/patient/**").uri("http://172.18.0.5:8082"))
        .route(
            "appointment_add_route",
            r -> r.path("/api/v1/appointment/**").uri("http://172.18.0.3:8084"))
        .route("case_add_route", r -> r.path("/api/v1/case/**").uri("http://172.18.0.4:8083"))
        .build();
  }
}
